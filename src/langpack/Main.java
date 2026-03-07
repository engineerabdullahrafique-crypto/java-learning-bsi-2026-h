package langpack;

public class Main {

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";
        //checking String references
        System.out.println(string1 == string2);

        String string3 = "Hello";
        String string4 = "Hello";
        System.out.println("\n" + (string3 == string4));

        System.out.println("\n" + (string1.equals(string2)));
        System.out.println("\n" + (string3.equals(string4)));

        String string5 = new String("Hello");
        String string6 = new String("Hello");

        // check using objects its return false because reference of both is different
        //its return false because both have different object
        System.out.println("\n" + (string5 == string6));
        //its return true because its check content not the reference
        System.out.println("\n" + (string5.equals(string6)));

    }

}
