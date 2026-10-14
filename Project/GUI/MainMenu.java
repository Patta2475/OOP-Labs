package Project.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

public class MainMenu extends Page implements ActionListener {

    public MainMenu() {
        super("Navy Personnel Management System");

        JLabel welcomeMessage = new JLabel("Navy Personnel Management System");
        welcomeMessage.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeMessage.setBounds(100, 50, 350, 30);

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
        Exit.setBounds(150, 290, 200, 50);
        Exit.addActionListener(e -> System.exit(0));

        frame.add(welcomeMessage);
        frame.add(Addpersonnel);
        frame.add(Search);
        frame.add(Exit);
        show();
    }
    public static void main(String[] args) {
        new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Addpersonnel")){
            hide();
            new AddPersonnelPage(this);
        }

        if (e.getActionCommand().equals("Search")){
            hide();
            new SearchPage(this);
        }
    }
}

