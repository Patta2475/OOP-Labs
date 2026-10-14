package Project.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.Font;

public class AddPersonnelPage extends Page implements ActionListener {

    private MainMenu menu;

    public AddPersonnelPage(MainMenu menu) {
        super("Add Personnel");
        this.menu = menu;

        JLabel title = new JLabel("Add Personnel");
        title.setBounds(10, 0, 250, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        JButton Addpersonnel = new JButton("Enlisted Personnel");
        Addpersonnel.setActionCommand("Enlisted");
        Addpersonnel.addActionListener(this);
        Addpersonnel.setBounds(150, 150, 200, 50);
        frame.add(Addpersonnel);

        JButton Search = new JButton("Officer");
        Search.setActionCommand("Officer");
        Search.addActionListener(this);
        Search.setBounds(150, 220, 200, 50);
        frame.add(Search);

        JButton back = new JButton("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);
        back.setBounds(150, 350, 200, 50);

        frame.add(title);
        frame.add(back);

        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {
            frame.dispose(); 
            menu.show();          
        }

        if (e.getActionCommand().equals("Enlisted")) {
            hide();;
            new EnlistedPage(this);
        }

        if (e.getActionCommand().equals("Officer")) {
            hide();;
            new OfficerPage(this);
        }
    }

}
