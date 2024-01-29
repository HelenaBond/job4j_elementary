package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int actual = Max.max(left, right);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int actual = Max.max(left, right);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then2() {
        int left = 3;
        int right = 2;
        int actual = Max.max(left, right);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }
}
