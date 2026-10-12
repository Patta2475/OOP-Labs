package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener {

    private JFrame frame;

    public GUI() {
        frame = new JFrame("FrameDemo");
        JLabel welcomeMessage = new JLabel("Navy Personnel Management System");
        welcomeMessage.setBounds(150, 50, 250, 30);

        JButton Addpersonnel = new JButton("Add personnel");
        Addpersonnel.setActionCommand("Addpersonnel");
        Addpersonnel.addActionListener(this);
        Addpersonnel.setBounds(150, 150, 200, 50);

        JButton Search = new JButton("Search");
        Search.setActionCommand("Search");
        Search.addActionListener(this);
        Search.setBounds(150, 220, 200, 50);

        JButton Exit = new JButton("Exit");
        Exit.setActionCommand("Exit");
        Exit.addActionListener(this);
        Exit.setBounds(150, 290, 200, 50);

        this.

        frame.add(welcomeMessage); frame.add(Addpersonnel); frame.add(Exit); frame.add(Search);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}

