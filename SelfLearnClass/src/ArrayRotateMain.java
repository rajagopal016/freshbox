
public class ArrayRotateMain {

	public static void main(String[] args) {
		int[] originalArray = new int[] {1, 2, 3, 4, 5};
		System.out.print("Original: ");
		for(int index = 0; index < originalArray.length; index++) {
			System.out.print(originalArray[index] + " ");
		}
		int numberofshifts = 4;
		for(int index = 0; index < numberofshifts; index++) {
			int firstElement = originalArray[0];
			for(int j = 0 ; j < originalArray.length; j++) {
				if(j+1 != originalArray.length) {
					originalArray[j] = originalArray[j+1];
				}
			}
			originalArray[originalArray.length - 1] = firstElement;
		}
		System.out.print("Later: ");
		for(int index = 0; index < originalArray.length; index++) {
			System.out.print(originalArray[index] + " ");
		}

	}

}
