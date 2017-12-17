/* Written By: Syed Fahad Nadeem
 * This program creates instance variables that hold an id, balance, interest rate, and the date.
 * This program also allows for the retrieval of each of these variables and the modification in the form 
 * of depositing and withdrawing. This also calculates the monthly interest using the balance by multiplying 
 * the balance and the interest rate. 
 */
import java.util.Date;
public class nadeems_Program6 {

	//Instance Variables 
	private int id;
	private double balance;
	private double interestRate;
	private Date dateCreated;

	//Default Constructors
	public nadeems_Program6(){

		id = 0;
		balance = 0.0;
		interestRate = 0.0;
		dateCreated = new Date();

	}

	//Main Constructor: Sets all of the initial values
	public nadeems_Program6(int id, double balance, double interestRate){

		this.id = id;
		this.balance= balance;
		this.interestRate= interestRate;
		dateCreated = new Date();

	}

	//Accessor Methods (Getters)
	//Returns the id that is assigned
	public int getID(){

		return id;

	}

	//Returns the balance assigned to the variable 
	public double getBalance(){

		return balance;

	}

	//Returns what the interest rate is
	public double getInterestRate(){

		return interestRate;

	}

	//Returns what the date was when the object was created
	public Date getDate(){

		return dateCreated;

	}

	//Subtracts the value from the balance
	public void withdrawBalance (double withdraw){

		balance = balance - withdraw;

	}

	//Adds the value to the balance
	public void depositBalance (double deposit){

		balance = balance + deposit;

	}

	// Calculate Monthly Interest by multiplying the balance and the interest rate.
	public double monthlyInterest(){

		return balance * interestRate;

	}

	// Just testing all of the variables
	/*
	public String toString(){

		String stringBalance = String.format("%.2f", balance);
		String stringInterestRate = String.format("%.3f", interestRate);
		String stringMonthlyInterest = String.format("%.2f", monthlyInterest());

		return ("ID: " + id + ", Balance: $" + stringBalance + ", Interest Rate: " + stringInterestRate + ", Monthly Interest: $" + stringMonthlyInterest + ", Date Created: " + dateCreated);
	
	}
	*/
}
