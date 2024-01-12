package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when10to20then2() {
        double expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when0Minus1to20then2Dot23() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = -1;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when00to23then3Dot6() {
        double expected = 3.6;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, offset(0.01));
    }
}