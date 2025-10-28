package th.ac.kmutt.cpe.algorithm.thanatip.Sorting;

import java.util.*;

public class CountingSort<Integer extends Comparable<Integer>> implements SortStrategy<Integer> {

    public void sort(List<Integer> list, int l, int u) {
        int[] d = new int[u + l + 1]; 
        for (int j = 0; j < u - l; j++) {
            d[j] = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            // d[list.get(i) - l] = d[list.get(i) - l] + 1;
        }
    }
}
