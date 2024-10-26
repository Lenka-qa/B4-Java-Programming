package day06_a_arithmetic_operators;

public class DifferentDataTypes {

    public static void main(String[] args) {

        // both are int - result is int
        System.out.println(10 - 5);
        System.out.println(10 * 5);

        // double / int - result is double
        System.out.println(10.0 / 5);

        // double / double - result is double
        System.out.println(10.0 / 2.0);


        // int / double - result is double
        System.out.println(10 / 2.0);

        System.out.println();
        // double / double --- > int / double --- > double
        System.out.println((int)10.5 / 5.0);    // 10 / 5.0 -- > int / double -- > result double
        System.out.println(10.5 / 5.0);         // 10.5 / 5.0 -- > double / double --- > result double

        System.out.println((int)10.5 / (int)5.0); // 10 / 10 --- > int / int --- result is int
        System.out.println( (int)(10.5 / 5.0) );  // (double / double) --  (int)double -- > int


    }

}