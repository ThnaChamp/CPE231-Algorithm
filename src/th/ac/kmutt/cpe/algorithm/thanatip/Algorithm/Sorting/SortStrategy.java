package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting;

import java.util.*;

public interface SortStrategy<T extends Comparable<T>> {

    public void sort(List<T> list , int l, int u);
}
