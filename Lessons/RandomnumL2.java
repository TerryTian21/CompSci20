package codes.Lessons;

public class RandomnumL2 {

	public static void main(String[] args) {
		
		/*
		double number = 0;
		number = Math.random(); //random number generator always 0 < x < 1
		System.out.println("The number is " + number);
		*/
		
		
		int number = 0;
		int min = 1, max = 10;
		number = (int)(Math.random()*(max-min+1)+min); /*putting the whole thing into () to do "casting"
		to make the number a int even thought its suppose to be a double, casting like in film, getting people to "act" as something else
		it only treats it as an int on this line, so next time it will be a double again */
		System.out.println("The number is "+number);
		
		/*
		double number3 = 0;
		int min2 = 10, max2 = 20;
		number3 = (int)(Math.random()*(max2-min2+1)+min2);
		System.out.println("The number is "+number3);
		notice how in this instance the number is originally a double
		but we "casted" it to be an int in the instance where we make a random number
		If we wrote math.random again without "casting" it, it will no longer be a int because 
		"casting" only works on that one line
		*/
		
		
		if(number > 5)
			System.out.println("The number is greater than 5");
		else if(number < 5)
			System.out.println("The number is less than 5");
		else
			System.out.println("The number is equal to 5");
		//if else if statement review
		
		//what about this?
		if(number > 5)
			System.out.println("The number is greater than 5");
		if(number < 5)
			System.out.println("The number is less than 5");
		if (number ==5)
			System.out.println("The number is equal to 5");
		//what's the difference? the difference is in the else if statement will stop checking if one meets the criteria
		//for the if-if statements even if one if statement is met it will still check if the other if statements are true for the number
		//neither is better than the other, if you only need to check if one criteria is met, then use the else-if, as it stops after one criteria is met
		//if you need multiple criteria to be met, you need to use an if-if statement because it checks all the statements regardless if previous statement is true
		
		//what about this?
		if(number > 5)
			System.out.println("The number is greater than 5");
		if(number < 5)
			System.out.println("The number is less than 5");
		else
			System.out.println("The number is equal to 5");
		//if there is an if statement followed by an else statement, they are chained/linked
		//in this case the first if statement is independant to the other if-else statement
		//if the number was 10, it would meet the first number > 5 and show the number is greater than 5
		//then it would go to the next if statement because they aren't linked and it will treat it as a new statement
		//since 10 isn't < 5, it would go to the else statement of the second if statement, meaning the whole program 
		//would show "the nunmber is greater than 5" and also "the number is equal to 5"
		
		
	
	}

}
