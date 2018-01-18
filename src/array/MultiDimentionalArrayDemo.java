package array;

public class MultiDimentionalArrayDemo {
	
	public static void main(String[] args) {
	
		int a1[][] = new int[][] { {1,2},{3,4} };
		int row = 2, col = 3;
		
		int a2[][] = new int[row][col];
		/*
		 * 1  2  3
		 * 4  5  6
		 */
		//a2[0][0] = 1;
		//a2[0][1] = 2;
		//a2[1][0] = 3;
		//a2[1][1] = 4;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a2[i][j] = i+j;
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(a2[i][j]);
			}
		}
		
		int x=2, y=2, z=2;
		int d3[][][] = new int[x][y][z];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				for(int k=0; k<z; k++) {					
					//System.out.printf("%s, %s, %s", i, j, k);
					d3[i][j][k] = i+j+k;
					System.out.println(d3[i][j][k]);
				}
			}
		}
		
		int d2[][] = new int[][] { {1,2}, {3,4} };
		int d4[][][] = new int[][][] { { {1,2,3}, {4,5,6} } };
	}
}
