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
    private JTextField nameBox, idBox, yearBox, leadershipBox, unitCommandBox;
    private JComboBox<OfficerRank> rankBox;
    private JTextArea listArea;

    public OfficerPage(AddPersonnelPage personPage) {
        super("Add Officer Page");
        this.personPage = personPage;

        frame.setSize(500, 700);

        listArea = new JTextArea(PersonnelManager.displayAll());
        listArea.setEditable(false);
        listArea.setLineWrap(true);
        listArea.setWrapStyleWord(true);

        JScrollPane listScroll = new JScrollPane(listArea);
        listScroll.setBounds(15, 420, 450, 230);
        frame.add(listScroll);

        JLabel title = new JLabel("Add Officer");
        title.setBounds(10, 0, 250, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title);

        JLabel name = new JLabel("Name ");
        name.setBounds(15, 45, 250, 30);
        nameBox = new JTextField();
        nameBox.setBounds(15, 70, 250, 30);
        frame.add(name); frame.add(nameBox);

        JLabel ID = new JLabel("ID ");
        ID.setBounds(15, 100, 250, 30);
        idBox = new JTextField();
        idBox.setBounds(15, 125, 250, 30);
        frame.add(ID); frame.add(idBox);

        JLabel RankText = new JLabel("Rank ");
        RankText.setBounds(15, 155, 250, 30);
        rankBox = new JComboBox<>(OfficerRank.values());
        rankBox.setBounds(15,180,160,30);
        frame.add(RankText); frame.add(rankBox);

        JLabel yearOfService = new JLabel("Year of service ");
        yearOfService.setBounds(200, 155, 250, 30);
        yearBox = new JTextField();
        yearBox.setBounds(200, 180, 65, 30);
        frame.add(yearOfService); frame.add(yearBox);

        JLabel unitCommand = new JLabel("Unit Command");
        unitCommand.setBounds(15, 210, 250, 30);
        unitCommandBox = new JTextField();
        unitCommandBox.setBounds(15,235,160,30);
        frame.add(unitCommand); frame.add(unitCommandBox);

        JLabel leadership = new JLabel("Leadership Course");
        leadership.setBounds(15, 265, 250, 30);
        leadershipBox = new JTextField();
        leadershipBox.setBounds(15, 290, 250, 30);
        frame.add(leadership); frame.add(leadershipBox);

        JButton add = new JButton("Add");
        add.setActionCommand("Add");
        add.addActionListener(this);
        add.setBounds(115, 330, 70, 50);
        frame.add(add);

        JButton back = new JButton("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);
        back.setBounds(275, 330, 70, 50);
        frame.add(back);

        JLabel allName = new JLabel("All people name that currently stored");
        allName.setBounds(15, 390, 250, 30);
        frame.add(allName);

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
            String leadershipCourse = leadershipBox.getText().trim();

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

            Officer o = new Officer(name, id, rank, years, unitCommand, leadershipCourse);
            PersonnelManager.add(o);
            listArea.setText(PersonnelManager.displayAll());
            
            JOptionPane.showMessageDialog(frame, "Added: " + name);
        }

        nameBox.setText("");
        idBox.setText("");
        yearBox.setText("");
        leadershipBox.setText("");
        rankBox.setSelectedIndex(0);
        unitCommandBox.setText("");
    }

}
