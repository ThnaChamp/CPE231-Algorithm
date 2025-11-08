package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.Dynamic.EOD;

public class EOD {

    private int[] bList;
    private int n;
    private Integer[] memo;

    public EOD(int[] bList) {
        this.n = bList.length;
        this.bList = bList;
        this.memo = new Integer[n];
    }

    public int maxArea() {
        if (n == 0) {
            return 0;
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, solve(i));
        }

        return maxArea;
    }

    private int solve(int i) {
        if (bList[i] <= 0) {
            return 0;
        }

        if (memo[i] != null) {
            return memo[i];
        }

        int maxArea = 1 + bList[i];

        for (int j = 0; j < i; j++) {
            if (i >= ((j + 1) + bList[j])) {
                maxArea = Math.max(maxArea, (1 + bList[i]) + solve(j));
            }
        }

        memo[i] = maxArea;
        return maxArea;
    }

}
