package com.pillar;

import com.google.common.collect.Lists;

import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int value) {
        if(value > 1){
            return Lists.newArrayList(2);
        }
        return Lists.newArrayList();
    }
}
