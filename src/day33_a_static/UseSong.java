package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

// Template Class - the instruction to execute code from main() - Runner Class
public class UseSong {
    public static void main(String[] args) {
        Song song1 = new Song("Waka Waka");
        System.out.println(song1);

        Song song2 = new Song("Jingle Bell", 3.2);
        System.out.println(song2);


        Song song3 = new Song("Hit em up", 3.56, "2Pac", "Rap");
        System.out.println(song3);


        System.out.println("******************************************************************");
        String str1 = "One";  // created string using String literals
        String str2 = new String("Two"); // created using 'new' keyword

        String [] allStr = {str1, str2}; // stored NON-Primitive / Object type

        // str1, str2 -------------- >  Object type data ---- > String
        // song1, song2, song3 ----- >  Object type data ---- > Song

        Song [] allSongs = {song1, song2, song3};
        // get info for all songs
        System.out.println(Arrays.toString(allSongs));

        // get me the info for 2nd song
        // allSongs[1] --- > song2
        System.out.println(allSongs[1]);


        // How many songs I have in total
        System.out.println("Num of songs: " + allSongs.length);

        // Give me info for each song
        for ( Song each : allSongs){
            System.out.println(each);
        }


        System.out.println();
        // Find me the songs that has the length more than 3.3
        for ( Song each : allSongs){    // song1, song2, song3
            if(each.length > 3.3) {                 // song1.length  | song2.length | song3.length
                System.out.println(each);
            }
        }


        System.out.println("******************************************************************");
        ArrayList <Song> allSongsInList = new ArrayList<>();
        allSongsInList.addAll( Arrays.asList(song1, song2, song3) );
        for ( Song each : allSongsInList) {
            System.out.println(each);
        }


        System.out.println();
        // Give me only the Song names
        for ( Song each : allSongsInList) {
            System.out.println(each.name);
        }



    }
}
