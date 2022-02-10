package codes.Assignments.Skillbuilding;

import java.util.Scanner;

public class ArraySocialDistancingMastery {
	
	public static void sDistance(int a) {
		
		int[] seats = new int[a];
		int[] desire = new int[a];
		int chosenDesire = 0, currentSeat = 0, currentSD = a, currentED = a;
		int uInput = 0;
		Scanner sc = new Scanner(System.in);
		
		//empty out all seats
		for(int i = 0;i<a; i++) {
			seats[i] = 0;
			desire[i] = a;
		}
		
		//populate
		for(int i = 0;i<a; i++) {
			System.out.print("Is seat "+(i+1)+" occupied (0 = no, 1 = yes)? ");
			uInput = sc.nextInt();
			
			if(uInput == 0) 
				seats[i] = 0;
			else if(uInput == 1)
				seats[i] = 1;
		}
		
		//display
		for(int i = 0; i<a; i++) 
			System.out.print(seats[i]+" ");	
		System.out.println();
		
		//set desire value for seats
		for(int i = 0; i<a; i++) {
			if(seats[i] == 1)
				desire[i] -= a;
			else if(seats[i] == 0 && i != 0 && i != a-1) {
				if(seats[i-1] == 1)
					desire[i]--;
				if(seats[i+1] == 1)
					desire[i]--;
				if(i<currentSD) {
					currentSD = i;
				}
				else if(a-1-i<currentED) {
					currentED = a-1-i;
				}
			}
			System.out.print(desire[i]+ " ");
		}
		
		//choose the most desirable seat
		for(int i = 0; i<a; i++) {
			int dEndEdge = (a-1)-i;
			int dStartEdge = i;
			if(desire[i] > chosenDesire) {
				chosenDesire = desire[i];
				currentSeat = i+1;
			}
			else if(desire[i] == chosenDesire) {
				if(dStartEdge < dEndEdge && dStartEdge < currentSD) {
					currentSD = dStartEdge;
					currentSeat = i+1;
				}	
				else if(dEndEdge < dStartEdge && dEndEdge < currentED) {
					currentED = dEndEdge;
					currentSeat = i+1;
				}
			}
			
		}
		System.out.print("\ncurrentSD "+currentSD+"\ncurrentED "+currentED);
		System.out.println("The next person should sit in "+currentSeat);
		//its a problem with how you calculate distance
	}

	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many seats are there?");
		number = sc.nextInt();
		sDistance(number);

	}

}
