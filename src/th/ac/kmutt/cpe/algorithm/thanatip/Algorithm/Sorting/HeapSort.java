package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting;

import java.util.*;

public class HeapSort {

    public void maxHeapBottomUp(List<Integer> list, int k, int n) {
        int v = list.get(k - 1);
        boolean heap = false;
        while (!heap && (2 * k) <= n) {
            int j = 2 * k;
            if (j < n) {
                if (list.get(j - 1) < list.get(j)) {
                    j++;
                }
            }
            if (v >= list.get(j - 1)) {
                heap = true;
            } else {
                list.set(k - 1, list.get(j - 1));
                k = j;
            }
        }
        list.set(k - 1, v);
    }

    public void minHeapBottomUp(List<Integer> list, int k, int n) {
        int v = list.get(k - 1);
        boolean heap = false;
        while (!heap && (2 * k) <= n) {
            int j = 2 * k;
            if (j < n) {
                if (list.get(j - 1) > list.get(j)) {
                    j++;
                }
            }
            if (v <= list.get(j - 1)) {
                heap = true;
            } else {
                list.set(k - 1, list.get(j - 1));
                k = j;
            }
        }
        list.set(k - 1, v);
    }

    public void sort(List<Integer> list, int k, int n, boolean sort) {
        for (int i = n / 2; i >= 1; i--) {
            minHeapBottomUp(list, i, n);
        }
        if (sort) {
            for (int i = n; i >= 2; i--) {
                Collections.swap(list, 0, i - 1);
                minHeapBottomUp(list, 1, i - 1);
            }
        }
    }
}
