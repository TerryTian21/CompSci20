package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class ErrorTrapMethodPractice {

	public static int errortrap(int number1, int number2) throws Exception {
		
		Scanner input = new Scanner(System.in);
		int number = 0, max = 0, min = 0;
		boolean tryAgain = false;
		
		if(number1>number2) {
			max = number1;
			min = number2;	
		}
		else {
			max = number2;
			min = number1;
		}
		
		do {
			tryAgain = false;
			try {
				number = input.nextInt();
				System.out.println("Works");
			}
			catch(Exception e) {
				String garbage = input.next();
				tryAgain = true;
				System.out.println("Error: Wrong type");
			}
				
			if(tryAgain == false && (number>max || number<min)) {
				tryAgain = true;
				System.out.println("Number out of range");	
			}
		
		}while(tryAgain == true);
		
		return number;
		
	}
	
	public static void main(String[] args) throws Exception{
		
		Scanner input = new Scanner(System.in);
		errortrap(10,1);
		
	}

}
