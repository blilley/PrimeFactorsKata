package com.pillar;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void generate_When1_ReturnsEmptyList(){
        assertThat(PrimeFactors.generate(1), is(list()));
    }

    @Test
    public void generate_When2_ReturnsListWith2(){
        assertThat(PrimeFactors.generate(2), is(list(2)));
    }

    @Test
    public void generate_When3_ReturnsListWith3(){
        assertThat(PrimeFactors.generate(3), is(list(3)));
    }


    private List<Integer> list(Integer... values) {
        return Lists.newArrayList(values);
    }
}