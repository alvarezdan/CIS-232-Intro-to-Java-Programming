package pkgPathways;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Travel {

	BufferedReader br;
	String compName;
	Passenger passenger[];
	Train train[];
	MetroCard mcard[];
	MetroCard newmetroCard[];
	private int cardCounter;
	private int cardindex;
	private int passindex;
	private int trainindex;
	private int cardnumber;
	private float sales;
	public int trainIndex;
	private Date Date(String depart_Time) {return null;}
	
	Travel()
	{	br = new BufferedReader(new InputStreamReader(System.in));
		compName = "Group 1 MTA Project";
		passenger = new Passenger[10];		//customers(passengers) array
		train = new Train[8];				//train array
		mcard = new MetroCard [3];			//metrocard array
		newmetroCard = new MetroCard[10];	//new metrocards that are sold
		cardCounter = 0;
		cardindex = -1;
		passindex = -1;
		trainindex = -1;
		sales = 0.00f;	}
			
	//Methods:
		//load passengers
		void loadPassengers() throws FileNotFoundException, IOException
		{	BufferedReader inputFile = new BufferedReader(new FileReader("/Users/Danny/eclipse-workspace/prjFinal/Passengers.txt")); 
			String passengerId = "", passName = "", passCCNum ="", passTIN="";
			int i = 0;
			
			String line = inputFile.readLine();
			
			while (line != null)
			{StringTokenizer st = new StringTokenizer(line,","); //StringTokenizer separates each token (String) based on the delimiter (comma)

			passengerId = st.nextToken();
			passName = st.nextToken();
			passCCNum = st.nextToken();
			passTIN = st.nextToken();
			passenger[i] = new Passenger(Integer.parseInt(passengerId), passName, Long.parseLong(passCCNum), Integer.parseInt(passTIN));
			i++; //update the index for the line in the file
			line = inputFile.readLine();	}
			
			inputFile.close(); //close the file
	
		System.out.println("Passengers have loaded successfully.");}
		
		
		//load trains
		
		void loadTrains() throws IOException
		{	BufferedReader inputFile = new BufferedReader(new FileReader("/Users/Danny/eclipse-workspace/prjFinal/Train.txt")); 
			String trainNumber = "", depart_Station ="", arrival_Station ="", borough_Code = "", depart_Time="", arrival_Time="";
			int i = 0;
			
			String line = inputFile.readLine();
				
			while (line != null)
				{StringTokenizer st = new StringTokenizer(line,","); 
				trainNumber = st.nextToken();
				depart_Station = st.nextToken();
				arrival_Station = st.nextToken();
				borough_Code = st.nextToken();
				depart_Time = st.nextToken();					
				arrival_Time = st.nextToken();
				train[i] = new Train(trainNumber, depart_Station, arrival_Station, Integer.parseInt(borough_Code), Date(depart_Time), Date(arrival_Time));
				i++; //update the index for the line in the file
				line = inputFile.readLine();}
		
				inputFile.close(); //close the file
				
			System.out.println("Trains have loaded successfully.");}
		
		//load metroCards
		void loadMetrocard() throws FileNotFoundException, IOException
		{	BufferedReader inputFile = new BufferedReader(new FileReader("/Users/Danny/eclipse-workspace/prjFinal/Metrocard.txt")); 
			String metroNum = "", metroPrice, cardtype = "";
			int i = 0;
			
			String line = inputFile.readLine();
			
			while (line != null)
				{StringTokenizer st = new StringTokenizer(line,","); //StringTokenizer separates each token (String) based on the delimiter (comma)
				metroNum = st.nextToken();
				metroPrice = st.nextToken();
				mcard[i] = new MetroCard(Integer.parseInt(metroNum),Float.parseFloat(metroPrice),cardtype);
				i++; //update the index for the line in the file
				line = inputFile.readLine();}
				
				inputFile.close(); //close the file
		
		System.out.println("Metrocards have loaded successfully.");}
	
	
	
		//login message
		/*void login() throws IOException
			{	BufferedReader inputScreen = new BufferedReader(new InputStreamReader(System.in));
				DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
				Date date = new Date();
				int passid = 0, numattempts = 0;
				boolean match = false;
				
				System.out.println("Welcome to " + compName);
				System.out.println("Todays date is: " + dateFormat.format(date));
				do
				{	System.out.print("Enter your Passenger ID #: ");
					passid = Integer.parseInt(inputScreen.readLine());
						for(int i=0;i<passenger.length;i++)
						{	
							if ((passenger[i].getPassengerID()==passid))
							{	passindex = i;
								match = true;
								break;	}
						
							if(passindex == -1)
							{	System.out.println("Error: You have entered an invalid ID - please try again.");}	
								numattempts++;	}
				}while(numattempts <3 && !match);
				
						if (!match)
							{	System.out.println("You have exceeded the number of atempts for this session - try again later.");
								System.exit(0);	
							}
			}*/
		
		
		void login() throws IOException
		{	BufferedReader inputScreen = new BufferedReader(new InputStreamReader(System.in));
			DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
			Date date = new Date();
			int passid = 0, numattempts = 0; 
			int ynlogin = 0;
			boolean match = false;
			
			System.out.println("Welcome to " + compName);
			System.out.println("Todays date is: " + dateFormat.format(date));
			System.out.println("Would you like to log into your account? Press 1 for yes and 2 for no");
			ynlogin = Integer.parseInt(inputScreen.readLine());
			if login = 1;
				{	
			
			do
			{	System.out.print("Enter your Passenger ID #: ");
				passid = Integer.parseInt(inputScreen.readLine());
					for(int i=0;i<passenger.length;i++)
					{	
						if ((passenger[i].getPassengerID()==passid))
						{	passindex = i;
							match = true;
							break;	}
					}
						if(passindex == -1)
						{	System.out.println("Error: You have entered an invalid ID - please try again.");	
							numattempts++;}
			}while(numattempts <3 && !match);
			
					if (!match)
						{	System.out.println("You have exceeded the number of atempts for this session - try again later.");
							System.exit(0);	
						}
		}
		
		//display menu
		void displayMenu() throws IOException
		{	BufferedReader inputScreen = new BufferedReader(new InputStreamReader(System.in));
			int choice = -1;
			System.out.println("Welcome " + passenger[passindex].getPassname() + "\nSelect from the following options:");
				
				System.out.println("1. For Travel Planner");
				System.out.println("2. To purchase a MetroCard");
				System.out.println("3. To exit the program");
				choice = Integer.parseInt(inputScreen.readLine());
				if(choice == 1)
					{	processTravel();	
					}
				else if(choice == 2)
					{	purchaseMetroCard();	
					}
				else if (choice == 3) 
					{	System.out.println("Thank you for using our program!");
						System.exit(0);		
					}
				else	{	System.out.println("Error: Invalid menu choice, please try again.");
						displayMenu();	}
				}
		
			
		//process travel
		void processTravel() throws IOException
		{	BufferedReader inputScreen = new BufferedReader(new InputStreamReader(System.in));
			int pickupchoice = -1, dropchoice = -1, numattempts = 0;
			System.out.println("These are the pickup and dropoff stations: ");
			
			for(int i=0; i<train.length;i++)
			{	System.out.println((i+1) + ". " + (train[i].getTrainNumber()) + " train at " + train[i].getDepart_Station()); }
				
				System.out.print("Select a starting location: ");
				pickupchoice = Integer.parseInt(inputScreen.readLine());
				
				if (pickupchoice <1 || pickupchoice > (train.length+1) && numattempts <3);
				{	System.out.println("Error: Invalid choice - try again");
					pickupchoice = -1;	processTravel();}
				while ((pickupchoice <1 || pickupchoice >(train.length+1)) && numattempts <3);
				if(pickupchoice == -1)
				{	System.out.println("You have exceeded the number of atempts for this session - try again later.");
					System.exit(0);	}
				
				numattempts = 0;
				
				do
				{	System.out.print("Select a dropoff location: ");
				dropchoice = Integer.parseInt(inputScreen.readLine());
				
				
				if (dropchoice <1 || dropchoice >(train.length+1))
				{	System.out.println("Error: Invalid choice - try again");
					dropchoice = -1;	
					numattempts++;	}
				
				
				if(dropchoice == -1)
				{	System.out.println("You have exceeded the number of atempts for this session - try again later.");
					System.exit(0);	}
				
				numattempts = 0;
				
				
				
				if (pickupchoice == dropchoice)
				{	System.out.println("starting location and dropoff location can't be the same - try again.");
					displayMenu();	}}
				
			while((dropchoice <1 || dropchoice >(train.length+1)) & numattempts <3);
		}
				
				
				
		

		//purchase MetroCard
void purchaseMetroCard() throws NumberFormatException, IOException
{	float price = 0f;
	int choice = 0;
	String cardtype = "";
	
	cardnumber++;
	
	System.out.print("We have the following cards: \n1 - SingleRide = $2.75 \n2 - 7-Day Unlimited = $31 \n3 - 30-Day Unlimited = $116.50");
	System.out.print("\nOf the choices, which would you like to purchase? ");
	choice = Integer.parseInt(br.readLine());
	
	switch(choice)
	{	case 1:
		{	price = 2.75f;
			cardtype = "SingleRide";
			break;	}
		case 2:	
		{	price = 31f;
			cardtype = "7-Day Unlimited";
			break;	}
		case 3:
		{	price = 116.5f;
			cardtype = "30-Day Unlimited";
			break;	}
		default:
		{	System.out.println("Error: Invalid choice");
			displayMenu();	}
		
		cardCounter++; 
		sales += price;
		System.out.println("Thank you for your purchase!");
		
		newmetroCard[cardCounter] = new MetroCard(++cardnumber, price,cardtype);
		cardCounter++;
		displayMenu();	}
	}
//write the sales	
void writeSales() throws FileNotFoundException,IOException
{	BufferedWriter outputFile1 = new BufferedWriter(new FileWriter("Metrocards.txt", true));
BufferedWriter outputFile2 = new BufferedWriter(new FileWriter("sales.txt", true));
DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
Date date = new Date();

		for(int i = 0; i <newmetroCard.length; i++) 
		{	System.out.println(newmetroCard[i].getMetroNum() + "," + newmetroCard[i].getMetroPrice()+","+newmetroCard[i].getType());
			outputFile1.write(newmetroCard[i].getMetroNum() + "," + newmetroCard[i].getMetroPrice()+","+newmetroCard[i].getType());	
			outputFile1.newLine();
		
			
			outputFile2.write("\n");
			outputFile2.write("\n" + cardCounter + "," + sales + "," + dateFormat.format(date) );
		}
			outputFile1.flush();
			outputFile1.close();
			outputFile2.flush();
			outputFile2.close();
}
					
	}
	

	
