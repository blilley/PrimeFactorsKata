package com.pillar;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void generate_When1_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(1), is(list()));
    }

    @Test
    public void generate_When2_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(2), is(list(2)));
    }

    @Test
    public void generate_When3_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(3), is(list(3)));
    }

    @Test
    public void generate_When4_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(4), is(list(2, 2)));
    }

    @Test
    public void generate_When6_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(6), is(list(2, 3)));
    }

    @Test
    public void generate_When8_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(8), is(list(2, 2, 2)));
    }

    @Test
    public void generate_When9_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(9), is(list(3, 3)));
    }

    @Test
    public void generate_When10_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(10), is(list(2, 5)));
    }

    @Test
    public void generate_When343_ReturnsListOfPrimeFactors() {
        assertThat(PrimeFactors.generate(343), is(list(7, 7, 7)));
    }


    private List<Integer> list(Integer... values) {
        return Lists.newArrayList(values);
    }
}