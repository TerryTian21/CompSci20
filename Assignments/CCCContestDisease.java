package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class CCCContestDisease {

	public static void main(String[] args) throws Exception{
		
		int p = 0, n = 1, r = 1;
		int newI = 0;
		int totalI = 0;
		int days = 0;
		
		System.out.println("Enter P, N, R");
		Scanner input = new Scanner(System.in);
		p = input.nextInt();
		System.out.println("P: "+p);
		n = input.nextInt();
		System.out.println("N: "+n);
		r = input.nextInt();
		System.out.println("R: "+r+"\n");
		
		totalI = n;
		
		do {
			
			if(r != 1) {
				if(days == 0) {
					newI = 0;
				}
				else {
					newI = (int)Math.pow(r, days);
					totalI = totalI + newI;
				}
				
				System.out.println("Day "+days+" Infected "+totalI);
				days++;
			}
			else {
				if(days == 0) {
					newI = 0;
				}
				else {
					newI = n;
					totalI = totalI + newI;
				}
				
				System.out.println("Day "+days+" Infected "+totalI);
				days++;
			}

		}while(totalI <= p);
		
		if(totalI > p)
			System.out.println("Days "+(days-1));
	}

}
