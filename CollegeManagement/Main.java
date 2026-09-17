import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {

        Student s = new Student(101, "Dinakar", "CSE");
        Course c = new Course(501, "Java Programming", 4);

        System.out.println("===== STUDENT DETAILS =====");
        s.display();

        System.out.println("\n===== COURSE DETAILS =====");
        c.display();
    }
}