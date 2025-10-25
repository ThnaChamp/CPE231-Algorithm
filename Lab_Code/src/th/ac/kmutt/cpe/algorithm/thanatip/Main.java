package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Searching.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(40 - (3*i));
        }
        System.out.println("List: " + arr);
        SearchContext<Integer> solver = new SearchContext<Integer>(new BinarySearch<>());
        SortContext<Integer> solver1 = new SortContext<Integer>(new SelectionSort<>());
        int answer = solver.executeSearch(arr, 40, null, -1);
        solver1.executeSort(arr, -1, -1);
        System.out.println("Sort List: " + arr);
        System.out.println(answer);

    }
}
