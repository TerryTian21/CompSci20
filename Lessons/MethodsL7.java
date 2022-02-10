package codes.Lessons;

import java.util.Scanner;

public class MethodsL7 {
	
	public static void menu() {
		
		System.out.println("1. Go shopping.");
		System.out.println("2. Check inventory");
		System.out.println("3. Change location");
		System.out.println("4. Start selling");
	}

	public static int add(int number1, int number2) {
		//its not void, its int because that spot is for return type, since we are adding we expect a number back
		//void means there's no response required
		//in the add () its the extra info you need to do a task like adding

		System.out.println("method 1");
		System.out.println(number1);
		System.out.println(number2);	
		return ++number1 + (++number2);
		//brackets because if we did number1+ ++number2 the computer could read it as number1++ +number2
		//return means to respond and moves it to whatever method has called the addition
		
	}
	
	public static double add(double number1 , double number2) {
		
		System.out.println("Method 2");
		System.out.println(number1);
		System.out.println(number2);
		return ++number1 + (++number2);
		//for a double
		
	}
	
	public static void exception(int number1) throws Exception {
		
		boolean tryAgain = false;
		Scanner input = new Scanner(System.in);
		
		do {
			
			tryAgain = false;
			
			try {
				number1 = input.nextInt();
			}
			catch(Exception e){
				String garbage = input.next();
				tryAgain = true;
				System.out.println("error");
			}
			if(tryAgain == false && (number1 > 10 || number1 < 1)) 
				tryAgain = true;
				System.out.println("error");

			
		}while(tryAgain == true);
		
	}
	public static void main(String[] args) throws Exception{
		
		//what is a method? Sometimes there is a task you want to repeat over and over
		//instead of doing that you use a method to help you
		//methods are a sub programs that does one thing repeatedly for you (like an error trap)
		//makes code smaller more concise
		
		/*System.out.println("1. Go shopping.");
		System.out.println("2. Check inventory");
		System.out.println("3. Change location");
		System.out.println("4. Start selling");
		*/
		//this takes up room and we don't need to see it every time
		//this program is in the main program
		//now move it to the menu program.
		//then call menu inside main
		menu();
		//we can now change 4 lines into one word
		
		/*
		int number1 = add(5,7);
		System.out.println(number1);
		*/
		//number1 has two variables named it, how can this work?
		//they are in different scopes they are in different programs
		
		int number1 = 5;
		int number2 = 7;
		int total = add(number1, number1);
		System.out.println(total);
		//if we do ++number1 in the other program the number1 of this program doesn't change because they aren't the same variable
		//think like there's two people called Tony, there both called Tony but they're different people
		//if one Tony breaks their arm, the other won't also break their arm because they're different people
		
		double number3 = 5.0;
		double number4 = 7.0;
		double total2 = add(number3, number4);
		System.out.println(total2);
		//if we have both add methods be called add rather than 1 or 2
		//the rule is 1st it trys to see if there is a method that has the same number of arguments
		//if so then it uses it, if not then it looks for similar arguments with promotion
		//if not then it errors
		//this is called OVERLOADING when there are two methods with the same name
		
		int enter = 0;
		System.out.println("Input a number");
		exception(enter);
		
		
	}

}
