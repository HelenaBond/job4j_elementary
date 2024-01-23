package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int actual = Min.findMin(array);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int actual = Min.findMin(array);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int actual = Min.findMin(array);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }
}
