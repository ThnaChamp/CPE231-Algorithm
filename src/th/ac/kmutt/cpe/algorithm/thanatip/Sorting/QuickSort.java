package th.ac.kmutt.cpe.algorithm.thanatip.Sorting;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Partition.*;

public class QuickSort {

    public void sort(List<Integer> listA) {
        sortRecursive(listA, 0, listA.size() - 1);
    }

    private void sortRecursive(List<Integer> listA, int l, int r) {
        if (l < r) {
            Partition partition = new HoarePartition();
            int s = partition.Solve(listA, l, r);

            sortRecursive(listA, l, s);
            sortRecursive(listA, s + 1, r);
        }
    }
}
