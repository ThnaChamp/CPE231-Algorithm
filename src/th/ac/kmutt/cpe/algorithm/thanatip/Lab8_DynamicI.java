package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.Scanner;
import th.ac.kmutt.cpe.algorithm.thanatip.Dynamic.Zigzag.Zigzag;

public class Lab8_DynamicI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] zigzag = new int[n];
        for (int i = 0; i < n; i++) {
            zigzag[i] = sc.nextInt();
        }
        Zigzag solve = new Zigzag(zigzag);
        for (int i = 1; i < n + 1; i++) {
            int max = solve.DP(i, true);
            System.out.printf(max + " ");
        }
        System.out.println("");
        for (int i = 1; i < n + 1; i++) {
            int max = solve.DP(i, false);
            System.out.printf(max + " ");
        }
    }
}
