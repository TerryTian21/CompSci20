package codes.Assignments.Skillbuilding;

import java.io.File;
import java.util.Scanner;

public class FileStreaming1 {

	public static void main(String[] args) throws Exception {
		
		File binaryfile = new File("binary.txt");
		Scanner sc = new Scanner(binaryfile);
		double sum = 0, counter = 0;
		
		while(sc.hasNext() == true) {
			sum += sc.nextInt();
			counter++;
		}
		sc.close();
		System.out.println(sum/counter);
		

	}

}
