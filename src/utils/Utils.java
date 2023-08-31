package utils;

import java.util.Arrays;import java.util.Map;

public class Utils {
  private Utils() {}

  public static void printFormattedDoubleArray(double[] array, int precision) {
    String format = "%." + precision + "f";
    System.out.println(
        Arrays.toString(Arrays.stream(array).mapToObj(x -> String.format(format, x)).toArray()));
  }

}
