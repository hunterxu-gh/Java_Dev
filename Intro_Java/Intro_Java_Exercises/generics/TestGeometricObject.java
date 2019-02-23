/**
 * TestGeometricObject
 * 这个例子是用来讲解Abstract Classes的作用：可以将两个子类的相同属性进行比较
 */
public class TestGeometricObject {

    public static void main(String[] args) {
        GeometricObject obj1 = new Circle(5);
        GeometricObject obj2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(obj1, obj2));

        displayGeometricObject(obj1);
        displayGeometricObject(obj2);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is: " + object.getArea());
        System.out.println("The perimeter is: " + object.getPerimeter());
    }
}