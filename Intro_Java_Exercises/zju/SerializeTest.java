package Intro_Java_Exercises.zju;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serializable
 */

class Student implements Serializable {
    //private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private int grade;

    public Student (String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + grade;
    }
}

public class SerializeTest {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("John", 15, 5);
            System.out.println(s1);
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("object.dat")
            );
            out.writeObject(s1);
            out.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    
}