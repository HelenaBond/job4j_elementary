package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LogicNotTest {
    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean actual = LogicNot.isEven(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean actual = LogicNot.isEven(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        int num = 2;
        boolean actual = LogicNot.isPositive(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        int num = -2;
        boolean actual = LogicNot.isPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean actual = LogicNot.isPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 2;
        boolean actual = LogicNot.notEven(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean actual = LogicNot.notEven(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenNotPositiveTrue() {
        int num = -2;
        boolean actual = LogicNot.notPositive(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenNotPositiveFalse() {
        int num = 2;
        boolean actual = LogicNot.notPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenNumIs0NotPositiveFalse() {
        int num = 0;
        boolean actual = LogicNot.notPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean actual = LogicNot.notEvenAndPositive(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean actual = LogicNot.notEvenAndPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        int num = -3;
        boolean actual = LogicNot.notEvenAndPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int num = 0;
        boolean actual = LogicNot.notEvenAndPositive(num);
        assertThat(actual).isFalse();
    }

    @Test
    void whenEvenOrNotPositiveIsTrue() {
        int num = -2;
        boolean actual = LogicNot.evenOrNotPositive(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        int num = 2;
        boolean actual = LogicNot.evenOrNotPositive(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenNotPositiveIsTrueThenAllIsTrue() {
        int num = -3;
        boolean actual = LogicNot.evenOrNotPositive(num);
        assertThat(actual).isTrue();
    }

    @Test
    void whenEvenOrNotPositiveIsFalse() {
        int num = 3;
        boolean actual = LogicNot.evenOrNotPositive(num);
        assertThat(actual).isFalse();
    }
}
