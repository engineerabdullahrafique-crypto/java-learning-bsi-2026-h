package com.bsitask.filehandling2;

import java.io.File;

public class Main {

    public static void getCurrentDirectory(String path) {
        File file = new File(path);
        File[] filesInDirectory = file.listFiles();
        for (File files : filesInDirectory) {
            System.out.println(files);
        }
    }

    //
    public static void getCurrentDirectory1(String path) {
        File file = new File(path);
        File[] filesInDirectory = file.listFiles();
        for (File files : filesInDirectory) {
            if (files.isDirectory()) {
                System.out.println("Directory: " + files.getName());
            } else if (files.isFile()) {
                System.out.println("File: " + files.getName());
            }
        }
    }

    public static void main(String[] args) {
        String location = "C:\\Users\\AB\\Downloads";
        getCurrentDirectory(location);
        System.out.println("\nAfter Separation");
        getCurrentDirectory1(location);

    }

}
