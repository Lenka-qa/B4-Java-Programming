package day18_loops;

public class CountHi {
    public static void main(String[] args) {
        // Find how many "hi" is in the word

        String word = "aaaahisvshihihihhhiivshisvadhisdvs";
        int count = 0;



        for (int i = 0; i < word.length() - 1 ; i++) {

            if (word.charAt(i) == 'h' && word.charAt(i+1) == 'i'){
                count++;
            }

        }

        System.out.println("You got " + count + " times \"hi\" in \"" + word + "\"") ;

        //TODO: Home Practice: Try to do this code with the .substring() method





    }
}