/**
 * Lst18_7_HanoiTower
 */
public class Lst18_7_HanoiTower {
    static int counter = 0;
    public static void main(String[] args) {
        System.out.println(moveDisk(3, 'A', 'B', 'C'));
    }

    public static int moveDisk(int n, char aTower, char bTower, char cTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + aTower + " to " + cTower);
            counter++;
        }
        else {
            moveDisk(n - 1, aTower, bTower, cTower);
            System.out.println("Move disk " + n + " from " + aTower + " to " + cTower);
            moveDisk(n - 1, bTower, cTower, aTower);
            counter++;
        }

        return counter;
    }
}