package th.ac.kmutt.cpe.algorithm.thanatip.Sum;

import java.util.List;

public class Kadane {

    public int maxSublistSum(List<Integer> list) {
        int maxEnding = Integer.MIN_VALUE;
        int maxCurrent = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            maxCurrent = Math.max(list.get(i), maxCurrent + list.get(i));
            maxEnding = Math.max(maxEnding, maxCurrent);
        }
        return maxEnding;
    }
}
