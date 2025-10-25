package th.ac.kmutt.cpe.algorithm.thanatip.BinPacking;

public class BoxSize implements Comparable<BoxSize> {

    private double width;
    private double length;

    public BoxSize(double width, double length) {
        if (width < length) {
            this.width = length;
            this.length = width;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public int compareTo(BoxSize other) {
        return Double.compare(other.getWidth(), this.getWidth());
    }
}
