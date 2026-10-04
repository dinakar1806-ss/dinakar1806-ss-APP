import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField nameField;
    JTextField registerField;

    JRadioButton maleButton;
    JRadioButton femaleButton;

    JComboBox<String> departmentBox;

    JButton submitButton;

    public StudentRegistration() {

        setTitle("Student Registration System");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Student Name
        add(new JLabel("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        // Register Number
        add(new JLabel("Register Number:"));
        registerField = new JTextField();
        add(registerField);

        // Gender
        add(new JLabel("Gender:"));

        JPanel genderPanel = new JPanel();

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);

        add(genderPanel);

        // Department
        add(new JLabel("Department:"));

        String[] departments = {
            "CSE",
            "ECE",
            "EEE",
            "MECH",
            "CIVIL"
        };

        departmentBox = new JComboBox<>(departments);
        add(departmentBox);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        add(new JLabel(""));
        add(submitButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String registerNumber = registerField.getText();

        String gender;

        if (maleButton.isSelected()) {
            gender = "Male";
        } else if (femaleButton.isSelected()) {
            gender = "Female";
        } else {
            gender = "Not Selected";
        }

        String department =
            (String) departmentBox.getSelectedItem();

        String message =
            "Student Name: " + name +
            "\nRegister Number: " + registerNumber +
            "\nGender: " + gender +
            "\nDepartment: " + department;

        JOptionPane.showMessageDialog(
            this,
            message,
            "Registration Details",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}