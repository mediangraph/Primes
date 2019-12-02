package com.model.tests;

import com.model.Pixel;
import com.model.SpiralToArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralToArrayTest  {
    @Test
    public void RunSpiralToArrayTestDim5() {
        //Assign
        int dim = 5;
        Integer[][] expected =
                {
                        {25, 24, 23, 22, 21},
                        {10,  9,  8,  7, 20},
                        {11,  2,  1,  6, 19},
                        {12,  3,  4,  5, 18},
                        {13,  14, 15, 16, 17}
                };
        SpiralToArray sta = new SpiralToArray();
        sta.SetDimension(dim);
        //Act
        Pixel[][] output = sta.GetArray();
        //Assert

        for(int row = 0; row < dim; row++){
            for(int col = 0; col < dim; col++){
                Assert.assertEquals((long)expected[col][row], (long)output[row][col].Number);
            }
        }
    }

    @Test
    public void RunSpiralToArrayWithSpecialNumbers(){
        int dim = 9;
        List<Integer> specials = Arrays.asList(3, 5, 7, 10);
        SpiralToArray sta = new SpiralToArray();
        sta.SetDimension(dim);
        sta.SetSpecialNumbers(specials);
        //Act
        Pixel[][] output = sta.GetArray();
        //Assert

        for(int row = 0; row < dim; row++){
            for(int col = 0; col < dim; col++){
                Assert.assertEquals("Failed for number: " + output[row][col].Number,
                        specials.contains(output[row][col].Number),
                        output[row][col].IsPrime);
            }
        }

    }
}
