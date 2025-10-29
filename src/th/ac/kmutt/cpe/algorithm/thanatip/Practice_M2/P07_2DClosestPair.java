package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.ClosetPair.*;

public class P07_2DClosestPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Coordinate> coorList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Coordinate coordinate = new Coordinate(x, y);
            coorList.add(coordinate);
        }
        ClosestPair solve = new ClosestPair();
        double ans = solve.solve(coorList);
        System.out.printf("%.3f",ans);
        
    }

}
