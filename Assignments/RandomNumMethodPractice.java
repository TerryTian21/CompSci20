package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class RandomNumMethodPractice {
	
	public static int random(int min, int max) {
		
		int randomNumber = (int)Math.abs(Math.random()*(max-min)+1+min);
		return randomNumber;
		
	}

	public static void main(String[] args) {

		
		/*do {
			int min = 0, max = 0;
			System.out.println("max then min");
			Scanner input = new Scanner(System.in);
			max = input.nextInt();
			min = input.nextInt();
			System.out.println(random(min,max));
			counter++;
		}while(counter < 100);
		*/
		
		for(int counter = 0; counter < 100; counter++) {
			
			int min = 0, max = 0;
			System.out.println("max then min");
			Scanner input = new Scanner(System.in);
			max = input.nextInt();
			min = input.nextInt();
			System.out.println(random(min,max));
			counter++;

		}
	}

}
