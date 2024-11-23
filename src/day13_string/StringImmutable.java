package day13_string;

public class StringImmutable {
    public static void main(String[] args) {
        String str1 = "loop";
        System.out.println(str1);

        str1 = str1.toUpperCase();
        System.out.println(str1);

        str1 = str1 + "camp";
        System.out.println(str1);

        String str2 = new String("Loop");
        str2 = str2 + "camp";


    }
}