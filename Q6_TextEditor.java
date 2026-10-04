import javax.swing.*;
import java.awt.*;

public class Q6_TextEditor extends JFrame {

    JTextArea textArea;

    JMenuItem newItem;
    JMenuItem clearItem;
    JMenuItem exitItem;

    JMenuItem cutItem;
    JMenuItem copyItem;
    JMenuItem pasteItem;

    public Q6_TextEditor() {

        setTitle("Simple Text Editor");

        // Text Area
        textArea =
            new JTextArea();

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane =
            new JScrollPane(textArea);

        add(
            scrollPane,
            BorderLayout.CENTER
        );

        // Menu Bar
        JMenuBar menuBar =
            new JMenuBar();

        // File Menu
        JMenu fileMenu =
            new JMenu("File");

        newItem =
            new JMenuItem("New");

        clearItem =
            new JMenuItem("Clear");

        exitItem =
            new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Edit Menu
        JMenu editMenu =
            new JMenu("Edit");

        cutItem =
            new JMenuItem("Cut");

        copyItem =
            new JMenuItem("Copy");

        pasteItem =
            new JMenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        // New
        newItem.addActionListener(e -> {

            textArea.setText("");

        });

        // Clear
        clearItem.addActionListener(e -> {

            textArea.setText("");

        });

        // Exit
        exitItem.addActionListener(e -> {

            System.exit(0);

        });

        // Cut
        cutItem.addActionListener(e -> {

            textArea.cut();

        });

        // Copy
        copyItem.addActionListener(e -> {

            textArea.copy();

        });

        // Paste
        pasteItem.addActionListener(e -> {

            textArea.paste();

        });

        setSize(700, 500);

        setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Q6_TextEditor editor =
                new Q6_TextEditor();

            editor.setVisible(true);
        });
    }
}