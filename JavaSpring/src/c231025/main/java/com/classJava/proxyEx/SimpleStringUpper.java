package c231025.main.java.com.classJava.proxyEx;

public class SimpleStringUpper implements SimpleString{
	private SimpleString simpleString;
	
	public void setSimpleString(SimpleString simpleString) {
		this.simpleString = simpleString;
	}

	public String hello(String name) {
		return simpleString.hello(name).toUpperCase();
	}

	public String intor(String name) {
		return simpleString.intor(name).toUpperCase();
	}
	
	public String bye(String name) {
		return simpleString.bye(name).toUpperCase();
	}
}
