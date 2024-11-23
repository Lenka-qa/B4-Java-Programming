package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String word = "loopcamp";
        //             01234567

        System.out.println(word.charAt(0)); // l
        System.out.println(word.charAt(1)); // o
        System.out.println(word.charAt(2)); // o
        System.out.println(word.charAt(3)); // p
        System.out.println(word.charAt(4)); // c
        System.out.println(word.charAt(5)); // a
        System.out.println(word.charAt(6)); // m
        System.out.println(word.charAt(7)); // p


        System.out.println("-----");
        for (int i = 0; i < word.length(); i++) {
            System.out.println( word.charAt( i ));
        }


        System.out.println("-----");
        // print the chars from end to the beginning
        for (int i = word.length()-1; i >= 0 ; i--) {
            System.out.println( word.charAt( i ));
        }


        // Can you revers the word?
        //word = "loopcamp";
        String reversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt( i ); // reversed = "" + p; | reversed = "p" + m |  reversed = "pm" + a
        }
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);

    }
}
