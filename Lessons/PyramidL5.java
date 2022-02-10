package codes.Lessons;

import java.util.Scanner;

public class PyramidL5 {

	public static void main(String[] args) {
		
		int enteredlevels = 0;
		
		System.out.println("How many levels are in the pyramid");
		Scanner input = new Scanner(System.in);
		enteredlevels = input.nextInt();
		System.out.println("Levels: "+enteredlevels);
			
		for(int printlevels = 1; printlevels <= enteredlevels; printlevels++)
		{
			for(int spaces = 0; spaces < enteredlevels-printlevels; spaces++)
			{
				System.out.print(" ");
			}
			
			for(int stars = 0; stars < 2*printlevels-1; stars++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}

	}

}
