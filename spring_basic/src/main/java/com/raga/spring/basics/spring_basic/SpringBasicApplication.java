package com.raga.spring.basics.spring_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {5,7,1,3}, 3);
		System.out.println(result);
		SpringApplication.run(SpringBasicApplication.class, args);
	}

}
