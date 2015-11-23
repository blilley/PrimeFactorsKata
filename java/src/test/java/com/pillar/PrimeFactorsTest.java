package com.pillar;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void testOne(){
        assertThat(PrimeFactors.generate(1), is(empty()));
    }

    @Test
    public void testTwo(){
        assertThat(PrimeFactors.generate(2), is(list()));
    }
    
    private List<Integer> list() {
        return Lists.newArrayList(2);
    }
}