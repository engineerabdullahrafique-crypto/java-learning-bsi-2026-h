package com.bsitask.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> listString = new ArrayList<>();
		listString.add("Mango");
		listString.add("Banana");
		listString.add("Apple");
		listString.add("Dates");
		listString.add("Oranges");

		System.out.println("Before Sorting");
		System.out.println(listString);

		System.out.println("\nAfter Sorting");
//		listString.sort(null);
		Collections.sort(listString);
		System.out.println(listString);

		String toFind = "Apple";
		int findResult = Collections.binarySearch(listString, toFind);
		if (findResult >= 0) {
			System.out.println("\n" + toFind + " Found At Index: " + findResult);
		} else {
			System.out.println(toFind + " Not Found In ArrayList: ");
		}

		System.out.println("\nOn Integers");
		ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(4, 5, 63, 2, 1, 8, 9));
		Collections.sort(integerList);
		System.out.println(integerList);

		int findNumber = 5;
		int findResult1 = Collections.binarySearch(integerList, findNumber);
		if (findResult1 >= 0) {
			System.out.println("\n" + findNumber + " Found At Index: " + findResult1);
		} else {
			System.out.println("\n" + findNumber + " Not Found In ArrayList: ");
		}
	}

}
