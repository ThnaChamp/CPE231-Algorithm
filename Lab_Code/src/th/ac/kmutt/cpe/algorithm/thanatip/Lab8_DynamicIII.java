package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Dynamic.EOD.EOD;

public class Lab8_DynamicIII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bList = new int[n];

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            bList[i] = b;
        }

        EOD eod = new EOD(bList);
        int max = eod.maxArea();
        System.out.println(max);

    }
}
