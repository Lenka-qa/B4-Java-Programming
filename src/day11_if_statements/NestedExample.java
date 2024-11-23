package day11_if_statements;

public class NestedExample {
    public static void main(String[] args) {


        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean d = false;


        if (a) {
            System.out.println("1");

            if (b){ // NESTED IF STATEMENT
                System.out.println(3);
            }

        } else {
            System.out.println("2");

            if (c) {
                System.out.println(4);
            }

            if (d) {
                System.out.println(5);
            } else {
                System.out.println(6);
            }

        }


    }
}