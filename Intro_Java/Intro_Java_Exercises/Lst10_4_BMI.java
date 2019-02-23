package Intro_Java_Exercises;

/**
 * Lst10_4_BMI
 */
public class Lst10_4_BMI {
    public static final double KILOGRAMS_PER_POUNDS = 0.45359237;
    public static final double METERS_PER_INCHES = 0.0254;
    private String name;
    private int age;
    private double height;
    private double weight;

    public Lst10_4_BMI(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Lst10_4_BMI(String name, double height, double weight) {
        this(name, 20, height, weight);
    }

    public double getBMI() {
        double kilograms = weight * KILOGRAMS_PER_POUNDS;
        double meters = height * METERS_PER_INCHES;
        double BMI = kilograms / (meters * meters);

        return BMI;
    }

    public String getStatus() {
        double BMI = getBMI();

        if (BMI < 18.5)
            return("Underweight");
        else if (BMI >= 18.5 && BMI <=25.0)
            return("Normal");
        else if (BMI >= 25.0 && BMI <=30.0)
            return("Overweight");
        else 
            return("Obese");
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}