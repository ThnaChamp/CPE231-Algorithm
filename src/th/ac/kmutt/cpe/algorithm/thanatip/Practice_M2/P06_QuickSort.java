package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.QuickSort;

public class P06_QuickSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        QuickSort solve = new QuickSort();
        solve.sort(list);
        System.out.println("List: " + list);
        sc.close();
    }
}
