import java.util.Scanner;

public class Library{
	
	public static void main(String[] args)
	
	{
		Scanner keyboard = new Scanner(System.in);
	
	//declare a constant variable
	final double FINE_PER_DAY = 0.5;
	
	//declare
	int iNumBook,iNumDays;
	double rFine;
	
	//Input
	System.out.println("How many books:");
	 iNumBook = keyboard.nextInt();
	 
	 System.out.println("How many days:");
	 iNumDays = keyboard.nextInt();
	 
	//Processing
	
	rFine = iNumBook * iNumDays * FINE_PER_DAY;
	
	//Output
	
	System.out.println("The fine is R " + rFine);
	
	
	
	
	}
	
	
	
	
	
}
	
	
	
	