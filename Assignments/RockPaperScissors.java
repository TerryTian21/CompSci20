package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		
		int win = 0;
		int lose = 0;
		int counter = 0;
		int playerChoice1 = 0;
		double computerChoice1 = 0;
		int compmin = 1, compmax = 3;
		int play = 1;
		int startGame = 0;
		int rocks = 1, papers = 1, scissors = 1;
		int cheats = 0;
		
		
		do{
			
			//System.out.println("Play again:"+play);
			System.out.println("Welcome to the Scissors, Rock, Paper game!"); /* outside the play loop so 
			when you tie you don't see this */
			
			//uncomment counter = 0
			
			do{
				System.out.println("===============================");
				System.out.println("\tWins:\t"+win+"\tLoses:\t"+lose);
				System.out.println("===============================");
				System.out.println("What would you like to choose?");
				System.out.println("Enter 1) for Scissors");
				System.out.println("Enter 2) for Rock");
				System.out.println("Enter 3) for Paper");
				//System.out.println("cheats: "+cheats);
				
				Scanner input = new Scanner(System.in);
				playerChoice1 = input.nextInt();
				
				//cheats on
				if(cheats == 0) 
					{
					computerChoice1 = Math.random();
					if(computerChoice1 <= (double)scissors/(rocks+papers+scissors))
						computerChoice1 = 1;
					else if(computerChoice1 >= (1.0 - (double)papers/(rocks+papers+scissors)))
						computerChoice1 = 3;
					else
						computerChoice1 = 2;
					}
				else if(cheats == 1)
					{
					computerChoice1 = Math.random();
					if(playerChoice1 == 1)
						computerChoice1 = 2;
					else if(playerChoice1 == 2)
						computerChoice1 = 3;
					else
						computerChoice1 = 1;
					//System.out.println("computer is cheating");
					}
					
				
				if(playerChoice1 == 1) {
					System.out.println("You have chosen Scissors");
					rocks++;
					}
				else if(playerChoice1 == 2) {
					System.out.println("You have chosen Rock");
					papers++;
					}
				else if(playerChoice1 == 3) {
					System.out.println("You have chosen Paper");
					scissors++;
					}
				//computerChoice1 = (int)(Math.random()*(compmax-compmin+1)+compmin);
				if(computerChoice1 == 1)
					System.out.println("The computer has chosen Scissors");
				else if(computerChoice1 == 2)
					System.out.println("The computer has chosen Rock");
				else if(computerChoice1 == 3)
					System.out.println("The computer has chosen Paper");
			
				//player chooses scissors
				if(playerChoice1 == 1 && computerChoice1 == 1)
					{
					System.out.println("It's a tie! Starting another round.\n");
					//play--;
					}
				else if(playerChoice1 == 1 && computerChoice1 == 2)
					{	
					System.out.println("You lose!");
					play--;
					lose++;
					counter = 0;
					}			
				else if(playerChoice1 == 1 && computerChoice1 == 3)
					{
					System.out.println("You win!");
					play--;
					win++;
					counter++;
					}
				
				//player chooses rock
				if(playerChoice1 == 2 && computerChoice1 == 1)
					{
					System.out.println("You win!");
					play--;
					win++;
					counter++;
					}
				else if(playerChoice1 == 2 && computerChoice1 == 2)
					{	
					System.out.println("It's a tie! Starting another round.\n");
					//play--;
					}			
				else if(playerChoice1 == 2 && computerChoice1 == 3)
					{
					System.out.println("You lose!");
					play--;
					lose++;
					counter = 0;
					}
				
				//player chooses paper
				if(playerChoice1 == 3 && computerChoice1 == 1)
					{
					System.out.println("You lose!");
					play--;
					lose++;
					counter = 0;
					}
				else if(playerChoice1 == 3 && computerChoice1 == 2)
					{	
					System.out.println("You win!");
					play--;
					win++;
					counter++;
					}			
				else if(playerChoice1 == 3 && computerChoice1 == 3)
					{
					System.out.println("It's a tie! Starting another round.\n");
					//play--;
					}
				
				//computer cheats on
				if (counter == 3) 
					cheats = 1;
				else if(counter == 0)
					cheats = 0;
					
					
				
			}while(play == 1);

			
			if(play == 0)
			{
				System.out.println("Do you want to play again?");
				System.out.println("Enter 1) for Yes");
				System.out.println("Enter 2) for No");
				Scanner endgame = new Scanner(System.in);
				startGame = endgame.nextInt();
				
				if(startGame == 1)
					play = 1;
				else
				{				
					System.out.println("Total Wins:"+win+"\nTotal Losses:"+lose);
					System.exit(0);
				}
			}
			
			
		}while(play == 1);

	}

}
