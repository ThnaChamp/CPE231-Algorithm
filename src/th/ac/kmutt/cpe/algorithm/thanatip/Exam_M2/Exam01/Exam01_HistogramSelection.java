package th.ac.kmutt.cpe.algorithm.thanatip.Exam_M2.Exam01;

import java.util.*;

public class Exam01_HistogramSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> list = new ArrayList<>();
        int n = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < n; i++) {
            float D = sc.nextFloat();
            list.add(D);
        }
        int k = sc.nextInt();
        HistogramSelect solve = new HistogramSelect();
        System.out.println(solve.solve(list, k, b));
    }
}
