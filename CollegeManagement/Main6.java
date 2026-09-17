import student.Student;
import course.Course;

public class Main6 {
    public static void main(String[] args) {

        Student s = new Student("Dinakar", 101);
        Course c = new Course("Computer Science", "CSE101");

        System.out.println("Student Details");
        s.displayStudent();

        System.out.println();

        System.out.println("Course Details");
        c.displayCourse();
    }
}