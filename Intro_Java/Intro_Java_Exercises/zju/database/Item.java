package Intro_Java_Exercises.zju.database;

/**
 * Item
 */
public class Item {

    private String title;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public Item(String title, int playingTime, boolean gotIt, String comment) {
        //super();
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void print() {
        System.out.print(title);
    }
}