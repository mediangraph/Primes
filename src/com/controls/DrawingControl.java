package com.controls;
import javax.swing.*;
import java.awt.Component;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Vector;

public class DrawingControl extends JPanel {

    public int frameSizeX;

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawLine(50,50,100,100);
    }

    private int GetMiddleOfCanva()
    {
        return frameSizeX/2;
    }

}
