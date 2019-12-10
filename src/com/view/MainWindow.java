package com.view;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JTextField dim;
    private JButton gen;
    private DrawingControl df;
    private JFrame frame;

    public MainWindow() {
        frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Dimension: ");
        dim = new JTextField(5);
        gen = new JButton("Generate");
        panel.add(label);
        panel.add(dim);
        panel.add(gen);

        df = new DrawingControl();
        df.setPreferredSize(new Dimension(400,400));

        frame.getContentPane(). add(panel, BorderLayout.SOUTH);
        frame.getContentPane().add(df, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public JButton GetGenerateButton(){
        return gen;
    }

    public JTextField GetDimensionTextField(){
        return dim;
    }

    public DrawingControl GetDrawingControl(){
        return df;
    }

    public void SetDrawingControl(DrawingControl dc){
        df = dc;
        df.repaint();
    }
}
