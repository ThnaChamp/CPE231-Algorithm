package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.HeapSort;

public class P10_HeapSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        HeapSort solve = new HeapSort();
        List<Integer> withoutSortList = new ArrayList<>(list);

        solve.sortDecreasing(list, list.size(), true);
        solve.sortDecreasing(withoutSortList, list.size(), false);

        System.out.println(withoutSortList);
        System.out.print(list);
        sc.close();
    }
}
