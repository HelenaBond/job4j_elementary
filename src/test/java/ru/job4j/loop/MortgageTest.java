package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MortgageTest {
    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        double amount = 1000;
        int salary = 1200;
        double percent = 1;
        int actual = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        double amount = 100;
        int salary = 120;
        double percent = 50;
        int actual = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        double amount = 1000;
        int salary = 1200;
        double percent = 20;
        int actual = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }
}
