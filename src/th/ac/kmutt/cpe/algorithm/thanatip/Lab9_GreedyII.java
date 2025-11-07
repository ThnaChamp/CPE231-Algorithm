package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.EgyptianFraction.EgyptianFraction;

public class Lab9_GreedyII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nume = sc.nextInt();
        int deno = sc.nextInt();
        EgyptianFraction egypt = new EgyptianFraction(nume, deno);
        egypt.toEgyptian();
        egypt.printList();
    }
}
