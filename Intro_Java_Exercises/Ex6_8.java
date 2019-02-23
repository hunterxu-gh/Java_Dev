/**
 * Ex6_8
 */
public class Ex6_8 {

    public static void main(String[] args) {
        System.out.printf("%5s%15s%17s%8s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("------------------------------------------------");
        double mile = 1;
        double kilometer = 20;
        for (int i = 1; i <= 10; mile++, kilometer += 5, i++) {
            System.out.printf("%-5.0f%15.2f     | %-13.0f%-10.2f\n", mile, mileToKilometer(mile), kilometer, kilometerToMile(kilometer));
        }
    }

    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}