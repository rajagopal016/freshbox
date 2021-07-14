package ArrayDemo;

public class MatrixOpsMain {

	public static void main(String[] args) {
		int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2 = {{8,7,6},{5,4,3},{2,1,0}};
		int[][] result = new int[3][3];
		System.out.println("Addition");
		for(int i = 0 ; i < m1.length; i++) {
			for(int j = 0 ; j < m2.length; j++) {
				result[i][j] = m1[i][j] + m2[i][j]; 
			}	
			}
		for(int i = 0 ; i < m1.length; i++) {
			for(int j = 0 ; j < m2.length; j++) {
				if(j == m2.length - 1) {
					System.out.println(result[i][j] + " ");
				}
				else {
					System.out.print(result[i][j] + " ");
				}
			}	
			}
		

		
		System.out.println("Subtraction");
		for(int i = 0 ; i < m1.length; i++) {
			for(int j = 0 ; j < m2.length; j++) {
				result[i][j] = m1[i][j] - m2[i][j]; 
			}	
			}
		for(int i = 0 ; i < m1.length; i++) {
			for(int j = 0 ; j < m2.length; j++) {
				if(j == m2.length - 1) {
					System.out.println(result[i][j] + " ");
				}
				else {
					System.out.print(result[i][j] + " ");
				}
			}	
			}
}
}
