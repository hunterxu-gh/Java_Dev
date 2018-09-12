import com.sun.javafx.runtime.SystemProperties;

/**
 * ShowCurrTime
 */
public class ShowCurrTime {

    public static void main(String[] args) {
        long totalMillSeconds = System.currentTimeMillis();

        //long totalSeconds = System.currentTimeMillis() / 1000;
        long totalSeconds = totalMillSeconds / 1000;

        long currentScends = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        
        long currentHours = totalHours % 24;

        System.out.println("Current Time is: " + currentHours + ":" + currentMinutes +
                            ":" + currentScends + " GMT.");                  
    
    }
}