
public class Array2D {

	public static void main(String[] args) {
	
		int[][] arr = new int[2][3];
		
		//first row
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		//second row
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		//use loop to print arr
		/*for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("arr[%d][%d]=%d\n", i, j, arr[i][j]);
			}
		}*/
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
