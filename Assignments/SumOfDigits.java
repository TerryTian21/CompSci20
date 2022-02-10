package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int SOD(int number) {
		
		int sum = 0;
		
		do {
			
			//how to print out last digit
			//System.out.println(number%10);
			sum = sum + Math.abs(number%10);
			number = Math.abs(number/10);
			//System.out.println("number"+number);
			//System.out.println("=============");
			
		}while(number > 0);
		
		System.out.println("sum: "+sum);
		return number;
	}
	
	public static void main(String[] args) {
		
		int number;
		int sum;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		//System.out.println(number);
		SOD(number);
		

	}

}
