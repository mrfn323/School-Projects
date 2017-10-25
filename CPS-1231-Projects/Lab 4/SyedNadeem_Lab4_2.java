import java.util.Scanner;
public class SyedNadeem_Lab4_2 {

	public static void main(String[] args){
		// Variables for speed, distance, time, and scanner object
		double speed, distance;
		int time;
		Scanner keyboard = new Scanner(System.in);
		
		// Asks user to enter the vehicles speed
		System.out.println("Enter the vehicle's speed: ");
		speed = keyboard.nextDouble();
		
		//Asks user to enter the number of horus the car was moving
		System.out.println("Enter the number of hours the vehicle was in motion: ");
		time = keyboard.nextInt();
		
		// Calculations for the distance.
		distance = speed * time;
		
		// Outputs the data in a chart style
		System.out.println("Hours \tDistance Traveled");
		System.out.println("--------------------------");
		System.out.println(time + "\t" + distance);

	}

}
