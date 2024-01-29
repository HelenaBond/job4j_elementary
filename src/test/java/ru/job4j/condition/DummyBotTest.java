package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DummyBotTest {
    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String actual = DummyBot.answer(input);
        String expected = "Hi, SmartAss.";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye.";
        String actual = DummyBot.answer(input);
        String expected = "See you later.";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String input = "Can you add two plus two?";
        String actual = DummyBot.answer(input);
        String expected = "I don't know. Please, ask another question.";
        assertThat(actual).isEqualTo(expected);
    }
}
