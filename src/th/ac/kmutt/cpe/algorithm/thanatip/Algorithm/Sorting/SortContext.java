package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting;

import java.util.*;

public class SortContext<T extends Comparable<T>> {

    private SortStrategy<T> strategy; //Constructore

    public SortContext(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void executeSort(List<T> list, int l, int u) {
        strategy.sort(list, l, u);
    }
}
