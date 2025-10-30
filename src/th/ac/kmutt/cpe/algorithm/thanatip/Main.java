package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(40 - (3*i));
        }
        System.out.println("List: " + arr);
        SortContext<Integer> solver1 = new SortContext<Integer>(new InsertionSort<>());
        solver1.executeSort(arr, -1, -1);
        System.out.println("Sort List: " + arr);

    }
}
