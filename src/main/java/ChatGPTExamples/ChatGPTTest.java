package ChatGPTExamples;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class ChatGPTTest extends JFrame {

        public static void main(String[] args) {
            // Create a 9x9 table
            int rows = 9;
            int columns = 9;
            Object[][] data = new Object[rows][columns];

            // Initialize the table with empty values
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    data[i][j] = "";
                }
            }

            // Create the table
            Object[] columnNames = new Object[9];
            JTable table = new JTable(data ,columnNames);

            // Add the table to a scroll pane
            JScrollPane scrollPane = new JScrollPane(table);

            // Add the scroll pane to a frame
            JFrame frame = new JFrame("My Table");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(scrollPane);
            frame.pack();
            frame.setVisible(true);
        }
    }
