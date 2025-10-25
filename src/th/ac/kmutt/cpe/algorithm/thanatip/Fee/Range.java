package th.ac.kmutt.cpe.algorithm.thanatip.Fee;

public class Range {

    private double from;
    private double to;
    private double cost;

    public Range(double from, double to, double cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "from: " + from + " to: " + to + " cost: " + cost;
    }
}