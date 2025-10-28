package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Permutation.*;

public class P02_Android {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> allPasswordList = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            List<Integer> passwordList = new ArrayList<>();
            String password = sc.next();
            for (int j = 0; j < n; j++) {
                int passwordInt = password.charAt(j) - 64;
                passwordList.add(passwordInt);
            }
            allPasswordList.add(new ArrayList<>(passwordList));
        }
        for (int i = 0; i < allPasswordList.size(); i++) {
            Permutation list = new Lexicographic(n);
            list.Solve(allPasswordList.get(i));
        }
        sc.close();
    }
}
