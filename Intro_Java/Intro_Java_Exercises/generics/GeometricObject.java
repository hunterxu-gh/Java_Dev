import java.util.Date;
/**
 * GeometricObject
 */
public abstract class GeometricObject { // 抽象类，不实现实例对象

    private String color = "white"; // 颜色
    private boolean filled; // 是否填充
    private Date dateCreated; // 创建日期

    public GeometricObject() { // 构造函数
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean fiiled) { // 带参数的构造函数
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { // getter and setter
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

    @Override
    public String toString() {
        return "create on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea(); // 抽象方法，只声明，在子类中进行覆盖
    public abstract double getPerimeter();
}