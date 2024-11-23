package day13_string;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String str = "Wednesday";

        System.out.println(str);

        //#4 - .toUpperCase(); --- >this will convert the string into UPPER CASE
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str = str.toUpperCase(); // REASSIGNED --- "WEDNESDAY"

        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);



        System.out.println("---------------");
        //#5 - .toLowerCase(); --- >this will convert the string into lower case
        System.out.println(str.toLowerCase());
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str);



    }
}