package HackerRank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RatioOfPosNegZero {

    private static final DecimalFormat df = new DecimalFormat("0.000000");

    public static void main(String[] args) {
        int[] numbers = { -4, 3, -9, 0, 4, 1 };
        List<Integer> c = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int size = c.size();
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("Positive", 0);
        countMap.put("Negative", 0);
        countMap.put("Zero", 0);
        for (int n : c) {
            if (n > 0) {
                countMap.put("Positive", countMap.get("Positive") + 1);
            }
            else if (n < 0) {
                countMap.put("Negative", countMap.get("Negative") + 1);
            } else
                countMap.put("Zero", countMap.get("Zero") + 1);
        }
        String pos = df.format(countMap.get("Positive") / (double) size);
        String neg = df.format(countMap.get("Negative") / (double) size);
        String zero = df.format(countMap.get("Zero") / (double) size);
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
    }

}
