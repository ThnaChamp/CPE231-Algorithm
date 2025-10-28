package th.ac.kmutt.cpe.algorithm.thanatip.Selection;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Partition.*;

public class QuickSelection {

    public int Selection(List<Integer> list, int k) {
        Partition partition = new LomutoPartition();
        int s = partition.Solve(list, 0, list.size() - 1);
        if (s == k - 1) {
            return list.get(s);
        } else if (s > k - 1) {
            return Selection(list.subList(0, s), k);
        } else {
            return Selection(list.subList(s + 1, list.size()), k - 1 - s);
        }
    }
}
