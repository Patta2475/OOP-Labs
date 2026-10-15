package Project.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import Project.EnlistedPersonnel.Specialty;
import Project.EnlistedPersonnel;
import Project.EnlistedPersonnel.EnlistedRank;
import Project.PersonnelManager;

public class EnlistedPage extends Page implements ActionListener{

    private AddPersonnelPage personPage;
    private JTextField nameBox, idBox, yearBox, dutyHourBox;
    private JComboBox<EnlistedRank> rankBox;
    private JComboBox<Specialty> specialtyBox;
    private JTextArea listArea;

    public EnlistedPage(AddPersonnelPage personPage) {
        super("Add Enlisted Personnel Page");
        this.personPage = personPage;

        frame.setSize(500, 700);

        listArea = new JTextArea(PersonnelManager.displayAll());
        listArea.setEditable(false);
        listArea.setLineWrap(true);
        listArea.setWrapStyleWord(true);

        JScrollPane listScroll = new JScrollPane(listArea);
        listScroll.setBounds(15, 420, 450, 230);
        frame.add(listScroll);

        JLabel title = new JLabel("Add Enlisted Personnel");
        title.setBounds(10, 0, 250, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title);

        JLabel name = new JLabel("Name ");
        name.setBounds(15, 45, 250, 30);
        nameBox = new JTextField();
        nameBox.setBounds(15, 70, 250, 30);
        frame.add(name); frame.add(nameBox);

        JLabel idLabel = new JLabel("ID ");
        idLabel.setBounds(15, 100, 250, 30);
        idBox = new JTextField();
        idBox.setBounds(15, 125, 250, 30);
        frame.add(idLabel); frame.add(idBox);

        JLabel rankLabel = new JLabel("Rank ");
        rankLabel.setBounds(15, 155, 250, 30);
        rankBox = new JComboBox<>(EnlistedRank.values());
        rankBox.setBounds(15,180,160,30);
        frame.add(rankLabel); frame.add(rankBox);

        JLabel yearOfService = new JLabel("Year of service ");
        yearOfService.setBounds(200, 155, 250, 30);
        yearBox = new JTextField();
        yearBox.setBounds(200, 180, 65, 30);
        frame.add(yearOfService); frame.add(yearBox);

        JLabel specialtyLabel = new JLabel("Specialty ");
        specialtyLabel.setBounds(15, 210, 250, 30);
        specialtyBox = new JComboBox<>(Specialty.values());
        specialtyBox.setBounds(15,235,160,30);
        frame.add(specialtyLabel); frame.add(specialtyBox);

        JLabel dutyHour = new JLabel("Duty hours");
        dutyHour.setBounds(200, 210, 250, 30);
        dutyHourBox = new JTextField();
        dutyHourBox.setBounds(200, 235, 65, 30);
        frame.add(dutyHour); frame.add(dutyHourBox);

        JButton add = new JButton("Add");
        add.setActionCommand("Add");
        add.addActionListener(this);
        add.setBounds(115, 300, 70, 50);
        frame.add(add);

        JButton back = new JButton("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);
        back.setBounds(275, 300, 70, 50);
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

            if (name.isEmpty() || id.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a name and an ID.");
                return;
            }

            if (PersonnelManager.idExists(id)) {
                JOptionPane.showMessageDialog(frame, "That ID already exists.");
                return;
            }

            int years, hours;

            try {
                years = Integer.parseInt(yearBox.getText().trim());
                hours = Integer.parseInt(dutyHourBox.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Year of service and duty hours must be numbers.");
                return;
            }

            if (years < 0 || hours < 0) {
                JOptionPane.showMessageDialog(frame, "Year of service or Duty Hours cannot be negative.");
                return;
            }

            EnlistedRank rank = (EnlistedRank) rankBox.getSelectedItem();
            Specialty specialty = (Specialty) specialtyBox.getSelectedItem();

            EnlistedPersonnel p = new EnlistedPersonnel(name, id, rank, years, hours, specialty);
            PersonnelManager.add(p);
            
            JOptionPane.showMessageDialog(frame, "Added: " + name);
            listArea.setText(PersonnelManager.displayAll());
        }

        nameBox.setText("");    
        idBox.setText("");
        yearBox.setText("");
        dutyHourBox.setText("");
        rankBox.setSelectedIndex(0);
        specialtyBox.setSelectedIndex(0);
    }

}
