/* Program written by: Syed Fahad Nadeem
 * 
 * This program asks the user how many rows they want in the triangle,
 * then this program takes the user's number and calls two methods to 
 * print the triangle. The first triangle method prints the triangle from
 * top to bottom. The second triangle method prints the triangle from bottom
 * to top.
 * */
import java.util.Scanner;
public class nadeems_Program2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int userInput;

		System.out.println("Enter the number of rows in the triangle: ");
		userInput = keyboard.nextInt();

		printTriangle1(userInput);
		printTriangle2(userInput);

	}

	public static void printTriangle1(int rows){

		int cols = 0;
		System.out.println("Printing Trangle 1");

		for(int i = 0; i<rows; i++){
			System.out.println();
			cols += 1;
			for(int j = 0; j<cols; j++){

				System.out.print("*");

			}
		}
		System.out.println();
	}

	public static void printTriangle2(int rows){

		System.out.println("Printing Trangle 2");
		int cols;
		cols = rows;
		for(int i = 0; i<rows; i++){
			System.out.println();
			cols = cols - 1;

			for(int j = 0; cols >= j; j++){
				System.out.print("*");
			}
		}

	}

}

