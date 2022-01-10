package HackerRank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void main(String[] args) {
        // int[] numbers = { 256741038, 623958417, 467905213, 714532089, 938071625 };
        int[] numbers = { 396285104, 573261094, 759641832, 819230764, 364801279 };
        List<Integer> arr = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(arr);
        long minSum = arr.stream().limit(4).reduce(0, Integer::sum);
        long maxSum = arr.stream().skip(1).reduce(0, Integer::sum);

        BigInteger minimumSum = BigInteger.ZERO;
        BigInteger maximunSum = BigInteger.ZERO;

        for (int i = 0; i < arr.size(); i++) {
            if (i != arr.size() - 1) {
                minimumSum = BigInteger.valueOf(arr.get(i).intValue()).add(minimumSum);
            }
            if (i != 0) {
                maximunSum = BigInteger.valueOf(arr.get(i).intValue()).add(maximunSum);
            }
        }

        System.out.println(minimumSum + " " + maximunSum);
    }

}
