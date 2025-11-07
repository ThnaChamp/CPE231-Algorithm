package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.EgyptianFraction;

import java.util.*;

public class EgyptianFraction {

    private int nume;
    private int deno;
    List<Integer> denoList = new ArrayList<>();

    public EgyptianFraction(int nume, int deno) {
        this.nume = nume;
        this.deno = deno;
    }

    public void toEgyptian() {
        while (true) {
            if (nume == 1) {
                denoList.add(deno);
                break;
            }
            double divideUp = Math.ceil((double) deno / (double) nume);
            denoList.add((int) divideUp);
            nume = (nume * (int) divideUp) - deno;
            deno = deno * (int) divideUp;
            if (deno % nume == 0) {
                deno = deno / nume;
                nume = 1;
            }
        }
    }

    public void printList() {
        for (int list : denoList) {
            System.out.print("1/" + list + " ");
        }
    }
}
