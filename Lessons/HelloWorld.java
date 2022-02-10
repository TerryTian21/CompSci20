package codes.Lessons;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		//Java Output
		// cout << "Hello World" << endl; C++ code
		System.out.println("Hello World");
		
		
		//display integer
		int number = 0;
		double numberdouble = 0;
		//int number2 = 3;
		//System.out.println("The numbers are " + number + " and " + number2);
		
		
		//Java input
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		//we need a helper to read data from keyboard
		//Capital S scanner is the name of a program, but we need to name it because there can be multiple scanners
		//We have named it "Input". The above says, have a scanner named input be a new scanner that reads system inputs.
		//Scanner command doesnt exist unless we import "java.util.Scanner"
		number = input.nextInt();
		//number = input.nextDouble(); for doubles
		//number = input.next(); for strings
		System.out.println("Your number is " + number);
		
		char enter = 'n';
		
		System.out.println("Choose yes or no (y/n)");
		enter = input.next().charAt(0);
		
		//order of operations
		//difference between ++number and number++
		int x = 5;
		
		System.out.println(++number * 10);
		System.out.println(number);
		//and
		System.out.println(number++ * 10);
		System.out.println(number);
		//the order of operations in coding is ++BEDMASE++ E = equals sign not the == just =
		//so int x = number++; its equals first and then ++
		
	}

}
