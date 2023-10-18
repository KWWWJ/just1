package c231006;

public class StudentBean {
	private static final long serialVersionUID = 1934845011;
	private String name;
	private int number;
	
	public StudentBean(){} //꼭 하나는 필요하다
	
	public StudentBean(String name){
		this.name = name;
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setNumber(int number) { 
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
}
