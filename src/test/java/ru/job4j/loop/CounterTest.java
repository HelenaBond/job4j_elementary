package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void when0To10InSumThen55() {
        int start = 0;
        int finish = 10;
        int actual = Counter.sum(start, finish);
        int expected = 55;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when3To8InSumThen33() {
        int start = 3;
        int finish = 8;
        int actual = Counter.sum(start, finish);
        int expected = 33;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when1To1InSumThen1() {
        int start = 1;
        int finish = 1;
        int actual = Counter.sum(start, finish);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when10To1InSumThen0() {
        int start = 10;
        int finish = 1;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when0To10InSumByEvenThen30() {
        int start = 0;
        int finish = 10;
        int actual = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when3To8InSumByEvenThen18() {
        int start = 3;
        int finish = 8;
        int actual = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when1To1InSumByEvenThen0() {
        int start = 1;
        int finish = 1;
        int actual = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMinus8To1InSumByEvenThenMinus20() {
        int start = -8;
        int finish = 1;
        int actual = Counter.sumByEven(start, finish);
        int expected = -20;
        assertThat(actual).isEqualTo(expected);
    }
}
