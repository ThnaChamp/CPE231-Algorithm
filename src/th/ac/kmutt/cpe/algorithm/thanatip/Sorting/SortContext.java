package th.ac.kmutt.cpe.algorithm.thanatip.Sorting;

import java.util.ArrayList;

public class SortContext<T extends Comparable<T>> {

    private SortStrategy<T> strategy; //Constructore

    public SortContext(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void executeSort(ArrayList<T> list, int l, int u) {
        strategy.sort(list, l, u);
    }
}
