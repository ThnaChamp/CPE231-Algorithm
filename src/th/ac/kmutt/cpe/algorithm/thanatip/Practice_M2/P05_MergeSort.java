package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.BottomUpMergeSort;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.SortContext;

public class P05_MergeSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        SortContext<Integer> solve = new SortContext<Integer>(new BottomUpMergeSort<>());
        solve.executeSort(list, -1, -1);
        System.out.println("List: " + list);
        sc.close();
    }

}
