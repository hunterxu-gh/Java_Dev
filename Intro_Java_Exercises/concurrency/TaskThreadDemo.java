/**
 * TaskThreadDemo
 */
public class TaskThreadDemo {

    public static void main(String[] args) {
        // Create task
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrintChar implements Runnable {
    private char charToPrint;
    private int times;

    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < times; i++) { // start from 0;
                System.out.print(charToPrint);
                if (i >= 50)
                    Thread.sleep(1); // sleep for x ms.
            }
        }
        catch (InterruptedException ex) {
        }
    }
}

class PrintNum implements Runnable {
    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
    public void run() {
        Thread thread4 = new Thread(new PrintChar('c', 40));
        thread4.start();
        for (int i = 1; i <= lastNum; i++) { // start from 1;
            System.out.print(" " + i);
            //Thread.yield(); // pause for other task
            if (i == 50) 
                thread4.join(); // when thread 4 stop, continue print100
        }
    }
}