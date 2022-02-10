package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class SieveofEratosthenes {
	
	public static void eratosthenes(int uInput) {

		int length = 200001;
		boolean[] numbers = new boolean[length];
		numbers[0] = false;
		numbers[1] = false;
		
		for(int i = 2; i<numbers.length; i++) 
			numbers[i] = true;
			
		for(int x = 2; x <numbers.length; x++) {
			
			if(numbers[x]==true && x*x < numbers.length) {
				for(int i = x*x; i<numbers.length; i+=x) 
					numbers[i] = false;	
			}
			else if(numbers[x]==true && x*x > numbers.length)
				break;	
		}
		
		for(int i = 0; i<numbers.length;i++) {
			if(i == uInput && numbers[i] == true) {
				System.out.println(uInput + " is a prime number");
				//System.out.print("i: "+ i +" uInput: "+ uInput);
			}
			else if(i == uInput && numbers[i] == false)
				System.out.println(uInput + " is not a prime number");
		}
	}

	public static void main(String[] args) {
		
		int uInput = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		uInput = sc.nextInt();
		eratosthenes(uInput);

	}

}
