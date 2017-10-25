
public class Lab5_2_SyedNadeem {

	public static void main(String[] args){
		
		//Creates the array which holds the integers as well as n
		int[] integers = {-1, 3, 5, 6, -10};
		int n = 2;
		
		//Calls the method
		greaterThan(integers , n);
		
		
	}
	//This method takes the array and the N.
	public static void greaterThan(int[] arrayInput, int nInput){
		
		
		// This loops to check the array to see which numbers are greater than N.
		for(int i = 0; i<arrayInput.length; i++){
			
			// This checks whether any of the array inputs are greater than N
			if(arrayInput[i]>nInput)
				// This outputs the integers that are greater than N.
				System.out.println(arrayInput[i] + " is greater than " + nInput);
			
			
		}
		
		
	}

}
