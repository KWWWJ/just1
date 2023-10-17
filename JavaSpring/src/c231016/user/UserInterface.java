package c231016.user;

public interface UserInterface {
	/**
	 * use only select in DB
	 **/
	public void setId(int id);
	/**
	 * use only select in DB
	 **/
	public void setName(String name);
	public void setUserId(String userId);
	public void setPassword(String password);
	
	public int getId();
	public String getName();
	public String getUserId();
	public String getPassword();
}