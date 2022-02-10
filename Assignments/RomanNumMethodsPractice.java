package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class RomanNumMethodsPractice {

	public static String RomanNum(int number) {
		
		String value = "";
		
		while(number >= 100) {
			value += "C";
			number -= 100;
		}
		
		while(number >= 90) {
			value += "XC";
			number -= 90;
		}
			
		while(number >= 50 && number < 90) {
			value += "L";
			number -= 50;
		}
		
		while(number >= 40 && number < 50) {
			value += "XL";
			number -= 40;
		}
		while(number > 10 && number < 40) {
			value += "X";
			number -= 10;
		}
		
		while(number <= 10 && number > 0) {
			if(number%10 < 4 && number%10 != 0) {
				for(int a = 0; a < (number-number/10*10); a++) 
					value += "I";
					//System.out.print("I");
			}
			else if(number%10 == 4) {
				value += "IV";
				//System.out.print("IV");
			}
			else if (number%5 == 0 && number%10 != 0) {
				value += "V";
				//System.out.print("V");
			}
			else if(number%10 >= 6 && number%10 < 9) {
				value += "V";
				//System.out.print("V");
				for(int b = 0; b<(number-5); b++) {
					value += "I";
					//System.out.print("I");
				}
			}
			else if(number%10 == 9) {
				value += "IX";
				//System.out.print("IX");
			}
			if(number%10 == 0) {
				value += "X";
				//System.out.print("X");
			}
			number -= 10;
		}
		return value;
	}
	
	public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		System.out.println(RomanNum(number));

	}

}
