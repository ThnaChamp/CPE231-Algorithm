package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Searching;

import java.util.ArrayList;

public class LinearSearch<T extends Comparable<T>> implements SearchStrategy<T> {

    public int search(ArrayList<T> list, T target1, T target2 , int p) { // "T" is every Type
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target1) {
                return i;
            }
        }
        return -1;
    }
}
