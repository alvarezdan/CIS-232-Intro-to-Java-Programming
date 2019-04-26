package pkgSplit;

import java.util.Scanner;

public class TabSplitter {
	
	public static void main(String[] args)
	{
		char choice;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the TabSplitter App!");
		do
		{
			System.out.println("Enter the total amount of the bill: ");
			double a = input.nextInt();
			
			System.out.println("You have entered: $" + a + ". How many ways would you like to split this amount?");
			double b = input.nextInt();
			
			double c = (a/b); 
			double d = (c * .15);
			double e = (c * .18);
			double f = (c * .20);
			double g = (c + d);
			double h = (c + e);
			double i = (c + f);
			String nasc = String.format("%.2f", c);
			String nasg = String.format("%.2f", g);
			String nash = String.format("%.2f", h);
			String nasi = String.format("%.2f", i);
			
			System.out.println();
			System.out.println("The amount each person must pay is: $" + nasc);
			System.out.println("If you would like to add a tip: "
								+ "\n$" + nasg + " is the total amount with a 15% tip, "
								+ "\n$" + nash + " is the total amount with a 18% tip, and "
								+ "\n$" + nasi + " is the total amount with a 20% tip.");
			System.out.println("Would you like to try again? (yes or no)");	
			choice = input.next().charAt(0);
		}
		
		while ((choice == 'y')|| (choice == 'Y'));
		System.out.println("Thanks for using this program. Have a great day!");
	}
}

