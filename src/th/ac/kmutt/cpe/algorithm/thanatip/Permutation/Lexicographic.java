package th.ac.kmutt.cpe.algorithm.thanatip.Permutation;

import java.util.*;

public class Lexicographic extends Permutation {

    public Lexicographic(int n) {
        super(n);
    }

    @Override
    public void Solve(List<Integer> passwordList) {
        List<Integer> numList = new ArrayList<>();
        int round = 0;
        int numCheck = 0;

        for (int i = 1; i <= n; i++) {
            numList.add(i);
        }

        allList.add(new ArrayList<>(numList));
        round++;

        if (numList.equals(passwordList)) {
            System.out.println(round);
            numCheck++;
        }

        while (true) {
            int i = -1;
            for (int k = n - 2; k >= 0; k--) {
                if (numList.get(k) < numList.get(k + 1)) {
                    i = k;
                    break;
                }
            }
            if (i == -1) {
                break;
            }

            int j = -1;
            for (int k = n - 1; k >= 0; k--) {
                if (numList.get(i) < numList.get(k)) {
                    j = k;
                    break;
                }
            }
            Collections.swap(numList, i, j);
            List<Integer> sublistToReverse = numList.subList(i + 1, n);
            Collections.reverse(sublistToReverse);
            round++;
            if (numList.equals(passwordList)) {
                System.out.println(round);
                numCheck++;
                break;
            }
            allList.add(new ArrayList<>(numList));
        }
    }
}
