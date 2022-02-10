package lessons;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileStreamingL11 {

	public static void main(String[] args) throws Exception{
		//streaming is just a flow of data\
		//where do we get this data? from the user/keyboard
		//we can stream this data from and to different places
		//we will talk specifically about files
		
		//files allow us to import and export data from things other than the user or keyboard
		
		//output
		File outFile = new File("data.txt");//create a file called data.txt
		PrintWriter output = new PrintWriter(outFile);//a print writer will use this
		//we need to add an exception for this in case something goes wrong
		//therefore tell main to throw exceptions
		output.println(123); //this is just the same as sop
		output.close();//we have to close the file
		//now we cant see it in the console because we have made it a file in txt format
		//you can find it in the project as a file called data.txt
		//now we will learn how to read files
		
		//input
		Scanner sc = new Scanner(System.in);//this is to read from keyboard, but ...
		File inFile = new File("data.txt");
		Scanner input = new Scanner(inFile);
		while(input.hasNext()) {//does the file still have data
			int number = input.nextInt();
			System.out.print(number);
		}
		input.close();
		
	}

}
