package com.hw.change.oo.camp;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ChanceTest {
    private Chance chance;
    private Chance operator;

    @Before
    public void setUp() {
        chance = new Chance(0.3);
        operator = new Chance(0.4);
    }

    @Test(expected = AssertionError.class)
    public void should_counter_exception_when_fraction_more_than_1() {
        // given

        // when
        new Chance(1.1);

        // then

    }

    @Test(expected = AssertionError.class)
    public void should_counter_exception_when_fraction_less_than_0() {
        // given

        // when
        new Chance(-0.2);

        // then

    }

    @Test
    public void should_get_not() {
        // given
        final double not = 0.7;

        // when
        Chance result = chance.not();

        // then
        assertThat(result.getFraction()).isEqualTo(not);
    }

    @Test
    public void should_get_and() {
        // given
        final double and = 0.12;

        // when
        Chance result = chance.and(operator);

        // then
        assertThat(result.getFraction()).isEqualTo(and);
    }

    @Test
    public void should_get_or() {
        // given
        final double or = 0.58;

        // when
        Chance result = chance.or(operator);

        // then
        assertThat(result.getFraction()).isEqualTo(or);
    }
}