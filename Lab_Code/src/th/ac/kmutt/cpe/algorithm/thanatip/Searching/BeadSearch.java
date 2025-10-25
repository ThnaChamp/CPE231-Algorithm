package th.ac.kmutt.cpe.algorithm.thanatip.Searching;

import java.util.ArrayList;

public class BeadSearch<T extends Comparable<T>> implements SearchStrategy<T> {

    public int search(ArrayList<T> list, T front, T rear, int p) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == front) {
                for (int j = i + p - 1; j < list.size(); j++) {
                    if (list.get(j) == rear) {
                        count++;
                    } else {
                        continue;
                    }
                }
            }
        }
        return count;
    }
}
