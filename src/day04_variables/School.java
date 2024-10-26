package day04_variables;
/*
    Task:
        class name: School

        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5

            total number of students in your school


    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
public class School {
    public static void main(String[] args) {

        int numberOfStudentsInGrade1 = 20;
        int numberOfStudentsInGrade2 = 30;
        int numberOfStudentsInGrade3 = 40;
        int numberOfStudentsInGrade4 = 50;
        int numberOfStudentsInGrade5 = 60;

        int totalStudentNumber = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;
        // System.out.println(totalStudentNumber);

        double numOfDaysInAYear = 100.5;
        double numOfSnowDays = 12.5;
        double averageGpa = 2.6;

        System.out.println("Number of Students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of Students in Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of Students in Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of Students in Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of Students in Grade 5: " + numberOfStudentsInGrade5);

        System.out.println();

        System.out.println("Total Student Numbers in our School: \t" + totalStudentNumber);
        System.out.println("Number of School Days: \t\t\t\t\t" + numOfDaysInAYear);
        System.out.println("Number of Snow Days: \t\t\t\t\t" + numOfSnowDays);
        System.out.println("Average GPA: \t\t\t\t\t\t\t" + averageGpa);

    }

}