import java.util.Comparator;
/**
 * TestComparator
 */
public class TestComparator {

    public static void main(String[] args) {
        GeometricObject o1 = new Rectangle(5, 5);
        GeometricObject o2 = new Circle(5);

        GeometricObject o = max(o1, o2, new GeometricObjectComparator());

        System.out.println("The area of the larger object is " + o.getArea());

    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2, Comparator<GeometricObject> c) {
        if (c.compare(o1, o2) > 0)
            return o1;
        else
            return o2;
    }
}