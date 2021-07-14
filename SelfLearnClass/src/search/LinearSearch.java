package search;

public class LinearSearch {

	public int searchArray(int[] array, int searchint) {
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] == searchint) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {

		int[] array = new int[] {1,2,3,5,243,434,12,14,21,4435,342};
		int searchint = 342;
		LinearSearch l = new LinearSearch();
		System.out.println(l.searchArray(array, searchint));
		
	}

}
