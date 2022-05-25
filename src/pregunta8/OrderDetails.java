package pregunta8;

public class OrderDetails {
	
	public String OrderId;
	public String ProductId;
	public String ProductName;
	public int Quantity;
	public Double UnitCost;
	public Double Total;
	
	public <Int> OrderDetails(String OrderId, String ProductId, String ProductName, Int Quantity, Double UnitCost, Double Total) {
	this.OrderId=OrderId;
	this.ProductId=ProductId;
	this.ProductName=ProductName;
	this.Quantity=(int) Quantity;
	this.UnitCost=UnitCost;
	this.Total=Total;
	}
}
