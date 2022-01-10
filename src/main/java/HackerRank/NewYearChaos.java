package HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewYearChaos {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 3, 7, 8, 6, 4 };
		List<Integer> q = Arrays.stream(array).boxed().collect(Collectors.toList());
		int bribes = 0;
        for (int i = 1; i <= q.size(); ++i) {
             if (q.get(i-1)- i > 2) {
                 System.out.println("Too chaotic");
                 bribes = -1;
                 break;
             }
        }
        
        if (bribes == 0)
        {
            for (int i = 0; i < q.size(); ++i) {
                for (int j = i + 1; j < i + 100 && j < q.size(); ++j) {
                    if (q.get(j) < q.get(i)) {
                        bribes++;
                    }
                }
            }
            System.out.println(bribes);
        }
	}

}
