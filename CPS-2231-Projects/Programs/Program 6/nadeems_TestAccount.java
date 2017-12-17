/* Written By: Syed Fahad Nadeem
 * This test program shows an example of an account being assigned an ID (Hard coded) with
 * it's initial balance and it's interest rate. Then it withdraws and deposits money to show the 
 * withdraw and deposit methods. Finally it adds the monthly interest to the current balance showing the balance
 * after everything is done. 
 * 
 */
public class nadeems_TestAccount {

	public static void main(String[] args) {

		nadeems_Program6 account1 = new nadeems_Program6(1000, 20000.00, .045);

		System.out.println("Creating account with ID: " + account1.getID()+ "\n");
		System.out.println("Inital Balance: $" + String.format("%.2f", account1.getBalance()) + "\n");

		account1.withdrawBalance(2500);
		account1.depositBalance(3000);
		account1.depositBalance(account1.monthlyInterest());

		System.out.println("After transactions the balance is $" + String.format("%.2f", account1.getBalance()));



	}

}
