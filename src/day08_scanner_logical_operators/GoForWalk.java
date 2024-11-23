package day08_scanner_logical_operators;
/*
     Want to go for a walk
     We will go for a walk
           if it is not raining
           and the weather is above 70

 */
public class GoForWalk {
    public static void main(String[] args) {

        boolean isRaining = true;
        int temperature = 80;

        boolean isGoodToWalk = !isRaining && temperature > 70;
        // AND ---- > true and true ---- > true

        System.out.println("Is it good to go for a wall: " + isGoodToWalk);

    }
}