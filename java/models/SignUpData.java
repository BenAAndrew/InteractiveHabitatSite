package model;

public class SignUpData extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
    
	public String uniqueid;
	public String firstname;
	public String lastname;
	public String email;
	public String getFirst_name() {
		return firstname;
	}
	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}
	public String getLast_name() {
		return lastname;
	}
	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String password;
}