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
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int actual = Max.max(left, right);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax3To2To1Then3() {
        int first = 3;
        int second = 2;
        int third = 1;
        int actual = Max.max(first, second, third);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int actual = Max.max(first, second, third);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int actual = Max.max(first, second, third);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax3To2To1To0Then3() {
        int first = 3;
        int second = 2;
        int third = 1;
        int fourth = 0;
        int actual = Max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax0To1To2To3Then3() {
        int first = 0;
        int second = 1;
        int third = 2;
        int fourth = 3;
        int actual = Max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int fourth = 3;
        int actual = Max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }
}
