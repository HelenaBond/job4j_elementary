package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        double expected = 2;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when10To20Then2() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        double expected = 1;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when0Minus1To20Then2Dot23() {
        Point a = new Point(0, -1);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        double expected = 2.23;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when00To23Then3Dot6() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 3);
        double actual = a.distance(b);
        double expected = 3.6;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when000To002Then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double actual = a.distance3d(b);
        double expected = 2;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when000To222Then3Dot46() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double actual = a.distance3d(b);
        double expected = 3.46;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when00Minus1To222Then4Dot12() {
        Point a = new Point(0, 0, -1);
        Point b = new Point(2, 2, 2);
        double actual = a.distance3d(b);
        double expected = 4.12;
        assertThat(actual).isEqualTo(expected, offset(0.01));
    }
}
