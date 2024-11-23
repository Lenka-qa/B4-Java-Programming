package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int n = 100;

        // relational operators

        System.out.println(n > 5 ); // this is a single statement
        System.out.println(n < 20); // this is a single statement

        // relational  and logical operators
        System.out.println(n > 5 && n > 20); //this us a single statement using logical relational operators
        //                      false && n < 20
        //                      false && true
        //                      range 5 ----- 20


        System.out.println("---------------");

        System.out.println(6 > 1 || false);
        //                  true ||

        System.out.println(1 > 5 || false);
        //                 falls || falls
        //                 falls


        System.out.println("-----------");
        System.out.println(true);
        System.out.println(!true); // NOT operator -- > NOT true --- > false
        System.out.println(!false); // ---------------> NOT false -- > true

        System.out.println(!(6 !=6));
        // (6 != 6) --- > false
        // !false ---- > true
    }

}
