package codes.Lessons;

public class TwoDArraysL9 {

	public static void main(String[] args) {
		//its possible to make an array of arrays
		//thats called two dimensional arrays
		
		int[][] number = new int[20][20];
		number[1][5] = 8;
		
		for(int x = 0; x<20; x++) {
		
			for(int y = 0; y<20; y++)
				System.out.print(number[x][y]+" ");
			
			System.out.println();
		}
		
		//each line going down is an indices of x and the element of each indices of x is an array
		//x going down and y going across
	}

}
