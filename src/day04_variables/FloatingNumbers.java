package day04_variables;

public class FloatingNumbers {
    public static void main(String[] args) {


        System.out.println(3);
        System.out.println(4);

        System.out.println(3 + 4);
        System.out.println(3 * 4);
        // In java we cannot store the fraction with int datatype
        System.out.println(3/4);         // 0.75 ---> int --- >  whole number portion --- >  0
        System.out.println(13/4);        // 3.25 ---> int --- >  whole number portion --- >  3

        // That is why we have floating data types
        double price =  10.99;  // this is the way you store decimal numbers with fractions. double is the one used MOSTLY with decimal numbers
        float gpa = 3.4f;       // this is another way you store decimal numbers with fraction. You must use F or f at the end of the value with float datatype


        System.out.println(price);  // Datatype --- >  double
        System.out.println(gpa);    // Datatype --- > float
        System.out.println(5.6);    // Datatype --- >  BY DEFAULT it is double
        System.out.println(3.0/4);
        //                  double / int --- >  result promotes to be the BIGGER data type in operations
        System.out.println(13/4.0);
        System.out.println(13.0/4);




    }
}