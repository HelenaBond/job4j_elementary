package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5InIndexOfThen0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int actual = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10InIndexOfThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int element = 18;
        int actual = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8InIndexInRangeThenMinus1() {
        int[] data = new int[] {1, 3, 5, 8};
        int element = 8;
        int start = 0;
        int end = 2;
        int actual = FindLoop.indexInRange(data, element, start, end);
        int expected = -1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8InEndInIndexInRangeThen3() {
        int[] data = new int[] {1, 3, 5, 8};
        int element = 8;
        int start = 0;
        int end = 3;
        int actual = FindLoop.indexInRange(data, element, start, end);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }
}
