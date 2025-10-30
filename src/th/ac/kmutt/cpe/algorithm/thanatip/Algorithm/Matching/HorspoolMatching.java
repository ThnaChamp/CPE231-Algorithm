package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Matching;

import java.util.*;

public class HorspoolMatching {

    public int shift = 0;
    public boolean matched = false;

    public String getMatch() {
        if (matched) {
            return "YES"; 
        }else {
            return "NO";
        }
    }

    public int getShift() {
        return shift;
    }

    public int Matching(List<Integer> pattern, List<Integer> text) {
        int m = pattern.size();
        int n = text.size();

        List<Integer> table = new ArrayList<>(ShiftTable(pattern, m));

        int i = m - 1;
        while (i <= n - 1) {
            int k = 0;
            while (k <= m - 1 && pattern.get(m - 1 - k) == text.get(i - k)) {
                k++;
            }
            if (k == m) {
                matched = true;
                return i - m + 1;
            } else {
                shift++;
                i = i + table.get(text.get(i));
            }
        }
        matched = false;
        return -1;
    }

    private List<Integer> ShiftTable(List<Integer> pattern, int m) {
        List<Integer> table = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            table.add(m);
        }
        for (int j = 0; j <= m - 2; j++) {
            table.set(pattern.get(j), m - 1 - j);
        }
        return table;
    }

}
