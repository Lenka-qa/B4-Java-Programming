package day21_arrays;

import java.util.Scanner;

/*

    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers

 */
public class SelectMonth {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a number and I will give you month name.");
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //                    0      1      2      3      4      5      6       7    8       9       10    11




        int userNum;
        do {
            System.out.print("Enter: ");
            userNum = key.nextInt();

            if (userNum >= 1 && userNum <= 12) {
                System.out.println( "The month for number " + userNum + " is " + months [ userNum - 1 ]  );
            }



//            if (userNum == 1) {
//                System.out.println("January");
//            } else if (userNum == 2){
//                System.out.println("February");
//            } else if (userNum == 3){
//                System.out.println("March");
//            } else if (userNum == 4){
//                System.out.println("April");
//            }
//            //...


        } while (userNum < 1 || userNum > 12); // if userNum is not in the range as again.



    }
}
