package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double actual = RectangleArea.square(p, k);
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void whenP8K2Square3Dot55() {
        double expected = 3.55;
        int p = 8;
        double k = 2;
        double actual = RectangleArea.square(p, k);
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void whenP6K3Square1Dot68() {
        double expected = 1.68;
        int p = 6;
        double k = 3;
        double actual = RectangleArea.square(p, k);
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }
}
