package pkgDealership;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Dealership
	{	Car cars [];
		Salesperson crew[];
		Customer clients[];
		int carindex;
		int salesindex;
		int custindex;
		int paytype;
		float carrprice;
		int totalcars;
		float totalSales;
		private String compName;
		BufferedReader reader;
		
		
		Dealership()
		{	compName = "Bikini Bottom Car Dealership";
			cars = new Car[5];
			crew = new Salesperson[3];
			clients = new Customer[3];
			
			carindex = 0;
			custindex = 0;
			salesindex = 0;
			
			paytype = 0;
			carprice = 0.00f;
			reader = new BufferedReader(new InputStreamReader(System.in));}
		
	public String getcompName() 
	{	return compName;}
		
	public void setcompName(String compName) 
	{	this.compName = compName;}
	
	//method to load cars and read from Cars text file
	void loadCars() throws FileNotFoundException, IOException
		{	try {	BufferedReader inputFile = new BufferedReader(new FileReader("Cars.txt")); 
				String make = "", model = "", vin ="", color ="", price="", satradio="", backupcam="", year ="", line = "";
				int i = 0;
				
				line = inputFile.readLine();
				
				while (line != null)
				{	StringTokenizer st = new StringTokenizer(line,",");
					make = st.nextToken();
					model = st.nextToken();
					vin = st.nextToken();
					color = st.nextToken();
					price = st.nextToken();
					satradio = st.nextToken();
					backupcam = st.nextToken();
					year = st.nextToken();
					
					cars[i] = new Car(make, model, Integer.parseInt(vin), color, Float.parseFloat(price), Boolean.parseBoolean(satradio),Boolean.parseBoolean(backupcam), Integer.parseInt(year));
					i++;
					line = inputFile.readLine();}
				inputFile.close();
				
				System.out.println("Load 'Cars' complete.");}
				
				catch(FileNotFoundException e)
				{	System.out.println("Error: File cannot be found." +e.getMessage());}
				
			catch(IOException e)
				{	System.out.println("Error: Something went wrong." +e.getMessage());}
		}
	
	//method to process and write new sales
	void sellCars(int salesindex, int vin, int numSold, float price)
	{	BufferedWriter outputFile = new BufferedWriter(new FileWriter("saleslist.txt", true));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date date = new Date();
		totalcars += numSold;
		totalSales += price;
		
		outputFile.write(cars[salesindex].vin + "," + numSold + "," + price + "," + dateFormat.format(date));
		
		outputFile.flush(); 
		outputFile.close();
	}
	
	void saleslogin()throws IOException
	{	int logincode = 0;
		int salesindex = -1;
		
		System.out.print("Enter your sales ID: ");
		logincode = Integer.parseInt(reader.readLine());
		for(int i = 0; i < crew.length; i++)
		{ 	if(logincode == crew[i].getSalesid());
			salesindex = i;
		}
			if (salesindex == -1)
				System.out.print("Invalid Login");
				System.exit(0);
		}
	void customerlogin()throws IOException
	{	int logincode = 0;
		int custindex = -1;
		System.out.print("Enter the customer ID: ");
		logincode = Integer.parseInt(reader.readLine());
		for(int i = 0; i < clients.length; i++)
		{ 	if(logincode == clients[i].getCustid());
			custindex = i;
		}
			if (custindex == -1)
				System.out.print("Invalid ID #");
				System.exit(0);
	}

	void calcPayments() throws IOException
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

	
	//variables
	int choice = 0;
	float carprice = 0;
	{
	
	//add features if selected
	carprice = cars[choice].features();
	
	//salesperson commission
	crew.calcComm(carprice);
	
	//price depending on customer choice
	clients.calcPayments(carprice);
	
	System.out.println("Thank you " + Customer.clients + " for your purchase");
	}
}