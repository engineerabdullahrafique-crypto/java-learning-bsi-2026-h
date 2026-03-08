package langpack;

public class Main {

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";
        //checking String references
        System.out.println("In String1 " + string1 + " In String2 " + string2);
        System.out.println("Checking reference using the == operator on String1 and String2: " + (string1 == string2));

        String string3 = "Hello";
        String string4 = "Hello";
        System.out.println("\nIn String3 " + string3 + " In String4 " + string4);
        System.out.println("Checking reference using the == operator on String3 and String4: " + (string3 == string4));

        System.out.println("\nIn String1 " + string1 + " In String2 " + string2);
        System.out.println("Checking Using Equal Method: " + (string1.equals(string2)));
        System.out.println("\nIn String3 " + string3 + " In String4 " + string4);
        System.out.println("Checking Using Equal Method: " + (string3.equals(string4)));

        String string5 = new String("Hello");
        String string6 = new String("Hello");

        // check using objects its return false because reference of both is different
        //its return false because both have different object
        System.out.println("\nIn String1 " + string5 + " In String2 " + string6);
        System.out.println("Create Same String Content But In Different Object Then Check Using == Operator: " + ((string5 == string6)));
        //its return true because its check content not the reference
        System.out.println("\nIn String1 " + string5 + " In String2 " + string6);
        System.out.println("Create Same String Content But In Different Object Then Check Using Equal Method: " + (string5.equals(string6)));

    }

}
