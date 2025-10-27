package th.ac.kmutt.cpe.algorithm.thanatip.Permutation;

import java.util.ArrayList;
import java.util.List;

public abstract class Permutation {

    protected int n;
    protected List<List<Integer>> allList = new ArrayList<>();

    public Permutation(int n) {
        this.n = n;
    }

    public List<List<Integer>> printAllList() {
        return allList;
    }

    public abstract void Solve(List<Integer> allPasswordList);
}
