package Intro_Java_Exercises.zju.database;

/**
 * CD
 */
public class CD extends Item {

    private String artist;
    private int numOfTracks;

    public CD(String title, String artist, int numOfTracks, int playingTime, 
                String comment) {
        super(title, playingTime, false, comment);
        //this.title = title;
        this.artist = artist;
        this.numOfTracks = numOfTracks;
        //this.playingTime = playingTime;
        //this.comment = comment;
    }

    public void print() {
        System.out.print("CD: ");
        super.print();
        System.out.println(": " + artist);
    }
    public static void main(String[] args) {
        
    }
}