package th.ac.kmutt.cpe.algorithm.thanatip.ElementUnique;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.QuickSort;

public class PresortElementUnique {

    public void solve(List<Integer> list) {
        QuickSort solve = new QuickSort();
        solve.sort(list);
        for (int i = 0; i <= list.size() - 2; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
                i--;
            }
        }
    }
}
