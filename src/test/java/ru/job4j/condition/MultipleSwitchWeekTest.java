package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenMondayThenNumberOfDay1() {
        String nameOfDay = "Monday";
        int actual = MultipleSwitchWeek.numberOfDay(nameOfDay);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenRusMondayThenNumberOfDay1() {
        String nameOfDay = "Понедельник";
        int actual = MultipleSwitchWeek.numberOfDay(nameOfDay);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenNotValidNameThenNumberOfDayMinus1() {
        String nameOfDay = "Week";
        int actual = MultipleSwitchWeek.numberOfDay(nameOfDay);
        int expected = -1;
        assertThat(actual).isEqualTo(expected);
    }
}
