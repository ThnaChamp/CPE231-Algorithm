package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.ElementUnique.PresortElementUnique;

public class P09_PresortedUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        PresortElementUnique newList = new PresortElementUnique();
        newList.solve(list);
        System.out.println("List: " + list);
        sc.close();
    }
}
