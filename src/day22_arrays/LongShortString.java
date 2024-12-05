package day22_arrays;

public class LongShortString {
    public static void main(String[] args) {

        String [] words = {"java", "selenium", "softskill", "mentors", "loop"};
        String longest = words[0];  // java
        String shortest = words[0]; // java


        for ( String eachElement : words) {

            if (eachElement.length() >= longest.length()) {
                longest = eachElement;
            }

            if (eachElement.length() <= shortest.length()) {
                shortest = eachElement;
            }

        }


        System.out.println("Longest String: " + longest);
        System.out.println("Shortest String: " + shortest);



    }
}