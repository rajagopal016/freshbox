import java.util.Arrays;
import java.util.Scanner;
public class ArraysC {
	
	public static void main(String[] args) {
		
		TwoD d = new TwoD();
		d.twodarray();
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int n = s.nextInt();
		int[] array1 = new int[n];
		array1 = buildArray(n, array1);
		System.out.println(Arrays.toString(array1));
		int searchindex;
		do {
			System.out.println("Enter the element in the array to delete: ");
			int searchint = s.nextInt();
			searchindex = searchArray(searchint, array1);
		}while(searchindex == -1);
		array1 = deleteElement(searchindex, array1);
		System.out.println(Arrays.toString(array1));*/
		
	}
	
	public static int[] buildArray(int n, int[] array1) {
		for(int index=0; index<n; index++) {
			System.out.printf("Enter %d th element of the array: \n", index);
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
		for(int index=searchindex; index < size-1;index++) {
			array1[index] = array1[index+1];
			
		}
		array1 = Arrays.copyOfRange(array1, 0, size-1);
		return array1;
	}

}



