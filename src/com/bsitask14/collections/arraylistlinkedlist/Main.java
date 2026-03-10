package com.bsitask14.collections.arraylistlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		int[] data = { 23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100 };
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		System.out.println("Original List");
		for (Integer number : data) {
			System.out.print(number + " ");
		}

		for (Integer num : data) {
			arrayList.add(num);
			linkedList.add(num);
		}
		System.out.println();

		int toFind = 100;

		System.out.println("\nSearch In ArrayList");
		long starSearchTimeInArrayList = System.nanoTime();
		for (Integer number : arrayList) {
			if (number == toFind) {
				break;
			}
		}
		long endSearchTimeInArrayList = System.nanoTime();
		long searchTimeInArrayList = endSearchTimeInArrayList - starSearchTimeInArrayList;
		System.out.println("Search Time In ArrayList: " + searchTimeInArrayList);

		System.out.println("\nSearch In LinkedList");
		long starSearchTimeInLinkedList = System.nanoTime();
		for (Integer number : linkedList) {
			if (number == toFind) {
				break;
			}
		}
		long endSearchTimeInLinkedList = System.nanoTime();
		long searchTimeInLinkedList = endSearchTimeInLinkedList - starSearchTimeInLinkedList;
		System.out.println("Search Time In LinkedList: " + searchTimeInLinkedList);

	}

}
