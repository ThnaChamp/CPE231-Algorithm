package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.Scanner;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Permutation.*;

public class P01_NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Permutation list = new Lexicographic(n);
        list.Solve(null);
        System.out.println("List: " + list.printAllList());
        sc.close();
    }
}
