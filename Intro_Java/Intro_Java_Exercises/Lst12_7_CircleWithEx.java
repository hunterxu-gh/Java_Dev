package Intro_Java_Exercises;

/**
 * Lst12_7_CircleWithEx
 */
public class Lst12_7_CircleWithEx {

    private double radius;

    private static int numberOfObjects = 0;

    public Lst12_7_CircleWithEx() {
        this(1.0);
    }

    public Lst12_7_CircleWithEx(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRaduis() {
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius > 0)
            this.radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be zero or negative");
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findAreaa() {
        return radius * radius * 3.14;
    }
}