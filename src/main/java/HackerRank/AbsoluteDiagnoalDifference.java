package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AbsoluteDiagnoalDifference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] numbers1 = { 11, 2, 4 };
        List<Integer> row1 = Arrays.stream(numbers1).boxed().collect(Collectors.toList());
        int[] numbers2 = { 4, 5, 6 };
        List<Integer> row2 = Arrays.stream(numbers2).boxed().collect(Collectors.toList());
        int[] numbers3 = { 10, 8, -12 };
        List<Integer> row3 = Arrays.stream(numbers3).boxed().collect(Collectors.toList());

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(row1);
        arr.add(row2);
        arr.add(row3);

        int leftPos = 0;
        int rightPos = arr.size() - 1;
        int leftDiagonalCount = 0;
        int rightDiagnoalCount = 0;
        while (leftPos < arr.size()) {
            leftDiagonalCount = leftDiagonalCount + arr.get(leftPos).get(leftPos);
            rightDiagnoalCount = rightDiagnoalCount + arr.get(rightPos).get(leftPos);
            leftPos++;
            rightPos--;
        }

        System.out.println(Math.abs(leftDiagonalCount - rightDiagnoalCount));

    }

}
