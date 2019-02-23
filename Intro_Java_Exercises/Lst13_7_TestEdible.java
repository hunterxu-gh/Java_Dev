/**
 * Lst13_7_TestEdible
 */
public class Lst13_7_TestEdible {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for (int i = 0; i < objects.length; i++) { // Traverse all objects such as Tiger, Chicken and Apple
            if (objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());

            if (objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        } // for Chicken, it is an animal and it can be eaten.
    }
}
abstract class Animal { // not all of the animal can be eaten
    // 能实现private, getter和setter的只能是class而不能是interface
    // 接口的使用方法类似abstract class
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound(); // abstract method
}

class Chicken extends Animal implements Edible { // for Chicken, it is an animal and it can be eaten. so it contains 2 Override methods 
    @Override
    public String howToEat() {
        return "Fry it";
    }

    @Override
    public String sound() {
        return "Chiken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible { // all of the fruits can be eaten

}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider"; 
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}