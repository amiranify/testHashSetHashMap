import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    static final String text = "Lorem ipsum dolor sit amet";
    Map<Character, Integer> words = new HashMap<>();

    @BeforeEach
    public void beforeEach() {
        System.out.println("Перед каждым тестом.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("После каждого теста.");
    }

    @Test
    public void testMapWords() {
        Map<Character, Integer> words = new HashMap<>();
        Assertions.assertNotNull(words);
        System.out.println("Тест!");
    }

    @Test
    public void testGetMax() throws Exception {
        List<Integer> integers = Arrays.asList(29, 16, 19, 38, 1, 42, 17, 24, 11, 5, 22, 18, 32, 29, 3);
        assertThat(42).isEqualTo(integers.get(5));
        System.out.println("Тест!");
    }

    @Test
    public void testGetMin() throws Exception {
        List<Integer> integers = Arrays.asList(29, 16, 19, 38, 1, 42, 17, 24, 11, 5, 22, 18, 32, 29, 3);
        assertThat(1).isEqualTo(integers.get(4));
        System.out.println("Тест!");
    }

    @Test
    public void testCharSymbols() {
        assertThat("lorem ipsum dolor sit amet").isEqualTo(text.toLowerCase());
        System.out.println("Тест!");
    }

    @Test
    public void testCharArray() {
        char[] symbols = text.toLowerCase().toCharArray();
        assertThat(text.toLowerCase().toCharArray()).isEqualTo(symbols);
        System.out.println("Тест!");
    }
}