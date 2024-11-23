package day09_a_scanner;

public class OrExample {
    public static void main(String[] args) {

        int apple = 5;
        int orange = 7;

        System.out.println(apple > 3 || orange < 5);
        // || --- > short circuit operator
        //                  true || true -- > true --- > compiler NOT executes the 2nd part
        //                  true || false - > true ----- > compile executes the  2nd part
        // ONLY             false || false  > false ---- > compiler executes the 2nd part
        //                  false || ture  > true  --- > > compiler executes the 2nd part


    }
}
