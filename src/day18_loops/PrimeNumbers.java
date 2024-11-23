package day18_loops;

import java.util.Scanner;

/*
            [IQ] Prime number [Loops]

            Give a number determine if it is a prime number. A prime number is a number that is ONLY divisible fully by 1 and itself.

            Ex:
                Input:
                    11  ----- > 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 --- > 2 times

                Output:
                    prime

            Ex:
                Input:
                    10 ------ > 1, 2, 4, 5, 6, 7, 8, 9, 10 --- > 4 times

                Output:
                    not prime
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int num = key.nextInt();
        int count = 0;


        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println(num + " is PRIME number");
        } else {
            System.out.println(num + " is NOT PRIME number");
        }

    }
}
