import java.util.Scanner;
public class ConvertDistance { //start class
	public static void main(String[] args)
	{ //start Main method
	 
	 Scanner keyboaard = new Scanner(System.in);
	 
	 //Declare
	 int iKilometres;
	 int iMetres;
	 int iCentimetres;
	 
	 //input
	 
	 System.out.println("How many kilometres did you cover today? ");
	 iKilometres = keyboard.nextInt();
	 
	 //processing
	 iMetres = iKilometres * 1000;
	 iCentimetres = iMetres * 100;
	 
	 System.out.println("--------------------------------------------------------------");
	 
	 //output
	 
	  System.out.println("Today you covered an equivalent of " + iMetres + " m");
	   System.out.println("This is also equivalent to " + iCentimetres + " cm");
	   
	  
	
	
		}  //end Main method
}  //end class