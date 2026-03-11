package com.bsitask16.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void createFile(String location) {
		File createdFile = new File(location);
		if (!createdFile.exists()) {
			try {
				createdFile.createNewFile();
				System.out.println("File created successfully");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else

		{
			System.out.println("File already exists");

		}
	}

	public static void writeInFile(String location, String content) {
		File checkFile = new File(location);
		if (!checkFile.exists()) {
			System.out.println("File does not exist create file first");
			return;
		}
		try {
			FileWriter writeInFile = new FileWriter(checkFile, true);
			writeInFile.write(content + "\n");
			writeInFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromFile(String location) {
		File checkFile = new File(location);
		if (!checkFile.exists()) {
			System.out.println("File does not exist");
			return;
		}
		try {
			Scanner scanner1 = new Scanner(checkFile);
			while (scanner1.hasNextLine()) {
				String content = scanner1.nextLine();
				System.out.println(content);
			}
			scanner1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		String location = "C:\\Users\\AB\\Desktop\\00001A\\data.txt";

		System.out.println("Enter Data");
		Scanner takeInput = new Scanner(System.in);
		String content = takeInput.nextLine();
		createFile(location);
		writeInFile(location, content);
		readFromFile(location);

	}
}
