package com.bsitask19.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void copyFileData(String sourcePath, String destinationPath) {
		File checkDirectory = new File(sourcePath);
		if (!checkDirectory.isFile()) {
			System.out.println("Invalid Directory");
		}

		try {
			Scanner readFromSource = new Scanner(checkDirectory);
			FileWriter copyIntoDestination = new FileWriter(destinationPath);
			while (readFromSource.hasNextLine()) {
				String content = readFromSource.nextLine();
				copyIntoDestination.write(content + "\n");
			}
			System.out.println("Copy Successfully");
			readFromSource.close();
			copyIntoDestination.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String sourcePath = "C:\\Users\\AB\\Desktop\\00001A\\FileHandling\\source.txt";
		String destinationPath = "C:\\Users\\AB\\Desktop\\00001A\\FileHandling\\destination.txt";
		copyFileData(sourcePath, destinationPath);

	}

}
