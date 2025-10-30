package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting;

import java.util.*;

public class BottomUpMergeSort<T extends Comparable<T>> implements SortStrategy<T> {

    public void sort(List<T> listA, int nula, int nulb) {
        int n = listA.size();
        if (n < 2) {
            return;
        }

        for (int i = 1; i < n; i = i * 2) {
            for (int j = 0; j < n - i; j = j + (2 * i)) {
                if (n < (j + (2 * i))) {
                    merge(listA, j, j + i, n);
                } else {
                    merge(listA, j, j + i, j + (2 * i));
                }
            }
        }

    }

    private void merge(List<T> listA, int left, int mid, int right) {
        int i = 0;
        int j = 0;
        int k = left;

        List<T> listB = new ArrayList<>(listA.subList(left, mid));
        List<T> listC = new ArrayList<>(listA.subList(mid, right));

        while (i < listB.size() && j < listC.size()) {
            if (listB.get(i).compareTo(listC.get(j)) <= 0) {
                listA.set(k, listB.get(i));
                i++;
            } else {
                listA.set(k, listC.get(j));
                j++;
            }
            k++;
        }

        while (i < listB.size()) {
            listA.set(k, listB.get(i));
            i++;
            k++;
        }

        while (j < listC.size()) {
            listA.set(k, listC.get(j));
            j++;
            k++;
        }
    }

}
