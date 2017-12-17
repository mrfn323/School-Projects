/*Program written by: Syed Fahad Nadeem
 * This program creates a main object in which two other objects will use as the parent object.
 * This program demonstrates how the objects talk to the main one and uses their information 
 * independently.  
 */
import java.util.Date;
import java.util.Scanner;
public class nadeems_Program8 {

	public static void main(String[] args){

		Scanner keyboard  =  new Scanner(System.in);
		double initBalance, initInterest, initFee;
		
		SavingsAccount sAccount1;
		CheckingAccount cAccount1;
		
		//Creation of savings account
		System.out.println("Enter the amount of money to create a savings account: ");
		initBalance = keyboard.nextDouble();
		System.out.println("Enter the interest rate of the savings account: ");
		initInterest = keyboard.nextDouble();
		sAccount1 = new SavingsAccount(initBalance, initInterest);
		
		//Creation of checking account
		System.out.println("Enter the amount of money to create a checkings account: ");
		initBalance = keyboard.nextDouble();
		System.out.println("Enter a monthly fee of the checkings account: ");
		initFee = keyboard.nextDouble();
		cAccount1 = new CheckingAccount(initBalance, initFee);
		
		//Depositing into savings account
		System.out.println("Amount to deposit into the savings account: ");
		double deposit = keyboard.nextDouble();
		sAccount1.depositBalance(deposit);
		
		//Withdrawing from checking account
		System.out.println("Amount to withdraw from the checkings account: ");
		double withdraw = keyboard.nextDouble();
		cAccount1.withdrawBalance(withdraw);
		
		//Calculates the savings and adds it to the balance of the account
		System.out.println("Calculating and adding interest and savings account");
		sAccount1.depositBalance(sAccount1.calculateSavings());
		
		//Calls the deduct fee method to deduct the fee
		System.out.println("Deducting monthly fee from checking account");
		cAccount1.deductFee();;
		
		//Prints out final results
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(sAccount1);
		System.out.println(cAccount1);
		
	}

}

class BankAccount{

	//Instance Variables
	private double balance;
	private Date dateCreated;
	private static int statID = 0;
	private int ID;

	//Constructor
	public BankAccount(){

		balance = 0.0;
		dateCreated = new Date();
		statID++;
		ID = statID;

	}

	public BankAccount(double initBalance){

		balance = initBalance;
		dateCreated = new Date();
		statID++;
		ID = statID;

	}

	//Deposits the balance that is pass through the method
	public void depositBalance(double depositMoney){

		balance = balance + depositMoney;

	}

	//Withdraws the amount of money that is passed through the method
	public void withdrawBalance(double withdrawMoney){

		balance = balance - withdrawMoney;

	}

	//Returns the current balance
	public double getBalance(){

		return balance;

	}

	//Returns the ID of the bank account
	public int getID(){

		return ID;

	}

	//Returns the date the bank account was created
	public Date getDateCreated(){

		return dateCreated;

	}

	//To String method to print everything out in an orderly fashion
	@Override
	public String toString(){

		String temp = "Account ID: " + ID + " Date Created: " + dateCreated + " Balance: " + balance;

		return temp;

	}

}

class SavingsAccount extends BankAccount{

	//Instance Variables
	private double interestRate;

	//Constructors using super() method
	public SavingsAccount(){

		super();
		interestRate = 0.0;

	}

	public SavingsAccount(double initBalance, double initInterestRates){

		super(initBalance);
		interestRate = initInterestRates;

	}

	//Returns the savings based on the balance amount
	public double calculateSavings(){

		return super.getBalance() * interestRate;

	}

	//Allows the user to pass a number to change the interest rate
	public void changeInterest(double changeInt){

		interestRate = changeInt;

	}

	//To String method using the bank account toString plus added interest rate
	@Override
	public String toString(){

		String temp = super.toString() + " Interest Rate: " + interestRate;

		return temp;

	}

}

class CheckingAccount extends BankAccount{

	//Instance Variable
	private double monthlyFee;

	//Constructors
	public CheckingAccount(){

		super();
		monthlyFee = 0.0;

	}

	public CheckingAccount(double initBalance, double initMonthlyFee){

		super(initBalance);
		monthlyFee = initMonthlyFee;

	}

	//Allows the user to pass a number to change the fee for that account
	public void changeFee(double changeFee){

		monthlyFee = changeFee;

	}

	//Returns the amount the fee is to the user
	public double getFee(){

		return monthlyFee;

	}

	//Deducts the fee from the current balance
	public void deductFee(){

		super.withdrawBalance(monthlyFee);

	}
	
	//toString method of the main class with monthly fee added to it
	@Override
	public String toString(){
		
		String temp = super.toString() + " Monthly Rate: " + monthlyFee ;
		return temp;
		
	}

}
