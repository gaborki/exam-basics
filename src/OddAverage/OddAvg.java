package OddAverage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 18/04/2017.
 */
public class OddAvg {

  public static void main(String[] args) {

  }

  public static int oddAverage(ArrayList<Integer> numbers) {
    if (numbers == null || numbers.size() == 0) {
      return 0;
    } else {
      int sumOfOddNumbers = 0;
      int count = 0;
      for (Integer number : numbers) {
        if (number % 2 == 1) {
          sumOfOddNumbers += number;
          count++;
        }
      }
      if (count == 0) {
        return 0;
      } else {
        return sumOfOddNumbers / count;
      }
    }
  }
}

