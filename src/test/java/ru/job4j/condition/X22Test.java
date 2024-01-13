package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class X22Test {

    @ParameterizedTest
    @MethodSource("members")
    @DisplayName("Datasets")
    void calc(int a, int b, int c, int x, int expected) {
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> members() {
        return Stream.of(
                Arguments.of(10, 0, 0, 2, 40),
                Arguments.of(1, 1, 1, 1, 3),
                Arguments.of(0, 1, 1, 1, 2),
                Arguments.of(1, 1, 0, 1, 2),
                Arguments.of(1, 1, 1, 0, 1)
        );
    }
}