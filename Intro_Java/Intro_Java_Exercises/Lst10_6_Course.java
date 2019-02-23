package Intro_Java_Exercises;

/**
 * Lst10_6_Course
 */
public class Lst10_6_Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Lst10_6_Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String students){
        this.students[numberOfStudents] = students;
        numberOfStudents++;
    }

    // Exercise
    public void dropStudent(String[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == students.toString())
                students[i] = "";
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}