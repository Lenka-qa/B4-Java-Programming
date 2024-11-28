package day19_nested_loops;

import java.util.Scanner;

/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter multi words sentence: ");
        String str = key.nextLine().trim().toLowerCase(); // Today is sUNDAY ---- > today is sunday
        String camelcase = "" + str.charAt(0);  // t

        // today is -- > length = 8
        // 01234567
        // Repetitive action
        //      - get the letter + check if one before is space
        //                 if it space, get the current letter and make it uppercase and concate
        //                 if it is not space, get the current one and concate as it is.

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i-1) == ' '){
                camelcase += ( "" + str.charAt(i) ).toUpperCase(); // i
            } else {
                camelcase += str.charAt(i);
            }

        }

        // today is sunday
        // 01234567890....

        camelcase = camelcase.replace(" ", "");
        System.out.println(camelcase);


        /*
            TODO: Practice Task
                Implement this code with while loop
                    Hint: while loop condition - continue as long as there space
         */

    }
}




































