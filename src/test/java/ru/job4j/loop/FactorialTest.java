package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int actual = Factorial.calculate(number);
        int expected = 120;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int actual = Factorial.calculate(number);
        int expected = 1;
        assertThat(expected).isEqualTo(actual);
    }
}
