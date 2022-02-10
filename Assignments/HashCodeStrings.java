package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class HashCodeStrings {

	public static int hashCode(String word){
		
		int hashNumber = 0;
		for(int i = 0; i<word.length(); i++) 
			hashNumber += (int)word.charAt(i)*(int)Math.pow(2, i);
		
		hashNumber = hashNumber%20000;
		
		return hashNumber;
	}
	
	public static void main(String[] args) {
	
		
		int again = 1;
		String st = "";
		Scanner sc = new Scanner(System.in);
		String[][] hashTable = new String[20000][10];
		
		do {
			boolean alreadyThere = false;
			System.out.println("Enter a word: ");
			st = sc.next();
			System.out.println("Hash Code of Word: "+hashCode(st));
			int j = 0;
			while(j<10 && hashTable[hashCode(st)][j] != null) {
				if(hashTable[hashCode(st)][j].equals(st)) {
					alreadyThere = true;
					break;
					
				}
				j++;
			}
			
			if(j<10 && alreadyThere == false) {
				hashTable[hashCode(st)][j] = st;
			}
			/*for(int i = 0; i<20000; i++) 
				for(int j = 0; j<10; j++) {
					if(hashCode(st) == i)
						if(hashTable[i][j] == null) {
							hashTable[i][j] = st;
							break;
						}
						if(hashTable[i][j] != null)
							continue;
				}
			*/
			System.out.println("Test: ");
			int testIndex = 0;
			testIndex = sc.nextInt();
			for(int i = 0; i< 10; i++) {
				if(hashTable[testIndex][i] != null)
					System.out.print(hashTable[testIndex][i]);
			}
			System.out.println();
			System.out.println("Again?");
			again = sc.nextInt();
			
		}while(again != 0);
	}

}
