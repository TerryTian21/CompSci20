package codes.Lessons;

public class ForloopL4 {

	public static void main(String[] args) {
		
		int counter = 0;
		
		while(counter < 10)
		{
			System.out.println("Hello World");
			counter++;
		}
		
		//what does a for loop mean?
		//example: I am going to buy a coffee FOR every person here
		// I am going to buy a coffee while every persons here
		//for means a very specific number and the while loop is repetition under a signal

		
		for(int count = 0; count < 10; count++)
		{
			System.out.println("Hello World (for loop)");
		}
		
		//these loops technically are always interchangeable
		//however its not always appropriate, for example when there's a do-while you
		//should not substitute a for loop in for the do-while
		
		
		//what is a switch?
		
		int number = 1;
		switch(number)
		{
			case (1):
			{
				System.out.println("The number is 1");
			}
			case (2):
			{
				System.out.println("The number is 2");
			}
			default: //default is like an else statement
			{
				System.out.println("Default statement");
			}
		//this is similar to an if statement, but the difference is the switch runs everything
		//that meets the condition and below it, example the number is 2 so it shows Number is 2 and Default statement
		//skipping the number is 1. Therefore a switch is kind of like a light switch that turns on everything below it
			
		//we could do an if statement, but its very complicated as shown below
/*			
		int number2 = 2;
		boolean flag2 = false; //boolean is a true or false statement
	
		if(number == 2)
		{
			System.out.println("Number is 2");
			flag2 = true;
		}
		if(number == 1 || flag2 == true)
		{
			System.out.println("Number is 1");
			flag1 = true;
		}
		//default statement
		System.out.println("Default statement");
*/		
			
		}
	}

}
