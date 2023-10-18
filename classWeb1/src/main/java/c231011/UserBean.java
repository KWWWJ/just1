package c231011;

public class UserBean {
	//사실상 규칙이 추가된 VO의 역할을 한다.
	//사용자 정보
	private int id;
	private String name;
	private String userId;
	private String password;
//	private String address;
//	private String phone;
//	private String handphone;
	
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
