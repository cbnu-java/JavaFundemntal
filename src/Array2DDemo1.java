
public class Array2DDemo1 {
	public static void main(String[] args) {
		
		/*    $   $	  $   $
		 *    $   $	  $   $
		 *    $   $	  $   $
		 *    $   $	  $   $   
		 */
		int row = 4;
		int col = 4;
		
		char arr[][] = new char[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = '$';
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%c\t", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
