package c231025.test.java.com.classJava.proxyEx;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Proxy;

import org.junit.Test;

import c231025.main.java.com.classJava.proxyEx.SimpleString;
import c231025.main.java.com.classJava.proxyEx.SimpleStringImpl;
import c231025.main.java.com.classJava.proxyEx.SimpleStringUpper;
import c231025.main.java.com.classJava.proxyEx.ToUpperCaseHandler;

public class SimpleStringTest {
	
	@Test
	public void DecoTest() {
		SimpleString simpleStringImle = new SimpleStringImpl();
		SimpleString simpleString = new SimpleStringUpper();
		((SimpleStringUpper) simpleString).setSimpleString(simpleStringImle);
		assertThat(simpleString.hello("아무개"), is("HELLO 아무개"));
		assertThat(simpleString.intor("아무개"), is("MY NAME IS 아무개"));
		assertThat(simpleString.bye("아무개"), is("BYE 아무개"));
	}
	
	@Test
	public void handlerTest() {
		SimpleString ssProxied = (SimpleString) Proxy.newProxyInstance(
				getClass().getClassLoader(), 
				new Class[] { SimpleString.class }, 
				new ToUpperCaseHandler(new SimpleStringImpl()));
		assertThat(ssProxied.hello("아무개"), is("HELLO 아무개"));
		assertThat(ssProxied.intor("아무개"), is("My name is 아무개"));
		assertThat(ssProxied.bye("아무개"), is("Bye 아무개"));
	}

}
