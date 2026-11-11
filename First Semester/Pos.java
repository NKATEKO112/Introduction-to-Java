import java.util.Scanner;
public class Pos{
	
	public static void main(String[] args)
	{
		Scanner exotic = new Scanner(System.in);
		
		//Declare
		int iQuantity;
		double rPrice, rTotalCost;
		
		//Input
		System.out.print("Enter quantity of items:");
		iQuantity = exotic.nextInt();
		
		System.out.print("Enter the price per item:");
		rPrice = exotic.nextDouble();
		
		//Processing
		
		rTotalCost = rPrice * iQuantity;
		
		//Output
		
		System.out.println("Total cost R" + rTotalCost);
		
		
		
		

		}
}


