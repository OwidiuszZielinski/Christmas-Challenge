import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChatGPTTest extends JFrame {

    public static void main(String[] args) {
        ChatGPTTest chatGPTTest = new ChatGPTTest();
        System.out.println(chatGPTTest);
    }

    public ChatGPTTest() {
        // create the frame
        setTitle("My Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 5));

        // create the buttons
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        // add the panel to the frame
        add(panel);

        // show the frame
        setVisible(true);
    }
}