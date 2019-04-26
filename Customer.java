package pkgDealership;
import java.io.*;
//- add getters and setters
public class Customer {
	
	private int custid; 
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCarvin() {
		return carvin;
	}

	public void setCarvin(int carvin) {
		this.carvin = carvin;
	}

	private String custname;
	private int carvin;
	
	Customer()
	{	custid = 0;
		custname = "";
		carvin = 0;
	}
			
	Customer(int c1, String c2, int c3)
	{	custid = c1;
		custname = c2;
		carvin = c3;
	}
	
	// Add interest
	void calcPayments(float carprice) throws IOException
	{	float monthly = 0.00f;
		float intrate = .07f; //interest rate
		int term = 60;
		String finance = "Y";
		
		System.out.println("Do you want to finance this vehicle?");
		finance = reader.readLine();
		
		//decision depending on customer finance selection
		if(finance.equals("Y"))
		{	carprice += carprice * intrate;
			monthly = carprice / term;
			System.out.println(("Your monthly payment is $" + monthly));
		}
		else
		{	System.out.println("The payment due today is $" + carprice + ".");}
	}
}