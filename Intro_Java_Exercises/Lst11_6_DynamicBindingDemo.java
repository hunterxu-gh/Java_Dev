package Intro_Java_Exercises;

/**
 * Lst11_6_DynamicBindingDemo
 */
public class Lst11_6_DynamicBindingDemo {

    public static void main(String[] args) {
        m(new GraduateStudent()); // = Object o = new GraduateStudent(); m(o);
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {

}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}