package com.pillar;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void testOne(){
        List<Integer> expected = Lists.newArrayList();
        assertThat(PrimeFactors.generate(1), is(expected));
    }
}