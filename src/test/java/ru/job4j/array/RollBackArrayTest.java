package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RollBackArrayTest {
    @Test
    public void whenEmpty() {
        int[] input = new int[] {};
        int[] actual = RollBackArray.rollback(input);
        int[] expected = new int[] {};
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void whenOne() {
        int[] input = new int[] {1};
        int[] actual = RollBackArray.rollback(input);
        int[] expected = new int[] {1};
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void whenFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] actual = RollBackArray.rollback(input);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] actual = RollBackArray.rollback(input);
        int[] expected = new int[] {1, 1, 1, 1};
        assertThat(actual).containsExactly(expected);
    }
}
