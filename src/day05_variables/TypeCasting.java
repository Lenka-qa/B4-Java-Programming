package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;

        int x;
        double y = 2.5;
        x = 2;

        int i2 = 100;
        // byte b2 = ;  // the int value canNOT AUTOMATICALLY CONVERTED into byte.
        byte bb2 = 100;
        byte b2 = (byte)i2;  //Since we canNOT AUTOMATICALLY CONVERT int into byte, we caN use CASTING

        System.out.println();

        int i3 = 150;
        byte b3 = (byte)i3;  //byte rance is - 128 to 127 -----> then DATA LOSS is happening
        System.out.println(i3);
        System.out.println(b3);

        double d1 = 34.6;
        int i4 = (int)d1;  // After CASTING, it will keep the whole portion and loose decimal part
        System.out.println(d1);
        System.out.println(i4);

        System.out.println();
        int i5 = 46;
        double d5 = i5;  //CONVERSION happens AUTOMATICALLY -----> WIDENING CONVERSION
        System.out.println(i5);
        System.out.println(d5);




    }
}
