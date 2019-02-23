/**
 * BoundedTypeDemo
 * 这个例子是用来讲解Generic Method的Bounded Type的作用：同样可以将两个子类的相同属性进行比较，区别在于E的用法
 */
public class BoundedTypeDemo {

    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Same Area? " + equalArea(rect, cir));

        displayGeometricObject(rect);
        displayGeometricObject(cir);
    }

// 注意这个E，E扩展自GeometricObject类，说明E这个Generic类型所能放的参数类型只能是GeometricObject子类的类型
//（因为GeometricObject类是个Abstract Class）
// 在这个例子中，GeometricObject的子类有两个：Rectangle和Circle，即表示E只能被Rect或Cir替换
// 即表示equalArea方法只能被GeometricObject Class下的Rect和Cir子类所调用，而equalArea()的功能就是比较面积的大小
// 比较“谁”的面积大小的“谁”，就是E这个Generic类型规定的
    public static <E extends GeometricObject> boolean equalArea(E obj1, E obj2) {
        return obj1.getArea() == obj2.getArea();
    }

// 同理，displayGeometricObject只对GeometricObject Class中的子类起作用，目前来说就是Rect和Cir类
    public static <E extends GeometricObject> void displayGeometricObject(E obj) {
        System.out.println();
        System.out.println("The area is " + obj.getArea());
        System.out.println("The perimeter is " + obj.getPerimeter());
    }
}

/** 
 * 由此例可以看出，Abstract和Interface是一个Coin的两面，Abstract可以实现多个对象的统一操作/管理，
 * 而Interface使得一个对象可以实现多种功能，是对Inherence的一个扩展
 * 而Generic，首先是建立在Abstract的基础上? 对Class, Interface和Method的扩展
 * 需要注意的，就是Inherence和Interface以及Generic的区别和联系
 */
