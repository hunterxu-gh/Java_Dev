package Intro_Java_Exercises;

/**
 * Lst9_4_TestTV
 */
public class Lst9_4_TestTV {

    public static void main(String[] args) {
        Lst9_3_TV tv1 = new Lst9_3_TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        Lst9_3_TV tv2 = new Lst9_3_TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("Television1's Channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("Television2's Channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}