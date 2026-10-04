import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Q5_StudentCourseManagement
        extends JFrame {

    JList<String> courseList;

    JTable table;

    DefaultTableModel tableModel;

    JButton addButton;
    JButton removeButton;

    JTextField studentName;

    public Q5_StudentCourseManagement() {

        setTitle("Student Course Management");

        setLayout(new BorderLayout(10, 10));

        // Student Name
        JPanel topPanel =
            new JPanel();

        topPanel.add(
            new JLabel("Student Name:")
        );

        studentName =
            new JTextField(15);

        topPanel.add(studentName);

        add(topPanel, BorderLayout.NORTH);

        // Course List
        String[] courses = {
            "Java Programming",
            "Data Structures",
            "Operating Systems",
            "Computer Networks",
            "Database Management"
        };

        courseList =
            new JList<>(courses);

        courseList.setSelectionMode(
            ListSelectionModel.SINGLE_SELECTION
        );

        JScrollPane listScrollPane =
            new JScrollPane(courseList);

        listScrollPane.setBorder(
            BorderFactory.createTitledBorder(
                "Available Courses"
            )
        );

        add(
            listScrollPane,
            BorderLayout.WEST
        );

        // Table
        String[] columns = {
            "Student Name",
            "Selected Course",
            "Enrollment Status"
        };

        tableModel =
            new DefaultTableModel(
                columns,
                0
            );

        table =
            new JTable(tableModel);

        JScrollPane tableScrollPane =
            new JScrollPane(table);

        tableScrollPane.setBorder(
            BorderFactory.createTitledBorder(
                "Course Registrations"
            )
        );

        add(
            tableScrollPane,
            BorderLayout.CENTER
        );

        // Buttons
        JPanel buttonPanel =
            new JPanel();

        addButton =
            new JButton("Add Course");

        removeButton =
            new JButton("Remove Course");

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        add(
            buttonPanel,
            BorderLayout.SOUTH
        );

        // Add Course
        addButton.addActionListener(e -> {

            String name =
                studentName.getText();

            String course =
                courseList.getSelectedValue();

            if (name.isEmpty() ||
                course == null) {

                JOptionPane.showMessageDialog(
                    this,
                    "Enter student name and select a course."
                );

                return;
            }

            tableModel.addRow(
                new Object[] {
                    name,
                    course,
                    "Enrolled"
                }
            );

            studentName.setText("");

            JOptionPane.showMessageDialog(
                this,
                "Course added successfully."
            );
        });

        // Remove Course
        removeButton.addActionListener(e -> {

            int row =
                table.getSelectedRow();

            if (row >= 0) {

                tableModel.removeRow(row);

                JOptionPane.showMessageDialog(
                    this,
                    "Course registration removed."
                );

            } else {

                JOptionPane.showMessageDialog(
                    this,
                    "Select a registration to remove."
                );
            }
        });

        setSize(750, 450);

        setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Q5_StudentCourseManagement frame =
                new Q5_StudentCourseManagement();

            frame.setVisible(true);
        });
    }
}