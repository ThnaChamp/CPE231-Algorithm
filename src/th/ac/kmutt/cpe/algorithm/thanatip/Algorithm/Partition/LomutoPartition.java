package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Partition;

import java.util.*;

public class LomutoPartition extends Partition {

    @Override
    public int Solve(List<Integer> list, int l, int r) {
        int pivot = list.get(l);
        int s = l;
        for (int i = l + 1; i <= r; i++) {
            if (list.get(i) < pivot) {
                s++;
                Collections.swap(list, s, i);
            }
        }
        Collections.swap(list, l, s);
        return s;
    }
}
