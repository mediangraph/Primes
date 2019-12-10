package com.view;
import com.model.Pixel;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingControl extends JPanel {

    public Pixel[][] PixelArray;

    public DrawingControl() {};
    public DrawingControl(Pixel[][] array){
        PixelArray = array;
    }
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.red);
        setBackground(Color.BLACK);
        if(PixelArray != null) {
            for (int row = 1; row < PixelArray[1].length; row++) {
                for (int col = 1; col < PixelArray.length; col++) {
                    if (PixelArray[row][col].IsPrime) {
                        g.drawLine(row, col, row, col);
                    }
                }
            }
        }
    }
}
