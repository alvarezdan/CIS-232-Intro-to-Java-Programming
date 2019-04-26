package pkgDealership;

//make all private - add getters and setters
public class Salesperson {
	
	private int salesid; 
	private String salesname; 
	private float salescomm;

	public int getSalesid() {
		return salesid;
	}

	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}

	public String getSalesname() {
		return salesname;
	}

	public void setSalesname(String salesname) {
		this.salesname = salesname;
	}

	public float getSalescomm() {
		return salescomm;
	}

	public void setSalescomm(float salescomm) {
		this.salescomm = salescomm;
	}

	Salesperson()
	{	salesid = 0;
		salesname = "";
		salescomm = 0.00f;
	}
	
	Salesperson(int s1, String s2, float s3)
	{	salesid = s1;
		salesname = s2;
		salescomm = s3;
	}
	
	// Calculate Commission
	void calcComm(float carprice)
	{	float earnings;
		earnings = carprice * salescomm;
		System.out.println("You earned $" + earnings);
	}

}