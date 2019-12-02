package com.model;

import java.util.ArrayList;
import java.util.List;

public class SpiralToArray implements ISpiralToArray {

    private List<Integer> specialNumbers;
    private int dimension;
    //y = -1 (Up)
    //x = 1 (Right)
    //y = 1 (Down)
    //x = -1 (Left)
    private int currentDirectionX = 0;
    private int currentDirectionY = -1;

    public SpiralToArray(int dimension){
        this.specialNumbers = new ArrayList<>();
        this.dimension = dimension;
    }

    public Pixel[][] GetArray(){
        Pixel[][] array = new Pixel[dimension][dimension];
        int increase = 1;
        int X = (dimension)/2;
        int Y = (dimension)/2;
        int number = 1;

        while(X < dimension && X >= 0 && Y < dimension && Y >= 0){
            for(int i = 0; i < increase; i++){
                array[Y][X] = new Pixel(number, specialNumbers.contains(number++));
                X = X + currentDirectionX;
                Y = Y + currentDirectionY;
            }
            NextDirection();
            if(currentDirectionX == 0)
                increase++;
        }

        return array;
    }

    private void NextDirection()
    {
        if(currentDirectionX == 0) {
            currentDirectionX = currentDirectionY * (-1);
            currentDirectionY = 0;
        }
        else if(currentDirectionY == 0) {
            currentDirectionY = currentDirectionX;
            currentDirectionX = 0;
        }
    }

    public void SetSpecialNumbers(List<Integer> list) {
        if(list != null)
            specialNumbers = list;
    }

    public List<Integer> GetSpecialNumbers(){
        return specialNumbers;
    }
}
