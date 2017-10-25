import java.util.Scanner; //Imports the Scanner Class
public class Lab_2_1_SyedNadeem {

	public static void main(String[] args)
	{
		
		double score1, score2, score3, averageScore; // Hold the test score and Average
		
		Scanner keyboard = new Scanner(System.in);
		
		// Asks user to input their test Score
		System.out.println("Enter Test Score #1: ");
		score1 = keyboard.nextDouble();
		
		System.out.println("Enter Test Score #2: ");
		score2 = keyboard.nextDouble();
		
		System.out.println("Enter Test Score #3: ");
		score3 = keyboard.nextDouble();
		
		// Averages the Score and Displays it
		averageScore = (score1 + score2 + score3) / 3;
		System.out.println("Average Score: " + averageScore);
		
		// Determines which letter grade they recieve. 
		if (averageScore < 60)
			System.out.println("Letter grade: F");
		else if (averageScore < 70)
			System.out.println("Letter grade: D");
		else if (averageScore < 80)
			System.out.println("Letter grade: C");
		else if (averageScore < 90)
			System.out.println("Letter grade: B");
		else 
			System.out.println("Letter grade: A");
		
		

	}

}
