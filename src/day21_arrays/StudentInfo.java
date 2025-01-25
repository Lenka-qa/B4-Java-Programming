package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    all String types
    0 -> id
    1 -> first name
    2 -> last name
    3 -> batch number

 */
public class StudentInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String [] stundet1 = {"ID#B#4#1", "Tom", "Jerry", "B#4"};
        System.out.println(Arrays.toString( stundet1 ));

        System.out.println("------------------------------");
        String [] student2 = new String[4];
        student2 [1] = "Winne";
        student2 [0] = "ID#B#4#2";
        System.out.println(Arrays.toString(student2)); // default values for String -- null
        student2 [2] = "Pooh";
        student2 [3] = "B#4";
        System.out.println(Arrays.toString(student2));


        System.out.println("------------------------------");
        String [] student3 = new String[4];


        System.out.print("Please, enter ID: ");
        student3 [0] = key.nextLine();
        System.out.print("Please, enter first name: ");
        student3 [1] = key.nextLine();
        System.out.print("Please, enter last name: ");
        student3 [2] = key.nextLine();
        System.out.print("Please, enter batch number: ");
        student3 [3] = key.nextLine();


        System.out.println(Arrays.toString(student3));

        System.out.println("------------------------------");
        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch number: "};
        String [] student4 = new String[4];

        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions [i]);
            student4 [i] = key.nextLine();
        }
        System.out.println(Arrays.toString(student4));


        /*
            TODO: Home Practice
                Ask a user how many student info will be entered
                After getting info for each. Print them.

                Hint: Nested Loop
         */

    }
}
