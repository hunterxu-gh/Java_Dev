package Intro_Java_Exercises;

import java.util.ArrayList;

/**
 * Lst11_8_TestArrayList
 */
public class Lst11_8_TestArrayList {

    public static void main(String[] args) {
       ArrayList<String> cityList = new ArrayList<>();
       
       cityList.add("London");
       cityList.add("New York");
       cityList.add("Beijing");
       cityList.add("Shanghai");
       cityList.add("Guangzhou");
       cityList.add("Paris");
       cityList.add("Tokyo");
       cityList.add("Hongkong");

       System.out.println("List size? " + cityList.size());
       System.out.println("Is Miami in the list?" + cityList.contains("Miami"));
       System.out.println("The location of Shanghai in the list?" + cityList.indexOf("Shanghai"));
       System.out.println("Is the list empty?" + cityList.isEmpty());
       cityList.add(2, "Xian");
       cityList.remove("Tokyo");
       cityList.remove(1);
       System.out.println(cityList.toString());

       for (int i = cityList.size() - 1; i >= 0; i--) {
           System.out.print(cityList.get(i) + " ");
       }
       System.out.println();

       ArrayList<Lst11_2_Circle> list = new ArrayList<>();

       list.add(new Lst11_2_Circle(2));
       list.add(new Lst11_2_Circle(3));

       System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}