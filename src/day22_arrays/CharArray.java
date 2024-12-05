package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String word = "loopcamp";
        System.out.println("String size: " + word.length());
        System.out.println("Print: " + word);


        System.out.println("-------------------");
        char []  letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};
        System.out.println("char array size: " + letters.length);
        System.out.println(letters); // why this does not give me memory location but give actual String
        // If you print char [] directly, it will convert it to String and print
        System.out.println("Print with concate: " + letters); // with concatenation, it will show the memory location.
        System.out.println("Print with .toString(): " + Arrays.toString(letters));


        // loopcamp
        // 01234567
        System.out.println("-------------------");
        char [] wordLetters = new char[word.length()];
        System.out.println("char array2 size: " + wordLetters.length);
        System.out.println(wordLetters); // some memory location since that array does not have values
        System.out.println(Arrays.toString(wordLetters)); //some memory location since that array does not have values


        System.out.println("-------------------");
        for (int i = 0; i < word.length(); i++) { // iterate 8 times
            //System.out.println( word.charAt(i) );
            wordLetters [i] = word.charAt(i);
        }
        System.out.println(Arrays.toString(wordLetters));


        System.out.println("-------------------");
        // .toCharArray() --- >  will do exact same thing as the one above
        char [] wordLetters2 = word.toCharArray();
        System.out.println(Arrays.toString( wordLetters2 ));



        System.out.println("-------------------");
        char [] letters3 = "Wednesday".toCharArray(); // ['W', 'e'............ 'y']
        System.out.println(Arrays.toString(letters3));
        System.out.println(letters3);

        String word3 = new String(letters3); // this will convert the char Array into String
        System.out.println(word3);


    }
}
