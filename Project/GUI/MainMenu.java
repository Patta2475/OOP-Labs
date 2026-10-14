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

        JButton addPersonnelButton = new JButton("Add personnel");
        addPersonnelButton.setActionCommand("Addpersonnel");
        addPersonnelButton.addActionListener(this);
        addPersonnelButton.setBounds(150, 150, 200, 50);

        JButton searchButton = new JButton("Search");
        searchButton.setActionCommand("Search");
        searchButton.addActionListener(this);
        searchButton.setBounds(150, 220, 200, 50);

        JButton exitButton = new JButton("Exit");
        exitButton.setActionCommand("Exit");
        exitButton.setBounds(150, 290, 200, 50);
        exitButton.addActionListener(e -> System.exit(0));

        frame.add(welcomeMessage);
        frame.add(addPersonnelButton);
        frame.add(searchButton);
        frame.add(exitButton);
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

