package com.pillar;

import com.google.common.collect.Lists;

import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int value) {
        List<Integer> primes = Lists.newArrayList();
        for(int candidate = 2; value > 1; candidate++){
            for(;value % candidate == 0; value /= candidate){
                primes.add(candidate);
            }
        }
        return primes;
    }
}
