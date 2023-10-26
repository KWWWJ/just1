package c231026.main.java.com.classJava.board.service;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.util.PatternMatchUtils;

public class TransactionPointcut extends NameMatchMethodPointcut {
	public void setMappedClassName(String mappedClassName) {
		this.setClassFilter(new SimpleCalssFilter(mappedClassName));
	}
	
	public static class SimpleCalssFilter implements ClassFilter{
		private String mappedClassName;
		public SimpleCalssFilter(String SimpleCalssFilter) {
			this.mappedClassName = SimpleCalssFilter;
		}
		@Override
		public boolean matches(Class<?> targetClass) {
			// TODO Auto-generated method stub
			return PatternMatchUtils.simpleMatch(mappedClassName, targetClass.getSimpleName());
		}
		
	}
}
