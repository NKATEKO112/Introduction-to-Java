import java.util.Scanner;
public class CalculateAverage{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	//declare variables
	String sName;
	int Mark1, Mark2, Mark3;
	double avg;
	
	//input
	System.out.println("Enter the Name of the student:");
	sName = keyboard.nextLine();
	
	
	System.out.println("Enter the mark for PPA:");
	Mark1 = keyboard.nextInt();
	
	
	System.out.println("Enter the mark for COH:");
	Mark2 = keyboard.nextInt();
	
	
	System.out.println("Enter the mark for CFA:");
	Mark3 = keyboard.nextInt();
	//processing
	
	double avg = (Mark1+Mark2+Mark3)/3;
	
	//output
	System.out.println(sName+" scored an average of " + avg);
		
		
	}
}