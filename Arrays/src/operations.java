import java.util.Scanner;

public class operations {

	public static int[] buildArray(int n, int[] array1) {
		for(int index=0; index<n; index++) {
			System.out.printf("Enter %d th element of the array", index);
			Scanner s = new Scanner(System.in);
			int element = s.nextInt();
			array1[index] = element;
		}
		return array1;
	}
	
	public static int searchArray(int searchint, int[] array1) {
		int size = array1.length;
		for(int index=0;index<size; index++) {
			if(array1[index] == searchint) {
				return index;
			}
		}
		return -1;
	}
	
	public static int[] deleteElement(int searchindex, int[] array1) {
		int size = array1.length;
		for(int index=searchindex; searchindex < size-1;index++) {
			array1[index] = array1[index+1];
		}
		return array1;
	}

}
