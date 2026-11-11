import java.util.Scanner;
public class Age
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Declare
		int iCurrentYear, iYearBorn, iAge;
		
		//Input
		
		System.out.print("Please enter the current year:");
		iCurrentYear = keyboard.nextInt();
		System.out.print("Please enter your birth year:");
		iYearBorn = keyboard.nextInt();
		
		//Processing
		
		iAge = iCurrentYear - iYearBorn;
		
		//Output
		
		System.out.println("By the end of this year you will be " + iAge + " years old");
	}
}