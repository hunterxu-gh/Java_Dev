/**
 * Lst9_3_TV
 * 面向对象编程中类的编写的第1种形式：单独成一个类，通过另一个Java文件进行.调用
 * 比较推荐
 */
public class Lst9_3_TV {
    int channel = 1; // range 1-120
    int volumeLevel = 1; // range 1-7
    boolean on = false; // default

    public TV() {
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel (int newChannel) {
        if (on && newChannel < 1 && newChannel > 120)
            System.out.println("Invalid Channel Set!");
        channel = newChannel;
    }

    public void setVolume (int newVolume) {
        if (on && newVolume < 1 && newVolume > 7)
            System.out.println("Invalid Volume Set!");
        volumeLevel = newVolume;
    }

    public void channelUp(){
        if (on && newChannel < 120)
            channel++;
    }

    public void channelDown() {
        if (on && newChannel > 1)
            channel--;
    }

    public void volumeUp() {
        if (on && newVolume < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && newVolume > 1)
            volumeLevel--;
    }
}