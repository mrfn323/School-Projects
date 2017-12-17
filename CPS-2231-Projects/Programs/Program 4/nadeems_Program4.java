import java.util.Scanner;

/* Written by: Syed Fahad Nadeem and Curtis Neal
 * This program takes a Matrix and determines whether 
 * a matrix that the user inputs is a Markox Matrix or not. 
 */
public class nadeems_Program4 {

	public static void main(String[] arg){

		double [][] matrix = new double[3][3];
		
		matrix = createArray();
		boolean Markox = isMarkoxMatrix(matrix);

		if(Markox == true){
			
			System.out.print("It is a Markox Matrix");
			
		}
		else if (Markox == false){
			
			System.out.println("It is not a Markox Matrix");
			
		}
		



	}
	//This Method Creates the array
	public static double [][] createArray()
	{
		Scanner reader = new Scanner (System.in);
		double [][] Matrix = new double [3][3];
		System.out.println("Enter a 3x3 matrix by row: ");

		for (int row = 0; row < Matrix.length; row++)
		{
			for (int col = 0; col < Matrix.length; col++)
				Matrix[row][col] = reader.nextDouble();
		}
		return Matrix;

	}

	// This method first checks is all the values in the array are greater then one
	public static boolean isMarkoxMatrix(double [][] matrix){

		double sum, check;
		boolean choice = true;

		System.out.println("Sum of the collums");
		for(int cols = 0; cols<matrix.length; cols++){
			sum = 0;
			for(int rows = 0; rows<matrix.length;rows++){

				sum = sum + matrix[rows][cols];

			}
			System.out.print(sum + " ");
			if(sum != 1.0){

				choice = false;

			}
		}

		if(choice == true){

			for(int rows = 0; rows<matrix.length;rows++){

				for(int cols = 0; cols<matrix[rows].length; cols++){

					check = matrix[rows][cols];
					if(check < 0){

						choice = false;

					}

				}

			}

		}
		System.out.println();
		return choice;
	}

}
