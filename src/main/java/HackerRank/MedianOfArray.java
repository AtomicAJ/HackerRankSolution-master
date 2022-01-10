package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numbers = { 0, 1, 2, 4, 6, 5, 3 };
        List<Integer> arr = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        Collections.sort(arr);
        int mid = (arr.size() / 2);
        System.out.println(arr.get(mid));

    }

}
