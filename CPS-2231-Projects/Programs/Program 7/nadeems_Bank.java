/*Program Written By: Syed Fahad Nadeem
 * This program creates a bank object when requested using the addAccount method.
 * Other methods includes getNumberOfAccounts which returns the number of account in "Bank" Array.
 * This also includes a method which calculates all of the balances in the Bank array as well as 
 * a method which can return the high balance out of all of the accounts in the array. A toString 
 * method is also included which returns all of the account in the Bank array associated to the class.
 */
public class nadeems_Bank {

	//Instance variables
	private Account[] Bank= new Account[20];
	private int numberOfAccounts=0;

	//Default Constructors
	public nadeems_Bank(){

		Bank = new Account[20];
		numberOfAccounts = 0;

	}

	//Accessor
	public int getNumberOfAccounts(){

		return numberOfAccounts;

	}

	//Add Accounts
	public void addAccount(Account addAccount){

		Bank[numberOfAccounts] = addAccount;
		numberOfAccounts++;
	}

	public void addAccount(double initBalance){

		Account createNew = new Account(initBalance);
		Bank[numberOfAccounts] = createNew;
		numberOfAccounts++;

	}

	//Getting total of all of the balances in all accounts
	public double getTotalBalance(){

		double total = 0;
		for(int i = 0; i<numberOfAccounts; i++){

			total = total + Bank[i].getBalance();

		}

		return total;

	}

	//Returns the Account with the highest balance
	public Account getMaxBalance(){

		Account max = Bank[0];
		for(int i= 0; i<numberOfAccounts; i++){

			if(Bank[i].getBalance()>max.getBalance()){

				max=Bank[i];

			}

		}

		return max;

	}

	//toString Method
	public String toString(){

		String bankString = "";

		for(int i = 0; i<numberOfAccounts;i++){

			bankString += Bank[i] + "\n";

		}

		return bankString;

	}

}
