import java.util.Scanner;
public class Convertion{
	
	public static void main(String[] args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		//Declare Constant
		
		final int iHOURSPERDAY = 24;
		final int iMINUTESPERDAY = 60;
		
		
		
		//Declare
		
		int iHours,iDays,iMinutes;
		
		//Input
		
		System.out.print("Enter the total number of minutes:");
		iMinutes = kb.nextInt();
		
		//Processing
		
		iDays = iMinutes / iMINUTESPERDAY / iHOURSPERDAY;
		iHours = iMinutes / iMINUTESPERDAY % iHOURSPERDAY; 
		iMinutes = iMinutes % iMINUTESPERDAY;
		
	   //Output
	   
	   System.out.println("Days: " + iDays);
	   System.out.println("Hours: " + iHours);
	   System.out.println("Minutes: " + iMinutes);
	   
	 
		
		
	}
}

