package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting;

import java.util.*;

public class SelectionSort<T extends Comparable<T>> implements SortStrategy<T> {

    public void sort(List<T> list, int l, int u) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(j).compareTo(list.get(i)) < 0){
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
