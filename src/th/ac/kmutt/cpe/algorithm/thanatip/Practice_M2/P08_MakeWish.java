package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sum.Kadane;

public class P08_MakeWish {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> yanList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int yan = sc.nextInt();
            yanList.add(yan);
        }

        Kadane list = new Kadane();
        System.out.print("Sum: " + list.maxSublistSum(yanList));
        sc.close();
    }
}
