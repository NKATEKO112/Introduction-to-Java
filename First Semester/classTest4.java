	import java.util.Scanner;
	public class classTest4{
		public static void main(String[] args)
		{
			String[] membersNames = {"Sello M","Jason P","Lethu A","Banda B","Johnn B","Wicky J"};
			int[] membersAge = {35,42,42,25,32,49};
			
			double[] distanceRun = new double[6];
			
			Scanner kg = new Scanner(System.in);
			for(int i = 0; i < distanceRun.length; i++){
			System.out.print("Enter distance run by " + membersNames[i] + "(in kilometers): ");
			distanceRun[i] = kg.nextDouble();
			}
			
			double avgDistance = calcAvgDistance(distanceRun);
			int fastRunner = determineFastRunner(distanceRun, avgDistance );
			displayMemberDetails(membersNames, membersAge, distanceRun, fastRunner, fastRunner);
			
		}
		
		public static double calcAvgDistance (double[] distanceRun)
		{
			double sum = 0.0;
			for(int i = 0; i < distanceRun.length; i++){
				sum += distanceRun[i];
			}
			
			return sum / distanceRun.length;
		}
		
		public static int determineFastRunner(double[] distanceRun, double avgDistance) 
		{
			int index = -1;
			
			for(int i = 0; i < distanceRun.length; i++){
				if(distanceRun[i] > avgDistance){
					return i;
				}
			}
			
			return index;
		}
		
		public static void displayMemberDetails(String[] membersNames, int[] membersAge, double[] distanceRun, double avgDistance, int fastRunner)
		{
			System.out.println("/n Club Member information");
			for(int i = 0; i < distanceRun.length; i++){
			System.out.print("Name /t"+ membersNames[i] + "Age/t" + membersAge[i]+ "Distance/t" + distanceRun[i] );
			
			System.out.println(membersNames[fastRunner] + "run is above the average distance by Club Members");
			System.out.println("Average Distance Run by cLub members: " + distanceRun[fastRunner]);
			}
		}
	}
	

