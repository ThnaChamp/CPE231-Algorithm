package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.ArrayList;
import java.util.Scanner;
import th.ac.kmutt.cpe.algorithm.thanatip.Dynamic.Jaothi.*;

public class Lab8_DynamicII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jaothi> jaothiList = new ArrayList<>();
        int n = sc.nextInt();
        int time = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int timeCom = sc.nextInt();
            int incomeCom = sc.nextInt();
            Jaothi jaothi = new Jaothi(timeCom, incomeCom);
            jaothiList.add(jaothi);
        }
        
        Knapsack solve = new Knapsack(jaothiList, time);
        int max = solve.solve();
        System.out.println(max);
    }
}
