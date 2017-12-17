/*Written by: Syed Fahad Nadeem
 * 
 * This program asks the user for ten numbers and this 
 * program find the sum of the values, the max and min, 
 * the average, and the numbers that are bellow the average.
 * 
 * */
import java.util.Scanner;
public class nadeems_Program3 {

	public static void main(String[] args) {

		// All the variables 
		double[] numbers;
		double sum, max, min, average, lowest;
		
		// Calls all the methods 
		numbers = createArray();
		sum = calcSum(numbers);
		max = getMax(numbers);
		min = getMin(numbers);
		average = calcAverage(numbers);
		
		// Prints all of the values that the methods returned
		System.out.println("The Sum of the Values are: " + sum);
		System.out.println("The Average of the Values are: " + average);
		System.out.println("The Highest Value is: " + max);
		System.out.println("The Lowest Value is: " + min);
		System.out.println();

		// This method comes after because it is printing within the method. 
		printLower(numbers, average);
	}

	// This Method asks the user for all of the values that needs to be inputed then puts them into an array
	public static double[] createArray(){
		
		//Defines the variables in the method
		double[] numbers = new double[10];
		Scanner keyboard = new Scanner(System.in);

		// This loops add the values into the array.
		for(int i = 0; i<numbers.length; i++){

			System.out.println("Enter value " + (i+1) + ": ");
			numbers[i] = keyboard.nextDouble();
		}

		return numbers; 
	}
	// Calculates the sum of all the values in the array
	public static double calcSum(double[] list){
		double sum = 0;
		
		// This loop add the sum of all of the values in the array.
		for(int i = 0; i<list.length;i++){

			sum = sum + list[i];

		}


		return sum;
	}
	// Gets the max number in the array
	public static double getMax(double[] list){
		double max = list[0];
		
		// This finds the max of the values in the loops. 
		for(int i = 0; i<list.length; i++){

			if(list[i]>max){

				max = list[i];

			}

		}


		return max;
	}
	// Gets the minimum in the array
	public static double getMin(double[] list){
		double min = list[0];

		//This finds the min in the array
		for(int i = 0; i<list.length; i++){

			if(list[i]<min){

				min = list[i];

			}

		}

		return min;
	}
	// This calculates the average of the values in the array
	public static double calcAverage(double[] list){
		double Average;
		double sum = 0;

		// This finds the sum again because this does not take the sum, only the array.
		for(int i = 0; i<list.length; i++){

			sum = sum + list[i];

		}

		// This calculates the average of the sum that was found in the array.
		Average = sum/list.length;

		return Average;
	}
	// This prints all of the values that are bellow the average of the array
	public static void printLower(double[] list, double average){
		double lowest;
		System.out.println("The numbers with values lower than the average are: ");
		
		// This loop prints all the numbers that are bellow average. 
		for(int i = 0; i<list.length; i++){
			
			if(list[i]<average){

				System.out.print(list[i] + " ");

			}

		}

	}

}
