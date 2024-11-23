package day12_switch_statements;
/*
    Take a number and print the number as the word version
    1 -> one
    2 -> two
    ...
 */
public class NumberInWords2 {
    public static void main(String[] args) {
        int num = 9;    // 1 - 5  ---- it is not in the rage of 1-5


        // else if
//        if (num == 1){
//            System.out.println("One");
//        } else if (num == 2) {
//            System.out.println("Two");
//        } else if (num == 3) {
//            System.out.println("Three");
//        } else if (num == 4) {
//            System.out.println("Four");
//        } else if (num == 5) {
//            System.out.println("Five");
//        } else {
//            System.out.println("Not in range 1-5");
//        }





        // switch case
        switch (num) { // String, char, int, short, byte

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default: // else part -
                System.out.println("Not in range 1-5");
                break; //  if default statement is the last one you do not need the break.


            // If you do not put "break;" -- >  execution goes from matching case all the way until the first "break" or all the way to the end


        }











    }
}