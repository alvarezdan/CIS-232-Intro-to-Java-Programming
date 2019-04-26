package pkgPathways;
import java.io.*;

//Functionality: 
		//1. Call the loadPassengers() for the Travel object.
		//2. Call the loadTrains() for the Travel object.
		//3. Call login
		//4. Display menu
		//5. display thank you message for using the program

	public class Pathways {
	
	public static void main(String[] args) {  
	
	Travel pathwaymta = null;
	
	try{	pathwaymta = new Travel();
			pathwaymta.loadPassengers();
			pathwaymta.loadTrains();	
			pathwaymta.loadMetrocard();
			pathwaymta.login();
			pathwaymta.displayMenu();}
	
	catch(FileNotFoundException e)
		{	System.out.println("Error: File not found"); }

	catch(IOException e)
		{	System.out.println("Error: Could not load");}
	
	catch(NullPointerException e)
	{	System.out.println("Error: Invalid entry");}
	
	finally
	{	System.out.println("Thank you for using " + pathwaymta.compName);
		System.exit(0);}
	}
	}
