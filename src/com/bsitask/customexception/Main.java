package com.bsitask.customexception;

public class Main {

    public void checkString(String stringToCheck) throws NullStringException {
        if (stringToCheck == null) {
            System.out.println("\nNull String Is Not Allowed");
            throw new NullStringException("Null String Exception Thrown");
        }
        System.out.println("String Is: " + stringToCheck);
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.checkString(null);
        } catch (NullStringException e) {
            System.out.println(e);
        }
    }

}