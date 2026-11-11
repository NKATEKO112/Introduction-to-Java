import java.util.Scanner;

public class PhoneCall{
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);

			//declare constant variable
			
		final double	COST_PER_3MINUTE = 0.5;
		final double	COST_PER_4MINUTE = 0.15;
		
			
			//declare 
			int iMins;
			double rCost;
			
			//Input
			
			System.out.println("Duration of call");
			iMins = keyboard.nextInt();
			
		   //Processing
		   
		   rCost = COST_PER_3MINUTE * 3 + COST_PER_4MINUTE * (iMins-3);
		   
		   //Output
		   
		   System.out.println("The total cost is :R " + rCost);
	}
	
	
}

