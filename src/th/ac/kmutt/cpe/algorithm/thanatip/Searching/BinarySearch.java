package th.ac.kmutt.cpe.algorithm.thanatip.Searching;

import java.util.ArrayList;

public class BinarySearch<T extends Comparable<T>> implements SearchStrategy<T> {

    public int search(ArrayList<T> list, T target1, T target2, int p) {
        int low = 0;
        int high = list.size() - 1;
        if (low == high) {
            return -1;
        }
        int mid = (low + high) / 2;
        while (low != high) {
            if (target1.compareTo(list.get(mid)) < 0) {
                high = mid - 1;
            } else if (target1.compareTo(list.get(mid)) > 0) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
