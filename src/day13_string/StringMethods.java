package day13_string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

//        Scanner key = new Scanner(System.in);
//        key.nextInt();

        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");


        // == ------ > this will compare MEMORY LOCATION
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name2 == name3); // false

        System.out.println("---------");


        //#1 - .equals() --- > this will compare String VALUE taking into consideration case sensitiveness
        System.out.println( name1.equals(name2) );
        System.out.println( name2.equals(name3) );
        System.out.println( name1.equals(name3) );

        System.out.println( "Micky".equals(name1) );
        System.out.println( name1.equals("Micky") );

        System.out.println( new String("Micky").equals(name1));
        System.out.println( name1.equals( new String("Micky") ));

        System.out.println( "Micky".equals( new String ("Micky")  ));
        System.out.println( new String("Micky").equals("Micky" ));


        String str1 = new String("Micky");
        String str2 = new String("Micky");
        System.out.println(str1.equals( str2 ));

        String str3 = "Micky";
        String str4 = "MICKY";
        System.out.println( str3.equals(str4));

        boolean resutl = str3.equals(str4);


        // Q: then how do we ignore the case sensitiveness
        //#2 - .equalsIgnoreCase(); --- > this will compare String VALUE ignoring case sensitiveness
        System.out.println(str3.equalsIgnoreCase(str4));

        String word1 = "Monday";
        String word2 = new String("MONDAY");
        System.out.println("Comparing values: " + word1.equalsIgnoreCase(word2));
        String word3 = "Mon";
        System.out.println(word1.equalsIgnoreCase(word3));
        boolean result = word1.equalsIgnoreCase(word2);

        char letter1 = 'A';
        String letter2 = "B";

        System.out.println(  (letter1+"").equals(letter2));

        System.out.println("-----------------");

        // Q: How about, I want to see how many letters are in a String
        //#3 - .length(); --- > this method will give us the number of the characters in String

        String school = "loop camp!";
        System.out.println(school);
        System.out.println(school.length());
        int numOfChars = school.length();
        System.out.println("Number of characters: " + numOfChars);

        System.out.println(str2.length());





    }
}
