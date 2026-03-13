package com.bsitask21.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void countAllWords(String path) {

		File fileLocation = new File(path);
		Map<String, Integer> wordFrequency = new HashMap<>();

		try {
			Scanner readFromFile = new Scanner(fileLocation);
			while (readFromFile.hasNextLine()) {
				String readData = readFromFile.nextLine();
				String[] words = readData.split("\\s+");

				for (String word : words) {
					word = word.toLowerCase();
					if (wordFrequency.containsKey(word)) {
						wordFrequency.put(word, wordFrequency.get(word) + 1);
					} else {
						wordFrequency.put(word, 1);
					}
				}
			}

			for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String path = "C:\\Users\\AB\\Desktop\\00001A\\FileHandling\\source.txt";

		countAllWords(path);

	}

}