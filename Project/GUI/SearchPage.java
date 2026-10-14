package Project.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import Project.Personnel;
import Project.PersonnelManager;

public class SearchPage extends Page implements ActionListener {

    private Page previousPage;
    private JComboBox<String> criterionBox;
    private JTextField valueBox;
    private JTextArea resultArea;

    public SearchPage(Page previousPage) {
        super("Search Personnel");
        this.previousPage = previousPage;

        JLabel title = new JLabel("Search Personnel");
        title.setBounds(10, 0, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title);

        JLabel criterionLabel = new JLabel("Search by");
        criterionLabel.setBounds(15, 40, 200, 30);
        frame.add(criterionLabel);

        criterionBox = new JComboBox<>(PersonnelManager.CRITERIA);
        criterionBox.setBounds(15, 68, 200, 30);
        frame.add(criterionBox);

        JLabel valueLabel = new JLabel("Value");
        valueLabel.setBounds(230, 40, 150, 30);
        frame.add(valueLabel);

        valueBox = new JTextField();
        valueBox.setBounds(230, 68, 140, 30);
        frame.add(valueBox);

        JButton search = new JButton("Search");
        search.setActionCommand("Search");
        search.addActionListener(this);
        search.setBounds(385, 68, 80, 30);
        frame.add(search);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(resultArea);
        scroll.setBounds(15, 115, 450, 230);
        frame.add(scroll);

        JButton back = new JButton("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);
        back.setBounds(150, 380, 200, 50);
        frame.add(back);

        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {
            frame.dispose();
            previousPage.show();
        }

        if (e.getActionCommand().equals("Search")) {
            String criterion = (String) criterionBox.getSelectedItem();
            ArrayList<Personnel> results;

            try {
                results = PersonnelManager.search(criterion, valueBox.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, criterion + " must be a whole number.");
                return;
            }

            if (results.isEmpty()) {
                resultArea.setText("No personnel found.");
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(results.size()).append(" result(s):\n\n");
            for (Personnel p : results) {
                sb.append(p).append("\n\n");
            }
            resultArea.setText(sb.toString());
        }
    }
}