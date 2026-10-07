package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppWindow extends JFrame {

    // button labels
    public static final String START_BUTTON = "Start Simulation";
    public static final String SAVE_BUTTON = "Save";
    public static final String CLEAR_BUTTON = "Clear";
    public static final String EXIT_BUTTON = "Exit";

    public JButton startButton;
    public JButton saveButton;
    public JButton clearButton;
    public JButton exitButton;

    private AppCanvas canvas;

    public void init() {
        setTitle("D&D 5.5e Encounter Simulator");
        setLocation(250, 50);

        Container cp = getContentPane();
        canvas = new AppCanvas();
        cp.add(canvas, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        startButton = new JButton(START_BUTTON);
        saveButton = new JButton(SAVE_BUTTON);
        clearButton = new JButton(CLEAR_BUTTON);
        exitButton = new JButton(EXIT_BUTTON);

        southPanel.add(startButton);
        southPanel.add(saveButton);
        southPanel.add(clearButton);
        southPanel.add(exitButton);
        cp.add(southPanel, BorderLayout.SOUTH);
    }
}
