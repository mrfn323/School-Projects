import java.util.Scanner; //Imports scanner class
public class LabIII_2_SyedNadeem {

	public static void main(String[] args) {
		
		double speed, distance, time; // Variables
		Scanner keyboard = new Scanner(System.in); //Scanner object
		
		//Asks user for the speed of the vehicle
		System.out.println("Enter the vehicle's speed: "); 
		speed = keyboard.nextDouble();
		
		//Asks user for how long the vehicle was in motion
		System.out.println("Enter the number of hours the vehicle was in motion: ");
		time = keyboard.nextDouble();
		
		// sets up the table in where all the information is being displayed. 
		System.out.print("Hours \t \t");
		System.out.println("Distance");
		System.out.println("-----------------------------");
		
		//loop to do the math
		for (int i = 1; i <= time; i++){
			
			
			distance = i * speed;// Math
			// Displays all the information
			System.out.print(i + "\t\t");
			System.out.println(distance);
		}
		

	}

}
