
public class Lab5_1_SyedNadeem {

	public static void main(String[] args) {
		
		//Arrays with the employee ids and their pay
		int[] employees = {1 ,2, 3};
		double[] grossPay = {5000.0 , 5500.0, 6000.0};
		
		//The loop that displays all the information
		for (int i = 0; i<employees.length; i++){
			
			//This prints out the employees id
			System.out.print("The employee with id " + employees[i]);
			// This prints out the gross pay of that employee
			System.out.printf(" made $%.1f ", grossPay[i]);
			// This caused the next line. 
			System.out.println("");
			
		}
		
		
		
		

		
	}

}
