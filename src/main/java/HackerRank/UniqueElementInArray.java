package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class UniqueElementInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] numbers = { 1, 2, 3, 4, 3, 2, 1 };
        List<Integer> a = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : a) {
            if (!countMap.containsKey(n)) {
                countMap.put(n, 0);
            } else {
                countMap.put(n, countMap.get(n) + 1);
            }
        }

        for (Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue().equals(0)) {
                System.out.println(entry.getKey());
            }
        }

    }

}
