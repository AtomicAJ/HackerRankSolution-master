package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class ValleyCountHike {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER steps 2. STRING path
     */

    public static void main(String[] args) {
        // Write your code here
        String path = "DDDUUUUUDDDUUDUDDDUUDUUDDDUUDDDDDUDDUUDUDDUDUDDUDDDUDUUDUDUDDUDDDDDDDUUUUUUUUDUUDUUUUDUDDDUDDUUDUDDUDUDUUUUUUDUDDDDDDUDDDUUUDDUDDUDDUUUUDDDDUDUUUUUDUUDUDDUUUDUUUDDUDDDDUUUUDDDDDDUUUUDDDDUDDUUDDDDUUDUDDUUDUUUDUUUUDDUDDDDUUDUDDDDDUDUDUDUUDDUDUDDUDDDDUDUDUDUUUDDDDDUUUDDDUDDDUDDDDUDUDUDDUDDDDDDUDUDUDDDDDDUUUDDDUDUUDDDDUDUDDDDDUDDUUDUDDDDUDDDUUUUUDUDDUDUUDUDDDDUUUUDDDUDUUUUUUUDUUDDDUDUDDDDUDDUUDDDDDUDDUUUUDUUDUDDUDUUDDUUUDUUUUDDUUUUDDUUDUUUDUDUUUDUDDUDDDUDUUUUUUUUUUUDUDDUDDDDDUUDUDDUDDUDUDUUDDDDUUUDDUDDUDDUUDUUUDUDUUUUUDDUUDUUDUDDUDUUUUUUDDDDUUUDDUDUUUUUUUDDUUDDUUUUUDDUUDUUUDDUDUDUUDDDUDUUUUUUUDUUUUDDUDDDUDUUDUDDDUDUUUDUUUDDDUDDUUUUUDUUDDDDDDUUDDUDUDDUDUDUDDUDUDUUUDUDUUDUDUUDUDUDDDDUUUUDDDUUDUUDDUDUDUUDUDUUUDDUUUDUDUDDDUDDUUUDUDUUUDDUDUDUDDUUDDDDUUUUUDUDUUDUDUUDDDDUDDDUDUUUUUDDDUDDDDUUDDUUDUUUUUUDDUUDDUUUUUUUDUDDUDDDDDDDUDDDDUDUDUDUUDUDDDUDUUUUDDUUUDUDUDUUDDDDDUUUUUUDUDDUDUDDUDDUDUUDUDUUUUUDUDDDDUUUDDUUDDDUUUUDUDDDUDDUUUDDDDUDDDUDDDUUDDDDUUDDDUDDDUUUUUUDUDUUDUUDUDDDUDUUDDUDDDDUDUDUUUUUUUUUU";
        Map<Character, Integer> stepsMap = new HashMap<>();
        int valleyCount = 0;
        Boolean isNewValley = true;
        stepsMap.put('D', 0);
        stepsMap.put('U', 0);
        for (char c : path.toCharArray()) {
            stepsMap.put(c, stepsMap.get(c) + 1);
            if (stepsMap.get('D') > stepsMap.get('U') && isNewValley) {
                valleyCount++;
                isNewValley = false;

            } else if (stepsMap.get('D') == stepsMap.get('U')) {
                isNewValley = true;
            }

        }
        System.out.println(valleyCount);
    }

}
