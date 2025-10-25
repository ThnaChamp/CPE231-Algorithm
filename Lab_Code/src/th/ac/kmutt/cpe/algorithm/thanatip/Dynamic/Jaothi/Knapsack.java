package th.ac.kmutt.cpe.algorithm.thanatip.Dynamic.Jaothi;

import java.util.ArrayList;

public class Knapsack {

    private ArrayList<Jaothi> jaothiList;
    private int time;
    private int n;

    private Integer[][] memo;

    public Knapsack(ArrayList<Jaothi> jaothiList, int time) {
        this.jaothiList = jaothiList;
        this.time = time;
        this.n = jaothiList.size();
        this.memo = new Integer[time + 1][n];
    }

    public int solve() {
        return knapsackRecursive(this.time, 0);
    }

    private int knapsackRecursive(int remainingTime, int index) {
        if (remainingTime <= 0 || index == n) {
            return 0;
        }

        if (memo[remainingTime][index] != null) {
            return memo[remainingTime][index];
        }

        Jaothi currentJaothi = jaothiList.get(index);
        int itemTime = currentJaothi.getTime();
        int itemIncome = currentJaothi.getIncome();

        int maxIncome;

        if (itemTime > remainingTime) {
            maxIncome = knapsackRecursive(remainingTime, index + 1);

        } else {
            int incomeWith = itemIncome + knapsackRecursive(remainingTime - itemTime, index + 1);
            int incomeWithout = knapsackRecursive(remainingTime, index + 1);

            maxIncome = Math.max(incomeWith, incomeWithout);
        }

        memo[remainingTime][index] = maxIncome;
        return maxIncome;
    }
}
