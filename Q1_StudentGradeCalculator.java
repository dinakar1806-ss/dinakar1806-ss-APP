import javax.swing.*;
import java.awt.*;

class Q1_StudentGradeCalculator {
    private String name;
    private int m1, m2, m3, total;
    private double average;
    private String grade;

    public void calculate(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

        total = m1 + m2 + m3;
        average = total / 3.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }

    public String getResult() {
        return "Student: " + name +
               "\nTotal: " + total +
               "\nAverage: " + String.format("%.2f", average) +
               "\nGrade: " + grade;
    }
}

class StudentView extends JFrame {

    JTextField name = new JTextField(15);
    JTextField m1 = new JTextField(5);
    JTextField m2 = new JTextField(5);
    JTextField m3 = new JTextField(5);

    JButton calculate = new JButton("Calculate Result");
    JLabel result = new JLabel(" ");

    StudentView() {
        setTitle("Student Grade Calculator");
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Student Name:"));
        add(name);

        add(new JLabel("Subject 1:"));
        add(m1);

        add(new JLabel("Subject 2:"));
        add(m2);

        add(new JLabel("Subject 3:"));
        add(m3);

        add(calculate);
        add(result);

        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class StudentController {

    StudentModel model;
    StudentView view;

    StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        view.calculate.addActionListener(e -> {
            try {
                int a = Integer.parseInt(view.m1.getText());
                int b = Integer.parseInt(view.m2.getText());
                int c = Integer.parseInt(view.m3.getText());

                if (a < 0 || a > 100 ||
                    b < 0 || b > 100 ||
                    c < 0 || c > 100) {
                    throw new NumberFormatException();
                }

                model.calculate(view.name.getText(), a, b, c);

                view.result.setText(
                    "<html>" +
                    model.getResult().replace("\n", "<br>") +
                    "</html>"
                );

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                    view,
                    "Enter valid marks (0-100).",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }
}

public class Q1_StudentGradeCalculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentView view = new StudentView();
            StudentModel model = new StudentModel();

            new StudentController(model, view);

            view.setVisible(true);
        });
    }
}