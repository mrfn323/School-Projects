/*Written By: Syed Fahad Nadeem
 * Planing Time: ~45 Minutes
 * Coding Time: ~5hr 15min
 * Testing Time: ~1hr 30min
 * Bug Fixing Time: ~2hr 45min
 * 
 * This program takes all of the entries from a note pad provided and turn all of the entries
 * into objects which is then put into an array. The array is then sorted from lowest to highest
 * balance. Finally the sorted array is then arranged into a table which is inside of a report for
 * the user. 
 */
import java.util.*;
import java.io.*;
public class nadeems_Program9 {

	public static void main(String[] args)throws IOException{

		//Calls method to read the file	
		Animal [] list = readFile("Program9.txt");	

		//Calls all of the methods to sort and display the table from lowest to highest balance.
		sortLowToHigh(list);
		createTable(list);

	}

	//Method for reading file
	public static Animal[] readFile(String fileName) throws IOException{

		File file = new File(fileName);
		Scanner reader = new Scanner(file);

		int arrayLength = reader.nextInt();
		Animal [] list = new Animal[arrayLength];

		String name = " ";
		int birthYear = 0;
		int bill = 0;
		String species = " ";
		int legs = 0;
		String blood = " ";
		int count = 0;


		while(reader.hasNext()){

			name = reader.next();
			birthYear = reader.nextInt();
			bill = reader.nextInt();
			species = reader.next();

			if(reader.hasNextInt()){

				legs = reader.nextInt();
				list[count] = new Mammal(name, birthYear, bill, species, legs);
				count++;
			}
			else if(reader.hasNext()){

				blood = reader.next();
				list[count] = new NonMammal(name, birthYear, bill, species, blood);
				count++;
			}


		}

		reader.close();

		return list;

	}

	//Sort calling compareTo in Animal Class
	public static Animal[] sortLowToHigh(Animal[] sortList){

		Arrays.sort(sortList);

		return sortList;

	}

	//This method formats and creates the table
	public static void createTable(Animal[] list){

		//Sets the title for the report based on date.
		Date now = new Date();

		// Dates may vary. Sample output for the first time was 11/4/117
		String sentence = "Animal Report " + (now.getMonth() + 1) + "/" + (now.getDay() + 3) + "/" + (now.getYear() + 1900);

		//Formatting
		for(int i = 0; i<sentence.length() + 2; i++){

			System.out.print("#");
		}

		System.out.println("\n#" + sentence + "#");


		for(int i = 0; i<sentence.length() + 2; i++){

			System.out.print("#");
		}

		System.out.println();

		//Displays Table
		System.out.format("%-12s%-15s%-15s%-15s%-15s", "Name", "Birth Year", "Bill Balance", "Species", "Number of legs/Blood Type");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");

		int count = 0;
		int page = 1;
		for(int i = 0; i<list.length;i++){

			System.out.println(list[i]);
			count++;

			if(count == 40){

				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("End of Page " + page);
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println();

				count = 0 ;
				page++;

			}
		}

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("End of Page " + page);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("-----------------------------------END OF REPORT-------------------------------------");


	}

}

//Main Parent class for Animals.
class Animal implements Comparable<Animal>{

	//Instance Variables
	private String ownerName;
	private int birthYear;
	private int billBalance;
	private String species;

	//Default Constructor
	public Animal(){

		ownerName = " ";
		birthYear = 0;
		billBalance = 0;
		species = " ";

	}

	//Constructor
	public Animal(String ownerName, int birthYear, int billBalance, String species){

		this.ownerName = ownerName;
		this.birthYear = birthYear;
		this.billBalance = billBalance;
		this.species = species;

	}
	//Getters
	public String getOwnerName(){

		return ownerName;

	}

	public int getBirthYearr(){

		return birthYear;

	}

	public int getBillBalance(){

		return billBalance;

	}

	public String getSpecies(){

		return species;

	}

	//Setters
	public void setOwnerName(String replaceOwner){

		ownerName = replaceOwner;

	}

	public void setBirthYear(int replaceYear){

		birthYear = replaceYear;

	}

	public void setBillBalance(int replaceBalance){

		billBalance = replaceBalance;

	}

	public void setSpecies(String replaceSpecies){

		species = replaceSpecies;

	}

	//toString method which puts them in order base on the constructor
	public String toString(String extra){

		return String.format("%-12s%-15d%-15d%-15s%-15s", ownerName, birthYear, billBalance, species, extra);

	}

	//Used to sort from lowest to highest balance
	@Override 
	public int compareTo(Animal o2){

		return new Integer(this.billBalance).compareTo(new Integer(o2.billBalance));

	}

}

//Mammal class for animals that have a certain amount of legs
class Mammal extends Animal{

	//Instance Variable for Mammal
	private int numberOfLegs;

	//Default Constructor for Mammal
	public Mammal(){

		super();
		numberOfLegs = 0;

	}

	//Constructor for Mammal
	public Mammal(String ownerName, int birthYear, int billBalance, String species, int numOfLegs){

		super(ownerName, birthYear, billBalance, species);
		numberOfLegs = numOfLegs;

	}

	//Getter for mammal
	public int getNumberOfLegs(){

		return numberOfLegs;

	}

	//Setter
	public void setNumberOfLegs(int replaceLegs){

		numberOfLegs = replaceLegs;

	}

	//toString Method for Mammal
	@Override
	public String toString(){

		String legs = Integer.toString(numberOfLegs);
		return super.toString(legs);

	}

}

//NonMammal class for animals that have a certain blood type
class NonMammal extends Animal{

	//Instance Variable for Non-Mammal
	private String bloodType;

	//Default Constructor for Non-Mammal
	public NonMammal(){

		super();
		bloodType = " ";

	}

	//Constructor for Non-Mammal
	public NonMammal(String ownerName, int birthYear, int billBalance, String species, String bloodType){

		super(ownerName, birthYear, billBalance, species);
		this.bloodType = bloodType;

	}

	//Getter for Non-Mammal
	public String getBloodType(){

		return bloodType;

	}

	//Setter for Non-Mammal
	public void setBloodType(String replaceBloodType){

		bloodType = replaceBloodType;

	}

	//toString Method for Non-Mammal
	@Override
	public String toString(){

		return super.toString(bloodType);

	}

}
