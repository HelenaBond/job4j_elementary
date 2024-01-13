package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class Point2Test {

    @ParameterizedTest
    @MethodSource("coordinates")
    @DisplayName("Datasets")
    void distance(int x1, int y1, int x2, int y2, double expected) {
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, offset(0.01));
    }

    private static Stream<Arguments> coordinates() {
        return Stream.of(
                Arguments.of(0, 0, 2, 0, 2),
                Arguments.of(1, 0, 2, 0, 1),
                Arguments.of(0, -1, 2, 0, 2.23),
                Arguments.of(0, 0, 2, 3, 3.6)
        );
    }
}