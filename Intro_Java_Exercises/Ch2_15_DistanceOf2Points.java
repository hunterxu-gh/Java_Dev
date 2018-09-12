import java.util.Scanner;

/**
 * Ch2_15_DistanceOf2Points
 */
public class Ch2_15_DistanceOf2Points {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextByte();    
        double y1 = input.nextByte();    
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextByte();    
        double y2 = input.nextByte();    
    
        double distance = Math.pow((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1), 0.5);
        System.out.println("The distance between two points is " + distance);
    }

}