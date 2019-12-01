package com.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SpiralToArray {


    private List<Integer> specialNumbers;
    private int dimention;
    //y = -1 (Up)
    //x = 1 (Right)
    //y = 1 (Down)
    //x = -1 (Left)
    private int currentDirectionX = 0;
    private int currentDirectionY = -1;

    public SpiralToArray(int dimention, List<Integer> specialNumbers){
        if (specialNumbers == null) {
            this.specialNumbers = new ArrayList<Integer>();
        } else {
            this.specialNumbers = specialNumbers;
        }
        this.dimention = dimention;
    }

    public Pixel[][] GetArray(){
        Pixel[][] array = new Pixel[dimention][dimention];
        int increase = 1;
        int X = (dimention)/2;
        int Y = (dimention)/2;
        int number = 1;

        while(X < dimention && X >= 0 && Y < dimention && Y >= 0){
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
}
