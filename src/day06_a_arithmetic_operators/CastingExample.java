package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        int num1 = 10;
        float num2 = num1; // going from SMALL to BIG  (Assigning the SMALL into BIG) WIDENING CASTING - happens AUTOMATICALLY (IMPLICITLY)
        System.out.println(num1);
        System.out.println(num2);


        System.out.println();
        float num3 = 3.4F;
        short num4 = (short)num3;  // going from BIG to SMALL (Assigning the BIG into SMALL) NARROWING CASTING - happens MANUALLY (EXPLICITLY) - there might be a DATA LOSS
        // short num5 = (int)num3;     // going from FLOAT to INT -- > INT is bigger than SHORT
        short num6 = (byte)num3;     // going from FLOAT to BYTE -- > BYTE is smalled than SHORT - so it can hold it - No need to EXPLICIT casting
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num6);


        // We can convert the char into int because each character has a number assigned to it from ASCII/UNICODE table.
        System.out.println();
        char letter  = 'A';
        int letterInNum = letter; // going from SMALLER to BIG - no need EXPLICIT CASTING
        System.out.println(letter);
        System.out.println(letterInNum);

        String letter2 = "B";
        // int letterInNum2 = letter2;  // NOT VALID

        System.out.println('C');
        System.out.println((int)'C');
        System.out.println((int)'%');

    }
}