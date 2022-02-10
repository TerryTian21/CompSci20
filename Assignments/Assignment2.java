package skillbuilding;

import java.io.File;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws Exception{
		
		String[] fNames = new String[20];
		String[] mNames = new String[20];
		String[] lNames = new String[20];

		File female = new File("femaleNames.txt");
		File male = new File("maleNames.txt");
		File last = new File("lastNames.txt");
		
		Scanner iFemale = new Scanner(female);
		Scanner iMale = new Scanner(male);
		Scanner iLast = new Scanner(last);
		
		//populate
		for(int i=0; i<20;i++) {
				fNames[i] = iFemale.next();
				//System.out.println(fNames[i]);
				mNames[i] = iMale.next();
				//System.out.println(mNames[i]);
				lNames[i] = iLast.next();
				//System.out.println(lNames[i]);
		}
		for(int i = 0; i<10;i++) {
			int gender = (int)(Math.random()*(2));
			//System.out.println(gender);
			if(gender == 0) //female
				System.out.println(fNames[(int)(Math.random()*(20))]+" "+ lNames[(int)(Math.random()*(20))]);
			if(gender == 1)//male
				System.out.println(mNames[(int)(Math.random()*(20))]+" "+ lNames[(int)(Math.random()*(20))]);
		}
		iFemale.close();
		iMale.close();
		iLast.close();
	}

}
