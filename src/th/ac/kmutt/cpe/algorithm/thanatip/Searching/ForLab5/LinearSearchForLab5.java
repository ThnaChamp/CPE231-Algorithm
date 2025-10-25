package th.ac.kmutt.cpe.algorithm.thanatip.Searching.ForLab5;

import java.util.List;
import th.ac.kmutt.cpe.algorithm.thanatip.Fee.Range;

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