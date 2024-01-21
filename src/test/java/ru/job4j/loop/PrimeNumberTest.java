package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
    @Test
    void when5Then3() {
        int finish = 5;
        int actual = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when11Then5() {
        int finish = 11;
        int actual = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when2Then1() {
        int finish = 2;
        int actual = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when25Then9() {
        int finish = 25;
        int actual = PrimeNumber.calc(finish);
        int expected = 9;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when49Then15() {
        int finish = 49;
        int actual = PrimeNumber.calc(finish);
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }
}