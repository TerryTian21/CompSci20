package codes.Lessons;

import java.util.Scanner;

public class ErrorTrappingL6 {

	public static void main(String[] args) throws Exception {
		
		int enteredlevels = 0;
		
		System.out.println("How many levels are in the pyramid");
		Scanner input = new Scanner(System.in);
		
		boolean tryAgain = false;
		
		do {
			
			tryAgain = false;
			
			try 
			{
				enteredlevels = input.nextInt();
			}//try to do this, if there's an error AKA Exception go to catch
			catch(Exception e) //an error report called e
			{
				String garbage = input.next();//strings can accept any input
				tryAgain = true;
			}//since garbage was created in the catch statement
			//when we leave the statement the string garbage doesn't exist and gets destroyed AKA recycled
			
			if(tryAgain == false && (enteredlevels > 20 || enteredlevels < 1))
				tryAgain = true;
			//if the input is good but its outside the given range
		}while(tryAgain == true);
		
		

		System.out.println("Levels: "+enteredlevels);
			

	}

}
