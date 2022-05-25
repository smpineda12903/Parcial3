package pregunta8;

import java.util.Date;

public class User {
	
	public String Userid;
	private String Password;
	public Date RegisterDate;
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	public User(String Userid, String Password, Date RegisterDate) {
		this.Userid=Userid;
		this.Password=Password;
		this.RegisterDate=RegisterDate;
	}

}
