import java.util.Scanner;

public class runLengthEncoding {
	
	public static void main (String [] args)
	{	
		System.out.println("Type some numbers: ");
		
		Scanner x = new Scanner(System.in);

		String input = x.nextLine();
			
			int len = input.length();
			int i = 0;
			int occurences = 0;
			char store = input.charAt(0);
			
			String outputString = "";
			for(;i<len;i++)
			{
				if(i+1<len)
				{
					if(input.charAt(i) == input.charAt(i+1))
					{
						occurences++;
					}
					else
					{
						outputString = outputString + Integer.toHexString(occurences+1) + store;
						occurences = 0;
						store = input.charAt(i+1);
					}	
				}
				else
				{
					outputString = outputString + Integer.toHexString(occurences+1) + store;
				}
			}
			System.out.println("Your new line is: " + outputString);
		}
	}


