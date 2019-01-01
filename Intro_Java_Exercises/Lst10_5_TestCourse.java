/**
 * Lst10_5_TestCourse
 */
public class Lst10_5_TestCourse {

    public static void main(String[] args) {
        Lst10_6_Course course1 = new Lst10_6_Course("Data Structure");
        Lst10_6_Course course2 = new Lst10_6_Course("Distributed System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }


        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents()); 
    }
}