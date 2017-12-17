/*Program Written By: Syed Fahad Nadeem
 * Test program testing the methods in the nadeems_Bank class
 */
import java.util.Scanner;
public class nadeems_TestBank {

	public static void main(String[] args) {
		
		//Object creation
		Scanner keyboard = new Scanner(System.in);
		nadeems_Bank Bank1 = new nadeems_Bank();

		//This creates the accounts starting off with the starting balance. (Hard coded at 5 account)
		for(int i= 0; i<5; i++){

			double balance;
			System.out.println("Enter a Balance");
			balance = keyboard.nextDouble();
			Account s1 = new Account(balance);
			Bank1.addAccount(s1);

		}

		//Displays all of the information including the bank accounts.
		System.out.println(Bank1);
		System.out.println("The total balance in the bank is " + Bank1.getTotalBalance());
		System.out.println("The account with the highest balance in the bank is \n" + Bank1.getMaxBalance());

	}

}
