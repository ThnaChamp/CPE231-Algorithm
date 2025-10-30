package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.ClosetPair;

public class Coordinate implements Comparable<Coordinate> {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public int compareTo(Coordinate other) {
        return Double.compare(other.getX(), this.getX());
    }

}
