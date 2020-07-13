/*
Angelia
10-4-18
CSCI 1015
Programming Assignment 6
Purpose of this program is to generate population growth after taking user inputs the organism starting number, 
daily percentage increase, and number of days the organisms will multiply. 
*/
import java.util.Scanner;

public class LovelandPass6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int organisms = 0; //Stores the value user sets for organisms
      int numDays = 0; //Stores the value user sets for number of days
		double dayIncrease = 0; //Stores the value user sets for the daily percentage increase	
		int tempNumDays = 0; //Storing numDays without changing value of numDays
      double tempOrganisms = 0; //Storing organisms without changing value of organisms
	   
      //User inputs the starting number of organisms
		System.out.print("Please enter the starting number of organisms: ");
		organisms = sc.nextInt();
		
      //While loop for invalid input and re-entry 
		while(organisms < 2)
		{
			System.out.print("Number Invalid. Must be at least 2. Re-Enter: ");
         organisms = sc.nextInt();
		}
      
      //User inputs the daily percentage increase
		System.out.print("Please enter the daily increase percentage: ");
		dayIncrease = sc.nextDouble();
      
      //While loop for invalid input and re-entry 
		while(dayIncrease < 0)
		{
			System.out.print("Number Invalid. Cannot use negative numbers. Re-Enter: ");
         dayIncrease = sc.nextDouble();
		}
      
      //User inputs how many days the population will multiply 
		System.out.print("Please enter the number of days organisms will multiply: ");
		numDays = sc.nextInt();
		
      //While loop for invalid input and re-entry 
		while(numDays < 1)
		{
			System.out.print("Number Invalid. Must be at least 1. Re-Enter: ");
         numDays = sc.nextInt();
		}
      
      tempNumDays = numDays;
      tempOrganisms = organisms;
      
      System.out.println("Days and Organism Growth");
      System.out.println("---------------------------"); 
      tempNumDays -=1;
      System.out.println("Day " +(numDays-tempNumDays)+ " || Population " +tempOrganisms);
      
      //While loop for the growth calculation
      //At first I created this while loop for the growth calculation, but then decided to try a for loop
      //while(tempNumDays > 0)
      //{
         //tempOrganisms = tempOrganisms + ((dayIncrease / 100) *tempOrganisms);
         //tempNumDays -= 1;
         //System.out.println("Day " +(numDays-tempNumDays)+ " || Population " +tempOrganisms);
      //} 
      
      //For loop for the growth calculation  
      for(int i = numDays - 1; i > 0; i--)
      {
         tempOrganisms = tempOrganisms + ((dayIncrease / 100) *tempOrganisms);
         System.out.println("Day " +(numDays-i + 1)+ " || Population " +tempOrganisms);
      }
	}
}
