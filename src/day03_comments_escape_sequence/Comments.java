package day03_comments_escape_sequence;

public class Comments {

    public static void main(String[] args) {

        // 1-SINGLE LINE COMMENT
        // The line below prints a words "Loopcamp" and goes to next line
        System.out.println("Loopcamp");



        /*
           2 - MULTILINE COMMENT

           The following code is a PRINTLN statement
           IT prints out "Java"
           Then goes to the next line
         */
        System.out.println("Java");


        // To comment out or uncomment out portion of the code, select that portion and do the following shortcut
        // Commant + /
        //Ctrl + /

//        System.out.prirntln("Comment out");
//        System.out.prrintln("Test");
//        System.out.println("Check");
//        System.out.prirntln("Code");


        System.out.println("Valid code");


        /*
         3 - JAVA DOC COMMENT
         The following is Println statement
         It prints out "1st week of Java"
         This is written by QA team member: Elena
         */
        System.out.println("1st week of Java");


        // TODO: I need to find how much I spent for the computer
        System.out.println("I recently bought a computer for $......");

        /*
            TODO: Check how much you need to deposit
         */
        System.out.println("Deposit $... to my account");

        // toDo: this is just to remind that the syntax is not case sensitive

        /**
         * TodO: can be used with Java DOC comment as well
         */

    }

}