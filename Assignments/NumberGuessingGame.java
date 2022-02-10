package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) throws Exception{
		
		int number = 0, guess = 0, highScore = 0;
		int min = 1, max = 1;
		int correct = 0, wrong = 0;
		int level = 1;
		int playAgain = 1;
		boolean error = false;
		Scanner input = new Scanner(System.in);
		Scanner endgame = new Scanner (System.in);
		
		System.out.println("Welcome to the Number Guessing Game.");
		
		while(playAgain == 1) {
			number = (int)(Math.random()*(max - min + 1) + min);
				
			for(int trys = 1; trys <= 3;) {
				do {
					error = false;
					System.out.println("\n\tLevel "+level+" starting. . .\n============================================");
					System.out.println("Highscore: "+highScore);
					System.out.println("============================================");
					System.out.println("I am thinking of a random number from "+min+" to "+max);
					System.out.println("Please make a guess at what it is.");
					//System.out.println("Number: "+number);
					System.out.println("Correct: "+correct+", Wrong: "+wrong);
					//System.out.println("trys "+trys);
					try {
						guess = input.nextInt();
					}
					catch(Exception e) {
						String garbage1 = input.next();
						error = true;
					}
					if(error == false && (guess > level || guess < 1))
						error = true;
					if(error == true)
						System.out.println("An error has occurred");
				}while(error == true);
	
				if(guess == number) {
					System.out.println("Congratulations!\nYou have successfully guessed the number.");
					System.out.println("The difficulty will now be adjusted.\nYou have advanced a level.");
					System.out.println("Your lives have been refilled!");
					if(level > highScore)
						highScore = level;
					max++;
					correct++;
					level++;
					break;
				}
				else if(guess != number && trys < 3) {
					System.out.println("You did not correctly guess the number.");
					System.out.println("You have used "+trys+" lives, "+(3-trys)+" lives remaining");
					System.out.println("Better luck next time.");
					wrong++;
					trys++;
				}
				else if (guess != number && trys == 3){
					System.out.println("You did not correctly guess the number.\nYou have ran out of lives");
					System.out.println("The difficulty will now be adjusted.\nIf you continue you will be sent back a level");
					max--;
					wrong++;
					level--;
					trys++;
				}
				
				if(level >= 10) {
					if((double)Math.abs(number - guess)/level <= 0.10 && (double)Math.abs(number - guess)/level > 0)
						System.out.println("\nYou are within 10% of the number.");
					else if(Math.abs(number - guess)/level <= 0.20 && (double)Math.abs(number - guess)/level > 0.10)
						System.out.println("\nYou are within 20% of the number.");
					else {
						System.out.println("\nYour guess is very cold");
					}
				}
				else {
					if(Math.abs(number - guess) <= 3 && Math.abs(number - guess) > 1)
						System.out.println("Your guess is warm.");
					else if(Math.abs(number - guess) <= 1 && Math.abs(number - guess) > 0)
						System.out.println("Your guess is very hot.");
					else {
						System.out.println("Your guess is very cold.");
					}
				}
				
			}
			System.out.println("============================================");
			System.out.println("\nDo you want to continue?\nClick 1)Yes 2)No");
			do {				
				error = false;
				try {
					playAgain = endgame.nextInt();
				}
				catch(Exception e) {
					String garbage2 = input.next();
					error = true;
				}
				if(error == false && (playAgain > 2 || playAgain < 1))
					error = true;
				if(error == true)
					System.out.println("An error has occurred");
			}while(error == true);
			
		}
		
	}

}
