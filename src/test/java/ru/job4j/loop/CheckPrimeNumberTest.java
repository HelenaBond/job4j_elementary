package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isTrue();
    }

    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isFalse();
    }

    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isFalse();
    }

    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isTrue();
    }

    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isFalse();
    }

    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isFalse();
    }

    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean actual = CheckPrimeNumber.check(number);
        assertThat(actual).isFalse();
    }
}
