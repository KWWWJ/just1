package c231025.test.java.com.classJava.proxyEx;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void test() throws Exception{
		String name = "아무개";
		assertThat(name.length(), is(3));
		Method method = String.class.getMethod("length");
		assertThat(method.invoke(name), is(3));
		
		assertThat(name.indexOf("무"), is(1));
		method = String.class.getMethod("indexOf", String.class);
		assertThat(method.invoke(name, "무"), is(1));
	}
}
