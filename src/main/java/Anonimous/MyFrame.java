package Anonimous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton buttonOne = new JButton("Button #1");
    JButton buttonTwo = new JButton("Button #2");
    JButton buttonThree = new JButton("Button #3");

    MyFrame(){
        buttonOne.setBounds(100,100,100,100);
        buttonTwo.setBounds(200,100,100,100);
        buttonThree.setBounds(300,100,100,100);
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #1");
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #2");
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #3");
            }
        });
        this.add(buttonOne);
        this.add(buttonTwo);
        this.add(buttonThree);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }


}
