package day05_variables;
/*
    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are they full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)

    Print all the variables

    PTO - Paid Time Off
 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        int age, numOfPTO;
        char gender, suite;  //M, F
        boolean isFullTime, isMarried;
        double salary;


        firstName = "Tom";
        lastName = "Jerry";
        companyName = "Loopcamp";
        jobTitle = "SDET";  // Software Development Engineer in Test
        age =  30;
        numOfPTO = 21;
        salary = 120_000.00; // 120,000.00 - instead of comma you can use underscore - compiler will avoid it.
        isFullTime = true;
        isMarried = false;
        gender = 'M';
        suite = 'A';

        String fullReport = "Full Report: \n\tFirst Name:\t\t" + firstName + "\n\tLast Name:\t\t" + lastName + "\n\tCompany Name:\t" + companyName + "\n\tJob Title:\t\t" + jobTitle + "\n\tAge:\t\t\t" + age + "\n\tPTO Amount:\t\t" + numOfPTO + "\n\tSalary: \t\t$" + salary + "\n\tIs Full Time?\t" + isFullTime + "\n\tIs Married?\t\t"  + isMarried + "\n\tGender:\t\t\t" + gender + "\n\tSuite:\t\t\t" + suite;
        System.out.println(fullReport);

        /*
        Full Report:
            First Name:     Tom
            Last Name:      Jerry
            Company Name:   Loopcamp
            Job Title:      SDET
            Age:            30
            PTO Amount:     21
            Salary:         $120000.00
            Is Full Time?   true
            Is Married?     false
            Gender:         M
            Suite:          A
         */
        System.out.println();
        System.out.println(fullReport);
        System.out.println();
        System.out.println(fullReport);



    }
}