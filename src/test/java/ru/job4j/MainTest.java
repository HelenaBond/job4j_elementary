package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int actual = 1;
        assertThat(actual).isEqualTo(excepted);
    }
}
