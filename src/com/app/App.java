package com.app;

import com.model.INumberGenerator;
import com.model.NumberGenerator;
import com.controls.DrawingControl;

import javax.swing.*;
import java.io.Console;
import java.util.List;
public class App {

    public static void main(String[] args) {
       // JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300,300);

        frame.setVisible(true);

        frame.getContentPane().add(new DrawingControl());
//        JButton button = new JButton("Press");
//        frame.getContentPane().add(button); // Adds Button to content pane of frame

        INumberGenerator ng = new NumberGenerator();
        List<Integer> list = ng.GeneratePrimeNumbers(50);
        System.out.println(list.toString());

    }
}