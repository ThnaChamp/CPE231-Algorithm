package th.ac.kmutt.cpe.algorithm.thanatip.Exam_M2.Exam02;

import java.util.*;

public class Exam02_Sand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            long s = sc.nextInt();
            list.add(s);
        }

        MinSum solve = new MinSum();
        System.out.println(solve.solve(list));

    }
}
