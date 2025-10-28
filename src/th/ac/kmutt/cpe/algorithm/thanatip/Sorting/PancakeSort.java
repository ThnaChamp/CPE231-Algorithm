package th.ac.kmutt.cpe.algorithm.thanatip.Sorting;

import java.util.*;

public class PancakeSort<T extends Comparable<T>> implements SortStrategy<T> {

    public void sort(List<T> list, int l, int nul) {
        while (l >= 0) {
            int maxPosition = maxPosition(list, l);
            flip(list, l, maxPosition);
            l--;
        }
    }

    private int maxPosition(List<T> list, int end) {
        T max = list.get(0);
        int maxPosition = 0;
        for (int i = 0; i < end; i++) {
            if (list.get(i).compareTo(max) == 1) {
                max = list.get(i);
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    private void flip(List<T> list, int end, int maxPosition) {
        List<T> subListFlip1 = list.subList(0, maxPosition + 1);
        Collections.reverse(subListFlip1);
        List<T> subListFlip2 = list.subList(0, end);
        Collections.reverse(subListFlip2);
    }
}
