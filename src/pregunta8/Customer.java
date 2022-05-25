package pregunta8;

import java.util.Date;

public class Customer extends User {
	
	public String Name;
	public String Adress;
	public String Email;
	public String Customerid;
	public Double AccountBalance;

	public Customer(String Name, String Adress, String Email, String Customerid, Double AccountBalance, String Userid, String Password, Date RegisterDate) {
		super(Userid, Password, RegisterDate);
		this.Name=Name;
		this.Adress=Adress;
		this.Email=Email;
		this.Customerid=Customerid;
		this.AccountBalance=AccountBalance;
	}
	
	

}
