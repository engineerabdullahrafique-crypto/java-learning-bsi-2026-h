package com.bsitask.filehandling3;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void findInLocalDirectory(String path, String extension) {
		File directoryObject = new File(path);
		File[] files = directoryObject.listFiles();

		if (!directoryObject.isDirectory() || !directoryObject.exists()) {
			System.out.println("Invalid path directory");
			return;
		}

		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.getName().endsWith(extension)) {
					System.out.println("File: " + file.getName());
				}
			}
		}
	}

	public static void main(String[] args) {

		String location = "C:\\Users\\AB\\Downloads";
		System.out.println("Enter Extension To Find Files");
		Scanner scanner1 = new Scanner(System.in);
		String extension = scanner1.nextLine();
		findInLocalDirectory(location, extension);
	}

}
