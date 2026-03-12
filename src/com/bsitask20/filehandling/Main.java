package com.bsitask20.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void countWord(String path, String word) {
		File fileLocation = new File(path);
		try {
			Scanner readFromFile = new Scanner(fileLocation);
			int count = 0;
			while (readFromFile.hasNextLine()) {
				String readData = readFromFile.nextLine();
				String[] breaksWords = readData.split("\\s+");
				for (String words : breaksWords) {
					if (word.equalsIgnoreCase(words)) {
						count++;
					}
				}
			}
			System.out.println(word + " Appears " + count + " Times In File");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\AB\\Desktop\\00001A\\FileHandling\\source.txt";
		countWord(path, "java");

	}

}
