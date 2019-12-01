package com.model;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator implements INumberGenerator {

    public List<Integer> GeneratePrimeNumbers(int upperLimit){
        Boolean[] sieve = getSieve(upperLimit);
        for(int seed = 2; seed <= (int) Math.sqrt(sieve.length); seed++){
            if(sieve[seed]){
                int times = 2;
                while(seed*times <= upperLimit){
                    sieve[seed*times] = false;
                    times++;
                }
            }
        }
        return getListFromSieve(sieve);
    }

    private Boolean[] getSieve(int upperLimit){
        Boolean[] sieve = new Boolean[upperLimit + 1];
        for(int i = 2; i<sieve.length; i++){
            sieve[i] = true;
        }
        return sieve;
    }

    private List<Integer> getListFromSieve(Boolean[] sieve){
        List<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 2; i < sieve.length; i++) {
            if(sieve[i]){
                toReturn.add(i);
            }
        }
        return toReturn;
    }
}
