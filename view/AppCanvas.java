package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
public class AppCanvas extends JPanel {
    
    public AppCanvas() {
        var width = 800;
        var height = 500;
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.cyan);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    }
}
