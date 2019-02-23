package Intro_Java_Exercises.zju.database;

/**
 * DVD
 */
public class DVD extends Item {
    private String director;

    public DVD(String title, String director, int playTime, String comment) {
        super(title, playTime, false, comment);
        this.director = director;
    }

    public void print() {
        System.out.print("DVD: ");
        super.print();
        System.out.println(director);
    }

    public static void main(String[] args) {
        
    }
}