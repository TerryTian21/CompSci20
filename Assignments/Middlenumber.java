package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class Middlenumber {
	
	public static int middle(int number1, int number2, int number3) {
		/*
		System.out.println("n1:"+number1);
		System.out.println("n2:"+number2);
		System.out.println("n3:"+number3);
		*/
		if((number1<number2 && number1>number3) || (number1>number2 && number1<number3) ||(number1==number2)||(number1==number3)) {
			return number1;
		}
		else if ((number2<number1 && number2>number3) || (number2>number1 && number2<number3)||(number2==number1)||(number2==number3)) {
			return number2;
		}
		else if((number3<number1 && number3>number2) || (number3>number1 && number3<number2)||(number3==number1)||(number3==number2)){
			return number3;
		}
		return -1; //this statement is like a backup statement to return a int if none of the above work.

	}

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		
		//System.out.println("Choose 1,2,3");
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
		middle(number1,number2,number3);
		System.out.println("Middle("+number1+","+number2+","+number3+")");
		System.out.println(middle(number1,number2,number3));
		

	}

}
