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
    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod...";
    Map<Character, Integer> words = new HashMap<>();
    char[] symbols = text.toLowerCase().toCharArray();

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
        int max = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (max < integers.get(i)) {
                max = integers.get(i);
            }
        }
        assertThat(max).isEqualTo(42);
        System.out.println("Тест!");
    }

    @Test
    public void testGetMin() throws Exception {
        List<Integer> integers = Arrays.asList(29, 16, 19, 38, 1, 42, 17, 24, 11, 5, 22, 18, 32, 29, 3);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < integers.size(); i++) {
            if (min > integers.get(i)) {
                min = integers.get(i);
            }
        }
        assertThat(min).isEqualTo(1);
        System.out.println("Тест!");
    }


}