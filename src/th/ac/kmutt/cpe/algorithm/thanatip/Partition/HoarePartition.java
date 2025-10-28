package th.ac.kmutt.cpe.algorithm.thanatip.Partition;

import java.util.*;

public class HoarePartition extends Partition {

    @Override
    public int Solve(List<Integer> list, int l, int r) {
        int pivot = list.get(l);
        
        int i = l - 1;
        int j = r + 1;

        while (true) {
            do {
                i++;
            } while (i < r && list.get(i) < pivot);

            do {
                j--;
            } while (j > l && list.get(j) > pivot);

            if (i >= j) {
                return j;
            }

            Collections.swap(list, i, j);
        }
    }
}
