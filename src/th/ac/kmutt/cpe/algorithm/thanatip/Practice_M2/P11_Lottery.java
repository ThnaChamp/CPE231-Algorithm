package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Matching.*;

public class P11_Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> text = new ArrayList<>();
        List<Integer> pattern = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        String t = sc.next();
        String p = sc.next();

        for (int i = 0; i < n; i++) {
            int textInt = t.charAt(i) - 64;
            text.add(textInt);
        }

        for (int i = 0; i < m; i++) {
            int patternInt = p.charAt(i) - 64;
            pattern.add(patternInt);
        }

        HorspoolMatching solve = new HorspoolMatching();
        int pos = solve.Matching(pattern, text);

        System.out.print(solve.getMatch() + " " + solve.getShift() + " " + pos);

    }
}
