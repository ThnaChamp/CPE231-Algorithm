package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Searching;

import java.util.List;
import th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.Fee.Range;

public class LinearSearchForLab5 {

    public double findCostByWeight(List<Range> routeList, double weight) {
        for (Range range : routeList) {
            if (weight >= range.getFrom() && weight <= range.getTo()) {
                return range.getCost();
            }
        }
        return -1; 
    }
}