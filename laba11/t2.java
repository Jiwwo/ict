import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Student Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        frame.add(panel);

        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        panel.add(nameField);

        JLabel surnameLabel = new JLabel("Surname:");
        panel.add(surnameLabel);

        JTextField surnameField = new JTextField();
        panel.add(surnameField);

        JLabel patronymicLabel = new JLabel("Patronymic:");
        panel.add(patronymicLabel);

        JTextField patronymicField = new JTextField();
        panel.add(patronymicField);

        JLabel birthDateLabel = new JLabel("Birth Date:");
        panel.add(birthDateLabel);

        JTextField birthDateField = new JTextField();
        panel.add(birthDateField);

        JLabel groupLabel = new JLabel("Group:");
        panel.add(groupLabel);

        JTextField groupField = new JTextField();
        panel.add(groupField);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] data = {
                        nameField.getText(),
                        surnameField.getText(),
                        patronymicField.getText(),
                        birthDateField.getText(),
                        groupField.getText()
                };
                saveToFile(data, "student_data.txt");
            }
        });
        panel.add(saveButton);

        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] data = loadFromFile("student_data.txt");
                if (data != null) {
                    nameField.setText(data[0]);
                    surnameField.setText(data[1]);
                    patronymicField.setText(data[2]);
                    birthDateField.setText(data[3]);
                    groupField.setText(data[4]);
                }
            }
        });
        panel.add(loadButton);

        frame.setVisible(true);
    }

    private static void saveToFile(String[] data, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Data saved to file successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String[] loadFromFile(String filePath) {
        String[] data = new String[5];
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < data.length; i++) {
                data[i] = reader.readLine();
            }
            return data;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading data from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
