package pregunta8;

import java.util.Date;

public class Administrator extends User {
	
	public String Name;
	public String Email;

	public Administrator(String Name, String Email, String Userid, String Password, Date RegisterDate) {
		super(Userid, Password, RegisterDate);
		
		this.Name=Name;
		this.Email=Email;
	}
	
}
