package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean actual = Triangle.exist(ab, ac, bc);
        assertThat(actual).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 4.0;
        boolean actual = Triangle.exist(ab, ac, bc);
        assertThat(actual).isFalse();
    }
}
