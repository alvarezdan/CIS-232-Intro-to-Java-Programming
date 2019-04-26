package pkgDealership;
import java.io.*;

//make all private
public class Car 
{	private String make;
	private String model;
	int vin;
	private String color;
	private static float price;
	private char satradio;
	private char backupcam;
	private int year;
	static BufferedReader reader;
	
	public Car(String make2, String model2, int parseInt, String color2, float parseFloat, boolean parseBoolean,
			boolean parseBoolean2, int parseInt2) {
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static float getPrice() {
		return price;
	}

	public static void setPrice(float price) {
		Car.price = price;
	}

	public char getSatradio() {
		return satradio;
	}

	public void setSatradio(char satradio) {
		this.satradio = satradio;
	}

	public char getBackupcam() {
		return backupcam;
	}

	public void setBackupcam(char backupcam) {
		this.backupcam = backupcam;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static BufferedReader getReader() {
		return reader;
	}

	public static void setReader(BufferedReader reader) {
		Car.reader = reader;
	}


	//Display cars
	int displayCars(Car [] cars) throws IOException
	{	int choice = 0;
		System.out.println("We have the following cars:" );
		for(int n = 0; n<cars.length; n++)
		{	System.out.println((n+1)+ "." + cars[n].color + " " + cars[n].make + " " + cars[n].model);}
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(reader.readLine());
				if (choice < 1 || choice > 5)
				{System.out.println("Invalid choice");}
		return choice-1;
	}
	
	//Features selection
	float features() throws IOException
	{	String wantsat = "x"; //add $1000
		String wantbuc = "x"; //add $1000
		System.out.print("Do you want sattelite radio in your vehicle: (Y/N)?");
		wantsat = reader.readLine();
		System.out.print("Do you want a backup camera in your vehicle: (Y/N)?");
		wantbuc = reader.readLine();
			
			if (wantsat.equals("Y"))
			{price += 1000.00f;}
		
			if (wantbuc.equals("Y"))
			{price += 1000.00f;}
		return price;
	}
}