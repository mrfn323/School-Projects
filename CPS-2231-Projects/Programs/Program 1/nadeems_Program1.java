//Project done by: Syed Fahad Nadeem

/* This program asks the user for a starting and ending year 
 * and this program will determine all of the leap years by displaying
 * it to the user as well as display the amount of leap years in 
 * the time period given by the user.*/

// Import scanner class to get user input
import java.util.Scanner;
public class nadeems_Program1 {

	
	public static void main(String[] args) {
		//All of the variables
		int startingYear, endingYear, displayYears, difference, rowsConfig, leapyearAmmount;
		double leapyearCheck, leapyearCheckDouble;
		Scanner keyboard = new Scanner(System.in);
		
		//Asks user for the starting year
		System.out.println("Enter the starting year: ");
		startingYear = keyboard.nextInt();
		
		//Asks user for the ending year
		System.out.println("Enter the ending year: ");
		endingYear = keyboard.nextInt();
		
		/* Setting all of the values so that the loop
		 * can work correctly */
		difference = endingYear - startingYear;
		displayYears = startingYear;
		rowsConfig = 0;
		leapyearAmmount = 0;
		
		//Start of the loop
		for(int i =0;  i<difference; i++){
			
			/* This if statement will keep track of 
			the amount of rows that have been made in a columns.*/
			if(rowsConfig < 10){
				
			/* Since displayYears is equal to the starting year
			 * it will add one until the loop is over.
			 * The loop won't finish until the difference is reaches i */
			displayYears = displayYears + 1;
			
			/*	These two lines of code now checks if the leap year requirements
			 * are meet. Using % if the answer is 0 then the statement is true which
			 * then display the year.*/
			leapyearCheckDouble = displayYears%4;
			leapyearCheck = displayYears%400;
			if(leapyearCheckDouble == 0 || leapyearCheck == 0){
				// This keeps track of all the leap year values 
				leapyearAmmount = leapyearAmmount + 1;
			System.out.print(displayYears);
			
			/* This is all for formatting the way the numbers come out.
			 * This allows for each column to be 10 values and to have
			 * as needed. */
			System.out.print(" ");
			rowsConfig = rowsConfig+ 1;
			
			/* When the Column reaches ten values then
			 * a new row will be made.*/
			if(rowsConfig>=10){
				System.out.println(" ");
				rowsConfig = 0;
				
			}
		
		}
	
	}
	
}
		/* This prints out the final statement which tells the user how 
		 * many leap years are in between the starting and ending years. 
		 * This is done by the leapyearAmmount variable which was calculated
		 * while the leap year requirements were met. */
		System.out.println(" ");
		System.out.println("There are " + leapyearAmmount + " leap years between " + startingYear + " and " + endingYear + "." );
		}
		
		
		
	}


