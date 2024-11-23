package day08_scanner_logical_operators;
    /*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers

        later divide your total into 2

        Hey now use the divided version and add 2
     */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);

        int total = num1 + num2 + num3;
        System.out.println("Total: " + total);

        int afterVisionBy2 = total / 2;
        System.out.println("After divided by 2: " + afterVisionBy2);

        System.out.println("After added 2: " + (afterVisionBy2 + 2)); //


        // can you get the modules by 2
        System.out.println("After added 2: " + afterVisionBy2 % 2); // 27x2 = 54 + 1
    }
}