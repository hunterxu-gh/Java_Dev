/**
 * Lst12_10_InvalidRadiusEx
 */
public class Lst12_10_InvalidRadiusEx extends Exception{
    private double radius;

    public Lst12_10_InvalidRadiusEx(double radius) {
        super("Invalid radius" + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}