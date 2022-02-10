package skillbuilding;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class textTwist {
	
	public static boolean isValid(String word) {
		
		if(word.length() > 6 || word.length() < 3) 
			return false;
		
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i) < 97 || word.charAt(i) > 122)
				return false;
		}
		return true;
	}

	public static void hash(String word, String[][] hashTable) {
		
		int hashCode = 0;
		boolean inList = false;
		
		//get the hash number
		for(int i = 0; i< word.length(); i++) 
			hashCode += word.charAt(i)*Math.pow(2, i);
		hashCode = hashCode%20000;
		
		//hash table storing
		int j = 0;
		while(j<10 && hashTable[hashCode][j] != null) {
			if(hashTable[hashCode][j].equals(word)) {
				inList = true;
				break;
			}
			j++;
		}
		if(inList == false && j<10) {
			hashTable[hashCode][j] = word;
			//return 1;
		}
		//return 0;
	}
	
	public static void main(String[] args) throws Exception{
		
		File text = new File("bigText.txt");
		File dictionary = new File("dictionary.txt");
		PrintWriter output = new PrintWriter(dictionary);
		String hashTable[][] = new String[20000][100];
		Scanner sc = new Scanner(text);
		String word = "";
		int counter = 0;
		
		//put all valid words into the hash table
		while(sc.hasNext()) {
			word = sc.next();
			if(isValid(word) == true) {
				hash(word,hashTable);
				//counter++;
			}
		}
		
		//display and store all words stored in hash table to dictionary
		for(int i = 0; i< 20000;i++)
			for(int k = 0; k<100; k++) {
				if(hashTable[i][k] == null)
					break;
				System.out.println(hashTable[i][k]);
				output.println(hashTable[i][k]);
			}
		//System.out.println(counter);
		//System.out.println("done");
		output.close();
		sc.close();
	}
	
}
