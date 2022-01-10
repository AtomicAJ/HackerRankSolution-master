package HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY c as parameter.
     */

    public static void main(String[] args) {
        // Write your code here
        // int[] clouds = { 0, 0, 1, 0, 0, 1, 0 };
        int[] clouds = { 0, 0, 1, 0, 0 };
        List<Integer> c = Arrays.stream(clouds).boxed().collect(Collectors.toList());
        int pos = 0;
        int jump = 0;
        while (pos < c.size() - 2) {
            if (c.get(pos + 2) == 0) {
                jump++;
                pos = pos + 2;
            }
            else if (c.get(pos + 1) == 0) {
                jump++;
                pos++;
            }

        }
        if (pos == c.size() - 2) {
            if (c.get(pos + 1) == 0) {
                jump++;
            }
        }
        System.out.println(jump);

    }

}
