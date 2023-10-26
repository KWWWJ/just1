package c231026.test.java.com.classJava.proxyEx;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.Test;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import c231025.main.java.com.classJava.proxyEx.SimpleString;
import c231025.main.java.com.classJava.proxyEx.SimpleStringImpl;

public class DynamicProxyTest {
	// joinPoint : 프록시가 적용될 수 있는 메서드를 의미한다.
	// pointCut : 프록시가 적용될때 패턴에 따라 잘라내는 것.
	// advice : 익명클래스를 실행 시키는 코드.
	// adviser : 실행해주는 것. advice와 pointCut을 합쳐 부른다.(다른 언어에서는 Aspect라 람.)
	public static class UppercaseAdvice implements MethodInterceptor{

		@Override
		public Object invoke(MethodInvocation invocation) throws Throwable {
			// TODO Auto-generated method stub
			String ret = (String) invocation.proceed();
			return ret.toUpperCase();
		}
	}
	
	@Test
	public void proxyFactoryBean() {
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(new SimpleStringImpl());
		pfBean.addAdvice(new MethodInterceptor() {
			// 익명 클래스
			@Override
			public Object invoke(MethodInvocation invocation) throws Throwable {
				// TODO Auto-generated method stub
				String ret = (String) invocation.proceed();
				return ret.toUpperCase();
			}
		});
		SimpleString proxiedSS = (SimpleString) pfBean.getObject();
		assertThat(proxiedSS.hello("아무개"), is("HELLO 아무개"));
		assertThat(proxiedSS.intro("아무개"), is("MY NAME IS 아무개"));
		assertThat(proxiedSS.bye("아무개"), is("BYE 아무개"));
	}
	
	@Test
	public void pointcutAdvisor() {
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(new SimpleStringImpl());
		
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.setMappedName("*o");
		
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new UppercaseAdvice()));
		
		SimpleString proxiedSS = (SimpleString) pfBean.getObject();
		assertThat(proxiedSS.hello("아무개"), is("HELLO 아무개"));
		assertThat(proxiedSS.intro("아무개"), is("MY NAME IS 아무개"));
		assertThat(proxiedSS.bye("아무개"), is("Bye 아무개"));
	}
	
	@Test
	public void classNamePointcutAdvisor() {
		NameMatchMethodPointcut classMethodPointcut = new NameMatchMethodPointcut() {
			public ClassFilter getClassFilter() {
				return new ClassFilter() {
				@Override
				public boolean matches(Class<?> targetClass) {
					// TODO Auto-generated method stub
					return targetClass.getSimpleName().startsWith("SimpleStringI");
					}
				};
			}
		};
		classMethodPointcut.setMappedName("*o");
		
		cheackAdvisor(new SimpleStringImpl(), classMethodPointcut, true);
		
		class SimpleStringTest extends SimpleStringImpl{}
		cheackAdvisor(new SimpleStringTest(), classMethodPointcut, false);
		
		class SimpleStringIsTest extends SimpleStringImpl{}
		cheackAdvisor(new SimpleStringIsTest(), classMethodPointcut, true);
	}

	private void cheackAdvisor(Object targt, Pointcut pointcut, boolean isAdvisced) {
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(targt);
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new UppercaseAdvice()));
		
		SimpleString proxiedSS = (SimpleString) pfBean.getObject();
		if(isAdvisced) {
			assertThat(proxiedSS.hello("아무개"), is("HELLO 아무개"));
			assertThat(proxiedSS.intro("아무개"), is("MY NAME IS 아무개"));
			assertThat(proxiedSS.bye("아무개"), is("Bye 아무개"));
		}else {
			assertThat(proxiedSS.hello("아무개"), is("Hello 아무개"));
			assertThat(proxiedSS.intro("아무개"), is("My name is 아무개"));
			assertThat(proxiedSS.bye("아무개"), is("Bye 아무개"));
		}
	}
}