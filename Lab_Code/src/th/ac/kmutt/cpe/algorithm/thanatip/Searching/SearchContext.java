package th.ac.kmutt.cpe.algorithm.thanatip.Searching;

import java.util.ArrayList;

public class SearchContext<T extends Comparable<T>> {

    private SearchStrategy<T> strategy;

    public SearchContext(SearchStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SearchStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public int executeSearch(ArrayList<T> list, T target1, T target2, int p) {
        return strategy.search(list, target1, target2, p);
    }
}
