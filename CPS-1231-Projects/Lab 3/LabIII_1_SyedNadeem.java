import java.util.Scanner; // Imports Scanner class so that the user can type
public class LabIII_1_SyedNadeem {
	
	public static void main(String[] args) {
	
	int userNum, total = 0; // variables to hold the numbers
	Scanner keyboard = new Scanner(System.in); //Scanner object
	
	// Asks the user to enter a number
	System.out.println("Enter a positive nonzero number: "); 
	userNum = keyboard.nextInt();
	
	// Loop that adds all of the integers together
	for (int i = 0; i <= userNum; i++){
		
		total = total + i; //math
		
	}
	// Outputs the total
	System.out.println("The sum of all of the integers from 1 through " + userNum + " is " + total);
	
	}
	
	
}


