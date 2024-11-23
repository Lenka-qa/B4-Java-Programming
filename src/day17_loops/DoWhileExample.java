package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {


        // DO WHILE loop
        int n = 1;
        do {
            System.out.println("DO WHILE loop: " + n);
            n++;
        } while (n <= 10);
        // flow
        //      1st execute code block
        //      2nd check condition


        System.out.println();

        // WHILE loop
        int m = 1;
        while (m <= 10){
            System.out.println("WHILE loop: " + m);
            m++;
        }
        // flow
        //      1st - check condition
        //      2nd - if true execute the code block


    }
}