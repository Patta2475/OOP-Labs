package Project.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import Project.Officer.OfficerRank;
import Project.PersonnelManager;
import Project.Officer;

public class OfficerPage extends Page implements ActionListener{

    private AddPersonnelPage personPage;
    private JTextField nameBox, idBox, yearBox, leaderShipCourse, unitCommandBox;
    private JComboBox<OfficerRank> rankBox;

    public OfficerPage(AddPersonnelPage personPage) {
        super("Add Enlisted Personnel Page");
        this.personPage = personPage;

        JLabel title = new JLabel("Add Officer");
        title.setBounds(10, 0, 250, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title);

        JLabel name = new JLabel("Name ");
        name.setBounds(15, 45, 250, 30);
        name.setFont(new Font("Airal", Font.PLAIN, 16));
        nameBox = new JTextField();
        nameBox.setBounds(15, 70, 250, 30);
        frame.add(name); frame.add(nameBox);

        JLabel ID = new JLabel("ID ");
        ID.setBounds(15, 100, 250, 30);
        ID.setFont(new Font("Airal", Font.PLAIN, 16));
        idBox = new JTextField();
        idBox.setBounds(15, 125, 250, 30);
        frame.add(ID); frame.add(idBox);

        JLabel RankText = new JLabel("Rank ");
        RankText.setBounds(15, 155, 250, 30);
        RankText.setFont(new Font("Airal", Font.PLAIN, 16));
        rankBox = new JComboBox<>(OfficerRank.values());
        rankBox.setBounds(15,180,160,30);
        frame.add(RankText); frame.add(rankBox);

        JLabel yearOfService = new JLabel("Year of service ");
        yearOfService.setBounds(200, 155, 250, 30);
        yearOfService.setFont(new Font("Airal", Font.PLAIN, 16));
        yearBox = new JTextField();
        yearBox.setBounds(200, 180, 65, 30);
        frame.add(yearOfService); frame.add(yearBox);

        JLabel unitCommand = new JLabel("Unit Command");
        unitCommand.setBounds(15, 210, 250, 30);
        unitCommand.setFont(new Font("Airal", Font.PLAIN, 16));
        unitCommandBox = new JTextField();
        unitCommandBox.setBounds(15,235,160,30);
        frame.add(unitCommand); frame.add(unitCommandBox);

        JLabel leadership = new JLabel("Leadership Course");
        leadership.setBounds(15, 265, 250, 30);
        leadership.setFont(new Font("Airal", Font.PLAIN, 16));
        leaderShipCourse = new JTextField();
        leaderShipCourse.setBounds(15, 290, 250, 30);
        frame.add(leadership); frame.add(leaderShipCourse);

        JButton add = new JButton("Add");
        add.setActionCommand("Add");
        add.addActionListener(this);
        add.setBounds(115, 350, 70, 50);
        frame.add(add);

        JButton back = new JButton("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);
        back.setBounds(275, 350, 70, 50);
        frame.add(back);

        show();

    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {
            frame.dispose(); 
            personPage.show();         
        }

        if (e.getActionCommand().equals("Add")) {
            String name = nameBox.getText().trim();
            String id = idBox.getText().trim();
            String unitCommand = unitCommandBox.getText().trim();
            String leaderShipC = leaderShipCourse.getText().trim();

            if (name.isEmpty() || id.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a name and an ID.");
                return;
            }

            if (PersonnelManager.idExists(id)) {
                JOptionPane.showMessageDialog(frame, "That ID already exists.");
                return;
            }

            int years;

            try {
                years = Integer.parseInt(yearBox.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Year of service must be numbers.");
                return;
            }

            if (years < 0) {
                JOptionPane.showMessageDialog(frame, "Year of service cannot be negative.");
                return;
            }

            OfficerRank rank = (OfficerRank) rankBox.getSelectedItem();

            Officer o = new Officer(name, id, rank, years, unitCommand, leaderShipC);
            PersonnelManager.add(o);

            JOptionPane.showMessageDialog(frame, "Added: " + name);
        }

        nameBox.setText("");
        idBox.setText("");
        yearBox.setText("");
        leaderShipCourse.setText("");
        rankBox.setSelectedIndex(0);
        unitCommandBox.setText("");
    }

}
