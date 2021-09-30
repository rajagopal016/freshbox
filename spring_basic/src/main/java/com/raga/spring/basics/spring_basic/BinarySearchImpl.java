package com.raga.spring.basics.spring_basic;

public class BinarySearchImpl {
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		//Implement sorting logic
		
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		
		//Implement searching logic
		return 3;
	}

}
