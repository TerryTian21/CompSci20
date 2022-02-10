package codes.Lessons;

public class WhileLoopL3 {

	public static void main(String[] args) {
		
		int number =0;
		int min = 1, max = 10;
		
		System.out.println("The number is "+number);
		
		
		//Looping
		while(number < 10) //no semi colon here unlike the do while below because it ends the command and we don't want that here
		{
			System.out.println("Tony is the best");
			number++;
			
		}
		
		
		//the cousin of a while loop
		do {
			
			System.out.println("Tony is the best");
			number++;
		
		}while(number < 10); //semi colon here because this is the end of the loop so we can end it with a ;
		//how is this different?
		//It is different in when the checking is done, in the while loop the checking happens at the beginning
		//in a do-while the checking happens at the end
		//this matters when you have to check the condition before you did something
		//like checking for cars before you cross the street
		//in the case of the do-while it can be used for when the game asks do you want to play again
		//you want to check in the end of the game not the beginning
			
		
		System.out.println("The number is "+number);
		
		
	}
		

}
