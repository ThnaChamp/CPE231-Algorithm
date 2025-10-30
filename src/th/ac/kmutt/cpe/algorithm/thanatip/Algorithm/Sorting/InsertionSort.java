package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting;

import java.util.*;

public class InsertionSort<T extends Comparable<T>> implements SortStrategy<T> {

    public void sort(List<T> list, int nula, int nulb) {
        int j;
        T v;
        for (int i = 1; i < list.size(); i++) {
            v = list.get(i);
            j = i - 1;
            while (j >= 0 && list.get(j).compareTo(v) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, v);
        }
    }
}
