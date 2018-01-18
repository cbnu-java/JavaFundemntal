import java.util.Scanner;

public class Array2DDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = 3, col = 2;
		int[][] arr = new int[row][col];
		
		//initialize value to 2D array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("arr[%d][%d] = ", i, j);
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		// use loop to print 2D array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
