package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Selection.*;

public class P04_QuickSelect {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        int k = sc.nextInt();
        QuickSelection solve = new QuickSelection();
        int ans = solve.Selection(list, k);
        System.out.print(ans);
        sc.close();
    }
}
