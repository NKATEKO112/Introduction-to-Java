import java.util.Random;
import java.util.Scanner;
public class SkotiriEduTrack{
	public static void main(String[] args){
	
	 String[] platform = {"Coursera","Udemy","UnisaOnline","Skillshare","MindTheGap","GetSmarter"};
	 String[] originCoutries = {"United States","Spain","South Africa","United States","England","South Africa"};
	 int[] users = new int[platform.length];
	 int[] ratings = new int[platform.length];
	 
	 populateUser(users);
	 populateRatings(ratings, platform);
	 
	 int indexOfMostUsedP = mostUsedplatform(users);
	 
	 System.out.println(platform[indexOfMostUsedP] + "is the most used with " + users[indexOfMostUsedP] + "users");
	 sortPlatform(platform, originCoutries, ratings, users);
	 displayPlatform(platform, originCoutries, ratings, users);
	 
	}
	public static void populateUser(int[] users)
	{
		Random rand = new Random();
		for(int i=0; i< users.length;i++){
			// Formula: rand.nextInt(max - min + 1) + min
			users[i] = rand.nextInt((500000-100000) + 1) + 100000;
		}
	}
	public static void populateRatings(int[] ratings, String[] platform)
	{
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i< ratings.length; i++){
			System.out.print("Enter rating from 1 - 5 for " + platform[i] + ":");
			ratings[i] = input.nextInt();
		}
	}
	public static int mostUsedplatform(int[] users)
	{
		int indexOfMostUsedP = 0;
		int highestUsers = users[0];
		
		for(int i =1 ; i< users.length; i++)
		{
			if(users[i] > highestUsers)
			{
				highestUsers = users[i];
				indexOfMostUsedP = i;
			}
		}
		return indexOfMostUsedP;
	}
	public static void sortPlatform(String[] platform, String[] originCoutries, int[] ratings, int[] users)
	{
		for(int i = 0; i< platform.length; i++)
			for(int x = 0; x< platform.length-i-1; x++)
		{
			if(platform[x].compareTo(platform[x+1]) > 0)
			{
				String tempP = platform[x];
				platform[x] = platform[x + 1];
				platform[x + 1] = tempP;
				
				String tempC = originCoutries[x];
				originCoutries[x] = originCoutries[x + 1];
				originCoutries[x + 1] = tempC;
				
				int tempR = ratings[x];
				ratings[x] = ratings[x + 1];
				ratings[x + 1] = tempR;
				
				int tempU = users[x];
				users[x] = users[x + 1];
				users[x + 1] = tempU;
				
			}
		}
	}
	public static void displayPlatform(String[] platform, String[] originCoutries, int[] ratings, int[] users)
	{
		System.out.println("Online Learning Platform Summary: ");
		System.out.println("Platform\tCountry\tRatings\tUsers");
		
		for(int i = 0; i < platform.length; i++){
			System.out.println(platform[i] + "\t" + originCoutries[i] + "\t" + ratings[i] + "\t" + users[i]);
		}
	}
}