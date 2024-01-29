package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SwitchWeekTest {

    @Test
    void when1InNameOfDayThenMonday() {
        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when8InNameOfDayThenMistake() {
        int day = 8;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(day);
        assertThat(actual).isEqualTo(expected);
    }
}
