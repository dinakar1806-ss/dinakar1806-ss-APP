import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserLoginPreferences extends JFrame
        implements ActionListener {

    JTextField usernameField;
    JPasswordField passwordField;

    JCheckBox rememberMe;
    JCheckBox notifications;

    JButton loginButton;

    public UserLoginPreferences() {

        setTitle("User Login and Preferences");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2, 10, 10));

        // Username
        add(new JLabel("Username:"));

        usernameField = new JTextField();
        add(usernameField);

        // Password
        add(new JLabel("Password:"));

        passwordField = new JPasswordField();
        add(passwordField);

        // Remember Me
        add(new JLabel("Preferences:"));

        JPanel preferencePanel = new JPanel();

        rememberMe = new JCheckBox("Remember Me");
        notifications = new JCheckBox("Receive Notifications");

        preferencePanel.add(rememberMe);
        preferencePanel.add(notifications);

        add(preferencePanel);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        add(new JLabel(""));
        add(loginButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String username = usernameField.getText();

        String password =
            new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Please enter username and password.",
                "Login Error",
                JOptionPane.ERROR_MESSAGE
            );

        } else {

            String message =
                "Login Successful!" +
                "\nUsername: " + username +
                "\nRemember Me: " +
                (rememberMe.isSelected() ? "Yes" : "No") +
                "\nReceive Notifications: " +
                (notifications.isSelected() ? "Yes" : "No");

            JOptionPane.showMessageDialog(
                this,
                message,
                "Login Status",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new UserLoginPreferences();
    }
}