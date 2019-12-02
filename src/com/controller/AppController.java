package com.controller;

import com.model.INumberGenerator;
import com.model.ISpiralToArray;
import com.view.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppController {

    private MainWindow mainWindow;
    private INumberGenerator numberGenerator;
    private ISpiralToArray spiralToArray;

    public AppController(MainWindow mv, INumberGenerator ng, ISpiralToArray sta){
        this.mainWindow = mv;
        this.numberGenerator = ng;
        this.spiralToArray = sta;
    }

    public void initAppController(){
         mainWindow.GetGenerateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateButtonPressed(mainWindow.GetDimensionTextField().getText());
            }
        });
    }

    private void generateButtonPressed(String dimension){
        System.out.println("Pyszne frytki.");
    }
}
