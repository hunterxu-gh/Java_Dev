/**
 * Lst13_9_ComparableRectangle
 */
public class Lst13_9_ComparableRectangle extends Lst11_3_Rectangle implements Comparable<Lst13_9_ComparableRectangle> {
//Construct a ComparableRectangle with specified properties

    public Lst13_9_ComparableRectangle(double width, double height) {
        super(width, height);
    }
    @Override

    public int compareTo(Lst13_9_ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}