package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sum;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.InsertionSort;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.SortContext;

public class MinSum {

    public long result = 0;

    public long solve(List<Long> list) {
        if (list.size() > 2) {
            SortContext<Long> sorter = new SortContext<Long>(new InsertionSort<>());
            sorter.executeSort(list, -1, -1);
        }

        long sum = list.get(0) + list.get(1);
        result += sum;
        list.remove(0);
        list.remove(0);
        list.add(sum);

        if (list.size() == 1) {
            return result;
        } else {
            return solve(list);
        }
    }

}
