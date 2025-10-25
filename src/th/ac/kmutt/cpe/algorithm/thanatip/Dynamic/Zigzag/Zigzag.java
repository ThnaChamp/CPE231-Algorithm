package th.ac.kmutt.cpe.algorithm.thanatip.Dynamic.Zigzag;

public class Zigzag {

    private int n;
    private int[] zigzag;

    private Integer[] memoUp;
    private Integer[] memoDown;

    public Zigzag(int[] zigzag) {
        this.n = zigzag.length;
        this.zigzag = zigzag;
        this.memoUp = new Integer[n];
        this.memoDown = new Integer[n];
    }

    public int DP(int i, boolean b) {

        if (zigzag == null || n == 0 || i <= 0) {
            return 0;
        }

        if (i > this.n) {
            i = this.n;
        }

        this.memoUp = new Integer[n];
        this.memoDown = new Integer[n];

        int length;

        length = solve(i - 1, b);

        return length;

    }

    private int solve(int i, boolean b) {

        if (b && memoUp[i] != null) {
            return memoUp[i];
        }
        if (!b && memoDown[i] != null) {
            return memoDown[i];
        }

        int maxLength = 1;

        for (int j = 0; j < i; j++) {
            if (b) {
                if (zigzag[i] > zigzag[j]) {
                    maxLength = Math.max(maxLength, 1 + solve(j, !b));
                }
            } else {
                if (zigzag[i] < zigzag[j]) {
                    maxLength = Math.max(maxLength, 1 + solve(j, !b));
                }
            }
        }
        if (b) {
            memoUp[i] = maxLength;
        } else {
            memoDown[i] = maxLength;
        }
        return maxLength;
    }
}
