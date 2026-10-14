package Project.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import Project.NavyPersonnel;
import Project.PersonnelManager;

public class SearchPage extends Page implements ActionListener {

    private Page previousPage;
    private JTextField searchBox;
    private JTextArea resultArea;

    public SearchPage(Page previousPage) {
        super("Search Personnel");
        this.previousPage = previousPage;

        JLabel title = new JLabel("Search Personnel");
        title.setBounds(10, 0, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel prompt = new JLabel("Name or ID");
        prompt.setBounds(15, 40, 250, 30);
        prompt.setFont(new Font("Arial", Font.PLAIN, 16));

        searchBox = new JTextField();
        searchBox.setBounds(15, 68, 300, 30);
        searchBox.setActionCommand("Search");
        searchBox.addActionListener(this);    

        JButton search = new JButton("Search");
        search.setActionCommand("Search");
        search.addActionListener(this);
        search.setBounds(330, 68, 120, 30);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(resultArea);
        scroll.setBounds(15, 115, 450, 230);

        JButton back = new JButton("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);
        back.setBounds(150, 380, 200, 50);

        frame.add(title);
        frame.add(prompt);
        frame.add(searchBox);
        frame.add(search);
        frame.add(scroll);
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
            ArrayList<NavyPersonnel> results = PersonnelManager.search(searchBox.getText());

            if (results.isEmpty()) {
                resultArea.setText("No personnel found.");
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(results.size()).append(" result(s):\n\n");
            for (NavyPersonnel p : results) {
                sb.append(p).append("\n\n");
            }
            resultArea.setText(sb.toString());
        }
    }
}
