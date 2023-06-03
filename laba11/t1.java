import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Input to File");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        frame.add(panel);
        JLabel inputLabel = new JLabel("Input (max 25 characters):");
        panel.add(inputLabel);
        JTextField inputField = new JTextField();
        inputField.setDocument((Document) new JTextFieldLimit(25));
        panel.add(inputField);
        JLabel pathLabel = new JLabel("File path:");
        panel.add(pathLabel);
        JTextField pathField = new JTextField();
        panel.add(pathField);
        JButton saveButton = new JButton("Save to File");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String filePath = pathField.getText();
                saveToFile(input, filePath);
            }
        });
        panel.add(saveButton);

        frame.setVisible(true);
    }

    private static void saveToFile(String input, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(input);
            JOptionPane.showMessageDialog(null, "Data saved to file successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    static class JTextFieldLimit extends PlainDocument {
        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }
            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }
}
