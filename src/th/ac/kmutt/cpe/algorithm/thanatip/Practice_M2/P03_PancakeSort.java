package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.ArrayList;
import java.util.Scanner;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.PancakeSort;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.SortContext;

public class P03_PancakeSort {

    public static void main(String[] args) {
        ArrayList<Integer> pancakeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int pancake = sc.nextInt();
            pancakeList.add(pancake);
        }

        SortContext<Integer> solver1 = new SortContext<Integer>(new PancakeSort<>());
        solver1.executeSort(pancakeList, n, -1);
        System.out.println("Sort List: " + pancakeList);
        sc.close();
    }
}
