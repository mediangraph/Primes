package com.app;

import com.model.INumberGenerator;
import com.model.NumberGenerator;
import com.view.DrawingControl;

import javax.swing.*;
import java.util.List;
public class App {

    public static void main(String[] args) {
       // JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.getContentPane().add(new DrawingControl());
    }
}