package codes.Lessons;

import java.util.Scanner;

public class ArraysL8 {

	public static void main(String[] args) {
		
		int max = 0;
		int current = 0;
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];//this shows instead of an integer you want a list of integers
		//what the computer will do is it will have 10 spots to store the variable
		//its like making 10 integers in a row, but how do we access each int?
		//we have the first number spot as address 0 in the list which is the start
		//Its zero because you get to it by moving down 0 items down the list, because its the start
		//all items in the list must be the same data type
		//each spot of an array is called an Element, and each address of the spots are called indexs\
		
		System.out.println(numbers);//what does this mean?
		//the square bracket means array, I means integer, @ means at, the rest is the Ram memory address in hex decimal form of the first item
		//if you want to access the first element of the array then:

		for(int x = 0; x<10; x++) {
			current = sc.nextInt();

			numbers[x]=current; //numbers at index x would get a value of x+1
			//System.out.println(numbers[x]);
			
			if(current > max)
				max = numbers[x];
			
		}
		
		System.out.println("\tMax is: "+max);
		//System.out.println(numbers[10]); we only have indexs to 9 because we only have 10 elements
		//System.out.println(numbers[11]); this ram memory address is not part of the array
		
	
		

	}

}
