package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        double expected = 2;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when10to20then2() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        double expected = 1;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when0Minus1to20then2Dot23() {
        Point a = new Point(0, -1);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        double expected = 2.23;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when00to23then3Dot6() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 3);
        double actual = a.distance(b);
        double expected = 3.6;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }
}
