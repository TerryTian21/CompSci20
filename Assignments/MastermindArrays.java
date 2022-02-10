package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class MastermindArrays {
	
	public static int[][] solutionSet = new int[4096][4];
	public static boolean[] possible = new boolean[4096];
	
	public static void populate() {
		//Using the eliminate out of place gives you an error because the OutofPlacecounter 
		//always stays at 0
		int row = 0;
		
		//set all to true
		for(int i = 0; i< 4096; i++)
			possible[i] = true;
		
		//create all solutions
		for(int a = 0; a<8;a++) {
			for(int b = 0;b<8;b++)
				for(int c = 0; c<8;c++)
					for(int d = 0; d<8;d++) {
						solutionSet[row][0] = a+1;
						solutionSet[row][1] = b+1;
						solutionSet[row][2] = c+1;
						solutionSet[row][3] = d+1;
						
						
						System.out.print(solutionSet[row][0]);
						System.out.print(solutionSet[row][1]);
						System.out.print(solutionSet[row][2]);
						System.out.println(solutionSet[row][3]);
						
						row++;
					}
		}
	}
	
	public static int torf() {
		
		int guessRow = 0;
		//possible[0] = false;
		
		while(possible[guessRow] == false)
			guessRow++;
		
		return guessRow;
	}
	
	public static void correct(int guessRow, int amountCorrect) {
		
		for(int i = 0; i<4096;i++) {
			int correct = 0;
			
			if(possible[i] == true) 
				for(int x = 0; x<4; x++) {
					if(solutionSet[i][x] == solutionSet[guessRow][x]) 
						correct++;
					if(amountCorrect != correct)
						possible[i] = false;
				}
		}
	}
	
	public static void eliminateOutOfPlace(int guessRow, int amountOutOfPlace) {
		
		for(int i = 0; i<4096;i++) {
			int[] cNextGuess = {solutionSet[i][0],solutionSet[i][1],solutionSet[i][2],solutionSet[i][3]};
			int[] cPreviousGuess = {solutionSet[guessRow][0],solutionSet[guessRow][1],solutionSet[guessRow][2],solutionSet[guessRow][3]};
			int outOfPlace = 0;
			
			if(possible[i] == true) {
				for(int collumn = 0; collumn<4; collumn++) 
					if(cPreviousGuess[collumn] == cNextGuess[collumn]) {
						cNextGuess[collumn] = 0;
						cPreviousGuess[collumn] = 0;
						//clears any in place
					}
				for(int collumnOfPrevious = 0; collumnOfPrevious<4;collumnOfPrevious++) {
					if(cPreviousGuess[collumnOfPrevious] == 0) 
							continue;
					for(int x = 0; x<4;x++) {
						
						if(cPreviousGuess[collumnOfPrevious] == cNextGuess[x]) {
							cNextGuess[x] = 0;
							cPreviousGuess[collumnOfPrevious] = 0;
							outOfPlace++;
							break;//because we do not want to have it count multiple times if there is another same digit
							//the previous guess digits
						}//compares every single digit of the next potential solution with every guess digit	
					}
				}
				
				System.out.println(outOfPlace);//out of place is always 0?
				if(outOfPlace != amountOutOfPlace)
					possible[i] = false;
				//if the amount of Out of places do not match up with the current then eliminate the option
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		populate();
		int correct = 0;
		int outOfPlace = 0;
		Scanner sc = new Scanner(System.in);
		
		do {	
			int guessRow = torf();
			System.out.println(guessRow);
			System.out.println("The next guess is: " + solutionSet[guessRow][0] + solutionSet[guessRow][1] + solutionSet[guessRow][2] + solutionSet[guessRow][3]);
			//Correct?
			System.out.println("How many were correct? ");
			correct = sc.nextInt();
		
			System.out.println("How many were out of place? ");
			outOfPlace = sc.nextInt();
			
			correct(guessRow, correct);
			eliminateOutOfPlace(guessRow, outOfPlace);
			
		}while(correct != 4);
		
	}

}
