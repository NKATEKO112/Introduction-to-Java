import java.util.Scanner;
public class Salary{
	
	public static void main(String[] args)
	{
		Scanner exotic = new Scanner(System.in);
		
		//declare constant variable
		final double CHARGE_PER_5HOUR = 100;
		final double ADDITIONAL_HOURS = 0.15;
		final double VAT = 0.225;
		
		//variables
		
		int iHoursWorked;
		double rGrossSalary,rTax,rNetSalary,TAX;
		
		//input
		
		//System.out.print("Please enter the number of hours worked:");
		System.out.println("Please enter the number of hours worked: ");
		iHoursWorked = exotic.nextInt();
		
		//Processing
		
		rGrossSalary = (CHARGE_PER_5HOUR * 5) + (CHARGE_PER_5HOUR + CHARGE_PER_5HOUR * ADDITIONAL_HOURS) * (iHoursWorked-5);
		TAX = rGrossSalary * VAT;
		rNetSalary = rGrossSalary - TAX;
		
		//Output
		
		System.out.println("R "+ rGrossSalary);
		System.out.println("R "+ TAX);
		System.out.println("R "+ rNetSalary);
	}
		
		
}
	
	