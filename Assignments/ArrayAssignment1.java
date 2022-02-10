package codes.Assignments.Skillbuilding;

import java.util.Scanner;


public class ArrayAssignment1 {
	
	public static int[] random(int[] array) {
		
		//array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*(100)+1);
			/*System.out.print(array[i]+",");
			if(i%10 == 0){
				System.out.println("");
			}*/
		}
		
		return array;
	}
	
	public static int[] sequential(int[] array) {
		
		//array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
			/*
			if(i > 0)
				previous = array[i-1];
			
			if(previous > array[i]) {
				array[i-1] = array[i];
				array[i] = previous;
			}
			*/
			/*System.out.print(array[i]+",");
			if(i%10 == 0)
				System.out.println("");*/
		}
		return array;
	}
	
	public static void display(int[] array) {
		
		int i = 0;
		for(i = 0; i <array.length; i++) {
			System.out.print(array[i]+"\t");
			if(i%10 == 9 && i != 0)
				System.out.println("");
		}
	}
	
	public static int[] shuffle(int[] array) {
		
		for(int i = 0; i<2*array.length; i++) {
			int a = (int)(Math.random()*(99)+1);
			int b = (int)(Math.random()*(99)+1);
			int c = 0;
			c = array[a];
			array[a] = array[b];
			array[b] = c;
		}
		return array;
	}
	
	public static int find(int uInput, int[] array) {
		
		int number = -1;
		for(int i = 0; i<array.length; i++) {
			if(array[i]== uInput) {
				number = i;
				break;
			}
		}
		return number;
	}
	
	public static boolean ascending(int[] array) {
		
		boolean ascending = false;
		
		for(int i = 0; i<array.length; i++) {

			if(i != 0) {
				if(array[i] > array[i-1]) {
					ascending = true;
				}
				else {
					ascending = false;
					break;
				}
			}
		}
	
		return ascending;
	}
	
	public static boolean shuffleSort(int[] array) {
		int k = 0;
		boolean check = false;

		while(k<=10000) {
			
			check = ascending(array);
			
			if(check == true) 
				break;
			else {
				shuffle(array);
				k++;
			}
		}
		return check;
	}
	
	public static int lowest(int[] array) {
		
		int current = 100;
		for(int i = 0; i<array.length; i++) {
			if(array[i] < current)
				current = array[i];
		}
		
		return current;
	}
	
	public static int highest(int[] array) {
		
		int current = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i] > current)
				current = array[i];
		}
		
		return current;
	}
	
	public static int repeat(int uInput,int[] array) {
		
		int repeats = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i] == uInput)
				repeats++;
		}
		
		return repeats;
	}
	
	public static void replace(int number1, int number2, int[] array) {
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] == number1) 
				array[i] = number2;
		}
	}
	
	public static void tenConsec(int[] array) {
		int current = 0;
		
		for(int x = 0; x <= 90; x++) {
			int sum = 0;
			for(int i = x; i<x+10; i++) 
				sum += array[i];
		
			if(sum > current) 
				current = sum;
			
		}
		System.out.println(current);
	}
	
	
	public static void main(String[] args) {
		int uInput = 0;
		boolean end = false;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];
		do {
			System.out.println("\n--------------------------------------------------");
			System.out.print("0. Exit Program \n1. Populate the array randomly \n2. Populate the array sequentially from 1 to 100.\n3. Display the Array.\n4. Shuffle the Array.");
			System.out.print("\n5. Find index of a number.");
			System.out.print("\n6. Check if the array is in ascending order.");
			System.out.print("\n7. Shuffle 10k to try to put array in ascending order.");
			System.out.print("\n8. Find the lowest number of the array.");
			System.out.print("\n9. Find the highest number of the array");
			System.out.print("\n10. Amount of repeats of a number.");
			System.out.print("\n11. Replace a number with another.");
			System.out.print("\n12. Find the greatest sum of 10 consecutive indexes.");
			System.out.println("\n--------------------------------------------------");
			uInput = sc.nextInt();
			
			if(uInput == 0) {
				end = true;
			}
			if(uInput == 1) {
				array = random(array);
			}
			if(uInput == 2) {
				array = sequential(array);
			}
			if(uInput == 3) {
				display(array);
			}
			if(uInput == 4) {
				array = shuffle(array);
			}
			if(uInput == 5) {
				System.out.println("What number would you like to find?");
				uInput = sc.nextInt();
				System.out.println("Index:"+find(uInput,array));
			}
			if(uInput == 6) {
				System.out.println(ascending(array));
			}
			if(uInput == 7) {
				System.out.println(shuffleSort(array));
			}
			if(uInput == 8) {
				System.out.println(lowest(array));
			}
			if(uInput == 9) {
				System.out.println(highest(array));
			}
			if(uInput == 10) {
				System.out.println("What number would you like to find repeats for?");
				uInput = sc.nextInt();
				System.out.println(repeat(uInput,array));
			}
			if(uInput == 11) {
				int number1 = 0;
				int number2 = 0;
				System.out.println("Enter two numbers, the second number will \nreplace all instances of the first number.");
				number1 = sc.nextInt();
				number2 = sc.nextInt();
				replace(number1,number2,array);
			}
			if(uInput == 12) {
				tenConsec(array);
			}
			
			
		}while(end == false);
		
	}

}
