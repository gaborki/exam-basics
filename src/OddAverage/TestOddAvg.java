package OddAverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Created by Gabor on 18/04/2017.
 */
public class TestOddAvg {

  ArrayList<Integer> numbers;

  @BeforeEach
  void initTest() {
  }

  @Test
  void testOddAverage() {
    numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }
    assertEquals(5, OddAvg.oddAverage(numbers));
  }

  @Test
  void testEmptyList() {
    numbers = new ArrayList<>();
    assertEquals(0, OddAvg.oddAverage(numbers));
  }

  @Test
  void testOneOddElement() {
    numbers = new ArrayList<>();
    numbers.add(5);
    assertEquals(5, OddAvg.oddAverage(numbers));
  }

  @Test
  void testOneEvenElement() {
    numbers = new ArrayList<>();
    numbers.add(4);
    assertEquals(0, OddAvg.oddAverage(numbers));
  }

  @Test
  void testNull() {
    numbers = null;
    assertEquals(0, OddAvg.oddAverage(numbers));
  }
}

