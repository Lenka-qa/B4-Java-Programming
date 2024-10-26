package day04_variables;
/*
class name Olympics

    create a variable for the year
    print the country and year for next couple events
    reassign year value each time. Country name is hard coded

    data:

        China 2026
        France 2030
        Italy 2034

    Looking forward to the year $year for the Olympics to be in $location
 */
public class Olympics {

    public static void main(String[] args) {

        int year;
        year = 2026;
        System.out.println("China " + year);
        year = 2030;
        System.out.println("France " + year);
        year = 2034;
        System.out.println("Italy " + year);



//        //We made this sample to make our code even more DYNAMIC
//        int year;
//        year = 2026;
//        System.out.println("China " + year);
//        year = year + 4;
//        System.out.println("France " + year);
//        year = year + 4;
//        System.out.println("Italy " + year);


    }

}