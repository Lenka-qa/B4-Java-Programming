package day22_arrays;
/*
        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array
 */
public class MinMax {

    public static void main(String[] args) {

        int [] nums = {500, 1120, -90, 90, 250, - 100};

        //int max = Integer.MIN_VALUE;
        int max = -2147483647;
        // int min = Integer.MAX_VALUE;
        int min = 2147483647;


        for ( int eachElem : nums) {

            if (eachElem > max) {
                max = eachElem;
            }

            if (eachElem < min) {
                min = eachElem;
            }

        }


        System.out.println("Max: " + max);
        System.out.println("Min: " + min);






    }

}