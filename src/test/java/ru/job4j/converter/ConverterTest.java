package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert420RblThen6Euro() {
        float input = 420;
        float expected = 6;
        float actual = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, offset(value));
    }

    @Test
    void whenConvert420RblThen7Dollar() {
        float input = 420;
        float expected = 7;
        float actual = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, offset(value));
    }

    @Test
    void whenConvert6EuroThen420Ruble() {
        float input = 6;
        float expected = 420;
        float actual = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, offset(value));
    }

    @Test
    void whenConvert7DollarThen420Ruble() {
        float input = 7;
        float expected = 420;
        float actual = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, offset(value));
    }
}
