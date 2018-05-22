/* Written by: Syed Fahad Nadeem
 * Name of program: Birthday Sorter
 * Date Completed: March 9th, 2018
 * 
 */

package Project1;

import java.util.Scanner;

import java.io.File;
import java.io.IOException;

public class Birthday {

	//Instance Variables
	private String fName, lName, bdMonth;
	private int bdDay, bdYear, bdTotalDays;

	//Constructors
	public Birthday(){

	}
	public Birthday(String fName,String lName,String bdMonth,int bdDay,int bdYear){

		this.fName = fName;
		this.lName = lName;
		this.bdMonth = bdMonth;
		this.bdDay = bdDay;
		this.bdYear = bdYear;
		calculateDay();

	}

	//Setters and Getters
	public String getfName() {

		return fName;
	}

	public void setfName(String fName) {

		this.fName = fName;
	}

	public String getlName() {

		return lName;

	}

	public void setlName(String lName) {

		this.lName = lName;

	}

	public String getBdMonth() {

		return bdMonth;

	}

	public void setBdMonth(String bdMonth) {

		this.bdMonth = bdMonth;

	}

	public int getBdDay() {

		return bdDay;

	}

	public void setBdDay(int bdDay) {

		this.bdDay = bdDay;

	}

	public int getBdYear() {

		return bdYear;

	}
	public void setBdYear(int bdYear) {

		this.bdYear = bdYear;

	}

	public int getBdTotalDays() {

		return bdTotalDays;

	}

	public void setBdTotalDays(int bdTotalDays) {

		this.bdTotalDays = bdTotalDays;

	}

	//Calculates Days for sorting
	public void calculateDay(){

		if(this.bdMonth.equals("JANUARY")){

			bdTotalDays = 0 + bdDay;

		}
		else if(this.bdMonth.equals("FEBRUARY")){

			bdTotalDays = 31 + bdDay;

		}
		else if(this.bdMonth.equals("MARCH")){

			bdTotalDays = 59 + bdDay;

		}
		else if(this.bdMonth.equals("APRIL")){

			bdTotalDays = 90 + bdDay;

		}
		else if(this.bdMonth.equals("MAY")){

			bdTotalDays = 120 + bdDay;

		}
		else if(this.bdMonth.equals("JUNE")){

			bdTotalDays = 151 + bdDay;

		}
		else if(this.bdMonth.equals("JULY")){

			bdTotalDays = 181 + bdDay;

		}
		else if(this.bdMonth.equals("AUGUST")){

			bdTotalDays = 212 + bdDay;

		}
		else if(this.bdMonth.equals("SEPTEMBER")){

			bdTotalDays = 243 + bdDay;

		}
		else if(this.bdMonth.equals("OCTOBER")){

			bdTotalDays = 273 + bdDay;


		}
		else if(this.bdMonth.equals("NOVEMBER")){

			bdTotalDays = 304 + bdDay;

		}
		else if(this.bdMonth.equals("DECEMBER")){

			bdTotalDays = 334 + bdDay;

		}


	}

	//toString for debugging
	@Override
	public String toString(){

		return fName + " " + lName + " " + bdMonth + " " + bdDay + " " + bdYear + " " + bdTotalDays;

	}

	public int compareTo(Birthday o2){

		return new Integer(this.bdTotalDays).compareTo(new Integer(o2.bdTotalDays));

	}

	//Main method which calls the readFile method
	public static void main(String[] args) throws IOException{

		//		Birthday b1 = new Birthday("joe" , "jos" , "MARCH", 23, 1998);
		//		Birthday b2 = new Birthday("kelly" , "be" , "MARCH", 22, 1998);
		//		System.out.println(b1.compareTo(b2));

		readFile("birthdayInputFile.txt");




	}

	//Reads whatever is on the file and orginizes it
	public static void readFile(String fileName) throws IOException{

		File file = new File(fileName);
		MyArrayList<Birthday> list = new MyArrayList<Birthday>();
		Scanner reader = new Scanner(file);
		Scanner keyboard = new Scanner(System.in);
		int counter = 1;

		//Reads first line for loop. While loop will work as well.
		reader.nextInt();



		System.out.println("Enter the amount of classes you would like to display: ");

		int fullLoop;
		fullLoop = keyboard.nextInt();



		for(int b = 0; b<fullLoop; b++){

			//Formatting the output
			System.out.println();
			System.out.println("Class #" + counter + ":");

			//Clears the list so that it can be reused for each class
			list.clear();

			//Reads how many times the loop need to go for the classes
			int loopCount = 0;
			loopCount = reader.nextInt();
			list.setSize(loopCount);

			//System.out.println("Unsorted");
			for(int j = 0; j<loopCount; j++){

				String fName = reader.next();
				String lName = reader.next();
				String bdMonth = reader.next();
				int bDate = reader.nextInt();
				int bYear = reader.nextInt();

				list.set(j,new Birthday(fName, lName, bdMonth, bDate, bYear));

				//System.out.println(list.get(j).toString());

			}

			System.out.println();
			counter++;
			MyArrayList<Birthday> sortedList = selectionSort(list);

			//				Checks the arrayList to see if its sorted. 				
			//				System.out.println("Sorted");
			//				for(int l = 0; l<sortedList.size();l++){
			//
			//					System.out.println(sortedList.get(l).toString());
			//
			//				}

			int loopCount2 = 0;
			loopCount2 = reader.nextInt();

			/*This loop takes the queried name and checks where they are in the arrayList, 
			 * then checks the person in front or behind them in the sorted */ 
			for(int k = 0; k<loopCount2; k++){

				//Size variable to compare it with the people in the loop
				int sizeCompare = sortedList.size() - 1;
				
				//Resets the loop so it can go through it.
				boolean cont = true;
				
				//Takes the first and last name to be compared with.
				String firstName = reader.next();
				String lastName = reader.next();

			
				int ind = 0;
				
				//This loop checks to see the names in the array and then compares the the position ahead and behind it.
				while(cont)
					if(sortedList.get(ind).getfName().equals(firstName) && sortedList.get(ind).getlName().equals(lastName)){

						if(ind == 0){

							System.out.println(sortedList.get(ind+1).getfName() + " " + sortedList.get(ind+1).getlName() + " has the closest birthday to "+ firstName + " " + lastName);
							cont = false;

						}
						else if(ind == sizeCompare){

							System.out.println(sortedList.get(ind-1).getfName() + " " + sortedList.get(ind-1).getlName() + " has the closest birthday to "+ firstName + " " + lastName);
							cont = false;
						}
						else{

							int calc1;
							int calc2;

							calc1 = sortedList.get(ind).getBdTotalDays() - sortedList.get(ind-1).getBdTotalDays();
							calc2 = sortedList.get(ind+1).getBdTotalDays() - sortedList.get(ind).getBdTotalDays();

							if(calc1<calc2){

								System.out.println(sortedList.get(ind-1).getfName() + " " + sortedList.get(ind-1).getlName() + " has the closest birthday to "+ firstName + " " + lastName);
								cont = false;

							}
							else{

								System.out.println(sortedList.get(ind+1).getfName() + " " + sortedList.get(ind+1).getlName() + " has the closest birthday to "+ firstName + " " + lastName);
								cont = false;

							}


						}

					}

					else{

						ind++;

					}

			}
		}

	}



	//Sorting which sorts by the bdTotalDays.
	public static <E> MyArrayList<Birthday> selectionSort(MyArrayList<Birthday> list){

		for(int i = 0; i<list.size(); i++){

			int minIndex = i;
			for(int j = i+1; j<list.size(); j++){

				if(list.get(j).getBdTotalDays()<list.get(minIndex).getBdTotalDays()){

					minIndex = j;

				}

			}

			if(minIndex != i){
				Birthday temp = list.get(minIndex);
				list.set(minIndex, list.get(i));
				list.set(i, temp);

			}

		}
		return list;


	} 

}








