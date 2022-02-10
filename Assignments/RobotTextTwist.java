package skillbuilding;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Scanner;

public class RobotTextTwist {
	
	public static boolean canMake(String word, String letters) throws Exception{
		
		char[] lettersArray = letters.toCharArray();
		char[] wordArray = word.toCharArray();
		int counter = 0;
		
		boolean torf = false;
		
		for(int i = 0; i<wordArray.length;i++) {
			for(int k = 0; k<lettersArray.length; k++) {
				if(wordArray[i]==lettersArray[k]) {
					counter++;
					lettersArray[k] = '\0';
					break;
				}
				else if(wordArray[i] != lettersArray[k]) {
					if(k == lettersArray.length-1) {
						torf = false;
						return torf;
					}
					continue;
				}
			}
		}
		
		if(counter == wordArray.length) { 
			torf = true;
			System.out.println(word);
		}
		
		return torf;
	}

	public static void main(String[] args) throws Exception{
		
		File dictionary = new File("dictionary.txt");
		Scanner sc = new Scanner(dictionary);
		Scanner input = new Scanner(System.in);
		String uInput = "";
		String word = "";
		Robot key = new Robot();
		System.out.println("What are the 6 letters in order?");
		uInput = input.next();
		
		Thread.sleep(5000);
		while(sc.hasNext()) {
			word = sc.next();
			if(canMake(word,uInput) == true) {
				//Thread.sleep(1000);
				for(int i = 0; i<word.length();i++) {
					char letter = word.charAt(i);
					if(letter == 'a') key.keyPress(KeyEvent.VK_A);
					if(letter == 'b') key.keyPress(KeyEvent.VK_B);
					if(letter == 'c') key.keyPress(KeyEvent.VK_C);
					if(letter == 'd') key.keyPress(KeyEvent.VK_D);
					if(letter == 'e') key.keyPress(KeyEvent.VK_E);
					if(letter == 'f') key.keyPress(KeyEvent.VK_F);
					if(letter == 'g') key.keyPress(KeyEvent.VK_G);
					if(letter == 'h') key.keyPress(KeyEvent.VK_H);
					if(letter == 'i') key.keyPress(KeyEvent.VK_I);
					if(letter == 'j') key.keyPress(KeyEvent.VK_J);
					if(letter == 'k') key.keyPress(KeyEvent.VK_K);
					if(letter == 'l') key.keyPress(KeyEvent.VK_L);
					if(letter == 'm') key.keyPress(KeyEvent.VK_M);
					if(letter == 'n') key.keyPress(KeyEvent.VK_N);
					if(letter == 'o') key.keyPress(KeyEvent.VK_O);
					if(letter == 'p') key.keyPress(KeyEvent.VK_P);
					if(letter == 'q') key.keyPress(KeyEvent.VK_Q);
					if(letter == 'r') key.keyPress(KeyEvent.VK_R);
					if(letter == 's') key.keyPress(KeyEvent.VK_S);
					if(letter == 't') key.keyPress(KeyEvent.VK_T);
					if(letter == 'u') key.keyPress(KeyEvent.VK_U);
					if(letter == 'v') key.keyPress(KeyEvent.VK_V);
					if(letter == 'w') key.keyPress(KeyEvent.VK_W);
					if(letter == 'x') key.keyPress(KeyEvent.VK_X);
					if(letter == 'y') key.keyPress(KeyEvent.VK_Y);
					if(letter == 'z') key.keyPress(KeyEvent.VK_Z);
					Thread.sleep(15);
				}
				key.keyPress(KeyEvent.VK_ENTER);
			}
		}
		
	}

}
