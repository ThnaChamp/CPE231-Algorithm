package th.ac.kmutt.cpe.algorithm.thanatip.ClosetPair;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.SelectionSort;

public class ClosestPair {

    public double solve(List<Coordinate> coorList) {
        SelectionSort<Coordinate> sorter = new SelectionSort<>();
        sorter.sort(coorList, -1, -1);
        return solveRecursive(coorList, 0, coorList.size() - 1);
    }

    private double solveRecursive(List<Coordinate> coorList, int l, int r) {
        if (r - l <= 2) {
            double minDist = Double.MAX_VALUE;
            for (int i = l; i <= r; i++) {
                for (int j = i + 1; j <= r; j++) {
                    minDist = Math.min(minDist, distance(coorList.get(i), coorList.get(j)));
                }
            }
            return minDist;
        }

        int mid = (r + l)/ 2;

        double dl = solveRecursive(coorList, l, mid);
        double dr = solveRecursive(coorList, mid + 1, r);

        double d = Math.min(dl, dr);

        List<Coordinate> midLineList = new ArrayList<>();

        double minMid = Double.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (Math.abs(coorList.get(i).getX() - coorList.get(mid).getX()) < d) {
                Coordinate coordinate = new Coordinate(coorList.get(i).getX(), coorList.get(i).getY());
                midLineList.add(coordinate);
            }
        }

        for (int i = 0; i < midLineList.size(); i++) {
            for (int j = i + 1; j < midLineList.size(); j++) {
                minMid = Math.min(minMid, distance(midLineList.get(i), midLineList.get(j)));
            }
        }

        return Math.min(d, minMid);

    }

    private double distance(Coordinate p1, Coordinate p2) {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }
}
