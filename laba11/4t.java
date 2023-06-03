import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Numbers Generator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            panel.add(scrollPane, BorderLayout.CENTER);

            JButton button = new JButton("Generate Random Numbers");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Random random = new Random();
                    StringBuilder numbers = new StringBuilder();
                    for (int i = 0; i < 7; i++) {
                        numbers.append(random.nextInt(100)).append("\n");
                    }
                    textArea.setText(numbers.toString());
                }
            });
            panel.add(button, BorderLayout.SOUTH);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
