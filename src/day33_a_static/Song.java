package day33_a_static;
// Template Class - sent the instruction for each object of this class
public class Song {
    // Instance Variables - each object has its own set of copies - No static
    String name;
    double length;
    String singer;
    String genre;

    // CONSTRUCTOR - special method, No return, used to initialize the instance variables
    // 1st Constructor - name
    public Song (String name){
        //name = name; // Here compiler prioritizes the LOCAL over INSTANCE since both have same name
        this.name = name; // We can use 'this' to make the difference.
    }



    // 2nd Constructor - name, length
    public Song (String name, double length){
        //this.name = name;
        this(name);
        this.length = length;
    }


    // 3rd Constructor - name, length, singer, genre

    public Song(String name, double length, String singer, String genre) {
        //this.name = name;
        //this.length = length;
        this(name, length);
        this.singer = singer;
        this.genre = genre;
    }

    // If this toString() method is not declared explicitly, printing the object will give a memory location
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
