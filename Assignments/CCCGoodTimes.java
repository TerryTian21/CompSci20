package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class CCCGoodTimes {

	public static void main(String[] args) throws Exception {
		int Ottawa = 0;
		Scanner input = new Scanner(System.in);
		
		boolean tryAgain = false;
		
		do {
			tryAgain = false;
			try {
				Ottawa = input.nextInt();
			}
			catch(Exception e) {
				String garbage = input.next();
				tryAgain = true;
			}
			if(tryAgain == false &&(Ottawa%100 > 59))
				tryAgain = true;
		}while(tryAgain == true);
		
		int Victoria = Ottawa - 300;
		int Edmonton = Ottawa - 200;
		int Winnipeg = Ottawa - 100;
		int Toronto = Ottawa;
		int Halifax = Ottawa + 100;
		int STJ = Ottawa + 130;
		if(STJ%100 > 59) {
			//make STJ end in 0-59
			STJ+=40;
		}
		if(Victoria < 0) 
			Victoria = 2400 + Victoria;
		
		if(Edmonton < 0) 
			Edmonton = 2400 + Edmonton;
		
		if(Winnipeg < 0) 
			Winnipeg = 2400 + Winnipeg;
		
		if(Halifax >= 2400) 
			Halifax -= 2400;
		
		if(STJ >= 2400) 
			STJ -= 2400;
		
		System.out.println(Ottawa +" in Ottawa");
		System.out.println(Victoria +" in Victoria");
		System.out.println(Edmonton +" in Edmonton");
		System.out.println(Winnipeg +" in Winnipeg");
		System.out.println(Toronto +" in Toronto");
		System.out.println(Halifax +" in Halifax");
		System.out.println(STJ +" in St.Johns");

		

	}

}
