package base;

public class Mylt_array {
	public static void main(String[] args) {
		int[][] matrica = { { 1, 2, 3 }, 
				{ 2, 8, 9 },
				{ 7, 8, 9 } };
		
		for(int i=0; i < matrica.length; i++) {
			for(int j = 0; j<matrica[i].length; j++ ) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
//		 
	}
}
