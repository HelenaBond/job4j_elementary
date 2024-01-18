package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void when0To10Then55() {
        int start = 0;
        int finish = 10;
        int actual = Counter.sum(start, finish);
        int expected = 55;
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void when3To8Then33() {
        int start = 3;
        int finish = 8;
        int actual = Counter.sum(start, finish);
        int expected = 33;
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void when1To1Then1() {
        int start = 1;
        int finish = 1;
        int actual = Counter.sum(start, finish);
        int expected = 1;
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void when10To1Then1() {
        int start = 10;
        int finish = 1;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(expected).isEqualTo(actual);
    }
}