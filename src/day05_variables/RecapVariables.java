package day05_variables;

public class RecapVariables {

    public static void main (String [] args) {

        // Declared some variables [LOCAL VARIABLES]
        byte numOfTeaCup;
        double totalPrice;
        int numOfTotalStudents;

        // Since we have NOT given initial values to these variables, we canNOT use them
        // System.out.println(numOfTeaCup);
        // System.out.println(totalPrice);
        // System.out.println(numOfTotalStudents);


        // ASSIGNING / INITIALIZING the variables
        numOfTeaCup = 4;
        totalPrice = 20.0;
        numOfTotalStudents = 30;

        // Since we have given/assigned the VALUES now, we can use those variables/containers
        System.out.println(numOfTeaCup);
        System.out.println(totalPrice);
        System.out.println(numOfTotalStudents);

        System.out.println("--------");
        System.out.println(numOfTeaCup * numOfTotalStudents); // 4 * 30 --- > int * int -- > 120
        System.out.println(numOfTeaCup + " * " + numOfTotalStudents); // int + String + int --- > 4 * 30


        System.out.println("--------");
        // Declare and Assign in ONE statement together
        double temperature = 67.7;
        int day = 4;
        System.out.println("Today is " + 4 + "th day of the week"); // HARDCODED
        System.out.println("Today is " + day + "th day of the week"); // DYNAMIC CODE

        System.out.println("\nToday the temperature was " + temperature + " degree");

    }

}