package pkgDealership;
import java.io.*;

public class SalesSystem {

public static void main(String[] args) {

Dealership dealer = null;

try {	dealer = new Dealership();
	
		dealer.saleslogin();
		dealer.loadCars();
		dealer.customerlogin();
		dealer.displayCars();
		dealer.wantSR
		dealer.wantbackupcam();
		dealer.calcComm();
		dealer.carPrice();
	}

catch(FileNotFoundException e)
	{	System.out.println("Error:File not found, program terminated");
		System.exit(0);}

catch(IOException e)
	{	System.out.println("Error: Could not read from input, program terminated");
		System.exit(0);}

catch(NumberFormatException e)
	{	System.out.println("Error: Invalid vehicle choice, program terminated");
		System.exit(0);}

finally{
	System.out.println("Files loaded.");}


	System.out.println("Thank you for using " + dealer.getcompName();
	System.exit(0);

	dealer.displayCars();
	dealer.wantSR();
	dealer.wantbackupcam;
	dealer.calcComm();
	dealer.carprice();
	}
}