package day07_relational_operators;
/*
     Task:
        Declare and assign a number

        I want to know the sign of the number
            if the number positive
            is the number negative
            is the number 0
 */
public class SignType {
    public static void main(String[] args) {
        int num = -23;

        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num == 0;

        System.out.println(num + " is positive: " + isPositive);
        System.out.println(num + " is negative: " + isNegative);
        System.out.println(num + " is zero: " + isZero);

    }
}