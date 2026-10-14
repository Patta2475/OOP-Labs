package Project.GUI;

import javax.swing.*;

public class Page {

    protected JFrame frame;

    public Page(String title) {
        frame = new JFrame(title);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.setVisible(false);
    }
}
