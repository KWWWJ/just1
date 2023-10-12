package c231012.user;

public class UserBean {
	// 데이터를 매모리 내에 저장하는 클래스
	private int id;
	private String name;
	private String userId;
	private String password;
	
	public UserBean() {}
	
	public void setId(int id) {this.id = id;};
	public void setName(String name) {this.name = name;};
	public void setUserId(String userId) {this.userId = userId;};
	public void setPassword(String password) {this.password = password;};
	
	public int getId() {return id;};
	public String getName() {return name;};
	public String getUserId() {return userId;};
	public String getPassword() {return password;};
	

}
