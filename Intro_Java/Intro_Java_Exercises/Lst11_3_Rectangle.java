package Intro_Java_Exercises;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Lst11_3_Rectangle
 */
public class Lst11_3_Rectangle extends Lst11_1_GeometricObject {

    private double width;
    private double height;

    public Lst11_3_Rectangle() {

    }

    public Lst11_3_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Lst11_3_Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
}