package HackerRank;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // TODO Auto-generated method stub

        int[] numbers1 = { 1, 1, 3, 2, 1 };
        List<Integer> arr = Arrays.stream(numbers1).boxed().collect(Collectors.toList());

        List<Integer> output = new ArrayList<Integer>(100);
        for (int i = 0; i < 100; i++) {
            output.add(0);
        }

        for (int i : arr) {
            int temp = output.get(i) + 1;
            output.set(i, temp);
        }

        for (int i : output) {
            System.out.println(i);
        }

    }

}
