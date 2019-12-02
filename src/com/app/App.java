package com.app;

import com.controller.AppController;
import com.model.INumberGenerator;
import com.model.ISpiralToArray;
import com.model.NumberGenerator;
import com.model.SpiralToArray;
import com.view.MainWindow;

public class App {

    public static void main(String[] args) {

        MainWindow mw = new MainWindow();
        INumberGenerator ng = new NumberGenerator();
        ISpiralToArray sta = new SpiralToArray();
        AppController appController = new AppController(mw, ng, sta);
        appController.initAppController();
    }
}