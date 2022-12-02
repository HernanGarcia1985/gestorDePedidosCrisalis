package entity;

public class User {
	private int id;
	private String email;
	private String userName;
	private String password;
	private int id_roles;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getId_roles() {
		return id_roles;
	}



	public void setId_roles(int id_roles) {
		this.id_roles = id_roles;
	}



	public User (int id, String email, String userName, String password) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.id_roles = 1;
	}
	

}