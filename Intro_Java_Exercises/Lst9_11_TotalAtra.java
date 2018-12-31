/**
 * Lst9_11_TotalAtra
 */
public class Lst9_11_TotalAtra {

    public static void main(String[] args) {
        Circle[] circleArray;

        circleArray = creatCircleArray();

        printCircleArray(circleArray);
    }

    public static Circle[] creatCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        // return a circle array
        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("--------------------------");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circle is", sum(circleArray));      
    }

    public static double sum(Circle[] circleArray) {
        double sum = 0;

        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}