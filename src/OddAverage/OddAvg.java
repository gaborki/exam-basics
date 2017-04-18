package OddAverage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 18/04/2017.
 */
public class OddAvg {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      numbers.add(i);
    }
    System.out.println(oddAverage(numbers));
  }

  public static int oddAverage(ArrayList<Integer> numbers) {
    int sumOfOddNumbers = 0;
    int count = 0;
    for (Integer number : numbers) {
      if (number % 2 == 1) {
        sumOfOddNumbers += number;
        count++;
      }
    }
    return sumOfOddNumbers / count;
  }
}

