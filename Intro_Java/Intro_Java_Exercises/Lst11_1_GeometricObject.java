package Intro_Java_Exercises;

import java.util.Date;

/**
 * Lst11_1_GeometricObject
 */
public class Lst11_1_GeometricObject {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public Lst11_1_GeometricObject() {
        dateCreated = new Date();
    }

    public Lst11_1_GeometricObject(String color, boolean fiiled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "create on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}