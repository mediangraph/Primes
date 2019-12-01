package com.model.tests;

import com.model.NumberGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGeneratorTest {

    @Test
    public void GeneratePrimeNumbers(){
        //Assign
        NumberGenerator ng = new NumberGenerator();
        int limit = 50;
        Integer[] expectedArray = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(expectedArray));
        //Act

        List<Integer> output = ng.GeneratePrimeNumbers(limit);
        //Assert
        for(int number : output){
            Assert.assertTrue("Checking number: " + number, expected.contains(number));
        }

    }

}
