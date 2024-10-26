package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main (String [] args) {

        // This is explaining the spaces/tab
        System.out.println("A Sentence");           // has not space at the beginning
        System.out.println(" A Sentence");          // has 1 space at the beginning
        System.out.println("  A Sentence");         // has 2 spaces at the beginning
        System.out.println("   A Sentence");        // has 3 spaces at the beginning
        System.out.println("    A Sentence");       // has 4 paces at the beginning

        // Now, I will use tab to do 4 spaces at one:  \t  --- >  4 spaces
        System.out.println("\tA Sentence");

        // Lets ut 2 tabs
        System.out.println("        A Sentence");
        System.out.println("\t\tA Sentence");

        System.out.println();


        // This is explaining New Line
        System.out.println("1) Unlock the car door");
        System.out.println("2) Get into the car");
        System.out.println("3) Start the car");

        System.out.println();
        System.out.println("1) Unlock the car door\n2) Get into the car\n3) Start the car");

        System.out.println();

        System.out.println("Week Days:\n    Monday\n    Tuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\tSunday");
        /*
        Week Days:
            Monday
            Tuesday
            .
            .
            .
            Sunday
         */
    }

}