package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int actual = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int actual = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int actual = MinDiapason.findMin(array, start, finish);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenLastStartAndFinish() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 3;
        int finish = 3;
        int actual = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenFirstStartAndFinish() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 0;
        int finish = 0;
        int actual = MinDiapason.findMin(array, start, finish);
        int expected = 10;
        assertThat(actual).isEqualTo(expected);
    }
}
