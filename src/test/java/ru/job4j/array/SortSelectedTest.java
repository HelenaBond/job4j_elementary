package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1};
        int[] actual = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] actual = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(actual).containsExactly(expected);
    }
}
