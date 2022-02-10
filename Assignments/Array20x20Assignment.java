package codes.Assignments.Skillbuilding;

public class Array20x20Assignment {

	public static void main(String[] args) {
		
		int[][] arrays = new int[20][20];
		int current = 0;
		int iX = 0;
		int iY = 0;
		
		//random populate the array and then display it
		for(int i = 0; i<20; i++) {
			for(int k = 0; k<20; k++) {
				//arrays[i][k] = (k+1)+i*20;
				arrays[i][k] = (int)(Math.random()*(100)+1);
				System.out.print(arrays[i][k]+"\t");
			}
			System.out.println();
		}
		
		//summation
		for(int startx = 0; startx <18; startx++)
			
			for(int starty = 0; starty <18; starty++) {
				
				int sum = 0;
				
				for(int x = startx; x<startx + 3; x++)
					
					for(int y = starty; y<starty+3; y++) {
						sum += arrays[x][y]; 
					}
				
				if(sum > current) {
					current = sum;
					iX = startx;
					iY = starty;
				}
			}

		System.out.println("indices: ("+iX+","+iY+")");
		System.out.println("The greatest sum is:"+current);
	}

}
