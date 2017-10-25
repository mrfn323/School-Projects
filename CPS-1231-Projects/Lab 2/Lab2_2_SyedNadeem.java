import java.util.Scanner; //Imports the Scanner 
public class Lab2_2_SyedNadeem {

	public static void main(String[] args) 
	{
	
		// Variables for all of the numbers
		int checksWritten;
		final double bankFee = 10;
		double pricePerCheck, totalPrice;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Asks user to but the number of checks written
		System.out.println("Enter the number of checks written this month: ");
		checksWritten = keyboard.nextInt();
		
		// Determines what price to put per check
		if (checksWritten >= 60)
			pricePerCheck = .04;
		else if (checksWritten >= 40)
			pricePerCheck = .06;
		else if (checksWritten >= 20)
			pricePerCheck = .08;
		else 
			pricePerCheck = .1;
		
		// Calculates the total Price
		totalPrice = bankFee + (checksWritten * pricePerCheck);
		
		// Displays the total price with the formatting
		System.out.printf("The total fee are $%,.2f" , totalPrice);
		
		

	}

}
