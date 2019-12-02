package com.view;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingControl extends JPanel {

    public int frameSizeX;

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawLine(50,50,100,100);
    }
}
