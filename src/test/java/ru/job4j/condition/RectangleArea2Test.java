package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class RectangleArea2Test {

    @ParameterizedTest
    @MethodSource("edges")
    @DisplayName("Datasets")
    void square(int p, int k, double expected) {
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, offset(0.01));
    }

    private static Stream<Arguments> edges() {
        return Stream.of(
                Arguments.of(6, 2, 2),
                Arguments.of(8, 2, 3.55),
                Arguments.of(6, 3, 1.68)
        );
    }
}