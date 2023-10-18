package TestBeanJspServlet;

public class Sample {
	
	private String name;
	private int use;
	private boolean test;
	
	public Sample(){} //꼭 하나는 필요하다
	
	public void setName(String name) { 
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setUse(int use) { 
		this.use = use;
	}
	public int getUse() {
		return use;
	}
	

	public void setTest(boolean test) { 
		this.test = test;
	}
	public boolean getTest() {
		return test;
	}

}
