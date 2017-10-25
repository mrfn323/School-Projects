import java.util.Scanner;
public class SyedNadeem_Lab4_1 {

	public static void main(String[] args) {
		
		// Variables to hold the scores, average, and Scanner object.
		double score1, score2, score3, score4, score5, average;
		char letterScore1, letterScore2, letterScore3, letterScore4, letterScore5, letterAverage;
		Scanner keyboard = new Scanner(System.in);
		
		//asks user for test grades
		System.out.println("Enter the first score: ");
		score1 = keyboard.nextDouble();
		
		System.out.println("Enter the second score: ");
		score2 = keyboard.nextDouble();
		
		System.out.println("Enter the third score: ");
		score3 = keyboard.nextDouble();
		
		System.out.println("Enter the fourth score: ");
		score4 = keyboard.nextDouble();
		
		System.out.println("Enter the fifth score: ");
		score5 = keyboard.nextDouble();
		
		// calculates the average test score
		average = calcAverage(score1, score2, score3, score4, score5);
		
		// assigns a letter to each score
		letterScore1 = determineGrade(score1);
		letterScore2 = determineGrade(score2);
		letterScore3 = determineGrade(score3);
		letterScore4 = determineGrade(score4);
		letterScore5 = determineGrade(score5);
		letterAverage = determineGrade(average);
		
		
		// Outputs all of the letter grades, test average, and letter grade average
		System.out.println("Test 1: " + letterScore1);
		System.out.println("Test 2: " + letterScore2);
		System.out.println("Test 3: " + letterScore3);
		System.out.println("Test 4: " + letterScore4);
		System.out.println("Test 5: " + letterScore5);
		System.out.println("Average test score: " + average);
		System.out.println("Average letter grade " + letterAverage);
		
		
		
	

	}
	// Method for finding the average
	public static double calcAverage(double s1, double s2, double s3, double s4, double s5){
		
		double a;
		
		// Math for the average
		a = (s1 + s2 + s3 + s4 + s5) / 5;
		
		return(a);
		
		
	}
// Method for finding the number
	public static char determineGrade(double l){
		char letterGrade;
		// determines the score's letter grade
		if (l >= 90)
			letterGrade = 'A';
		else if (l >= 80)
			letterGrade = 'B';
		else if (l >= 70)
			letterGrade = 'C';
		else if (l >= 60)
			letterGrade = 'D';
		else 
			letterGrade = 'F';
		return(letterGrade);
	}
}
