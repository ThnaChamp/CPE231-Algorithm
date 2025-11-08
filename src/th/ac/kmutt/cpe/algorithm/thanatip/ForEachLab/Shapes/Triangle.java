package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.Shapes;

public class Triangle extends Shape {

    private double p1x, p1y, p2x, p2y, p3x, p3y;

    public Triangle(String color, double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
        super(color);
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p3x = p3x;
        this.p3y = p3y;
    }

    private double l1() {
        return Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
    }

    private double l2() {
        return Math.sqrt(Math.pow((p2x - p3x), 2) + Math.pow((p2y - p3y), 2));
    }

    private double l3() {
        return Math.sqrt(Math.pow((p3x - p1x), 2) + Math.pow((p3y - p1y), 2));
    }

    public double area() {
        double s = (l1() + l2() + l3()) / 2;
        return Math.sqrt(s * (s - l1()) * (s - l2()) * (s - l3()));
    }

    public double perimeter() {
        return (l1() + l2() + l3());
    }

    public void getP() {
        System.out.printf("P1 (%.2f,%.2f)\n", this.p1x, this.p1y);
        System.out.printf("P2 (%.2f,%.2f)\n", this.p2x, this.p2y);
        System.out.printf("P3 (%.2f,%.2f)", this.p3x, this.p3y);
    }

    public void setP1(double p1x, double p1y) {
        this.p1x = p1x;
        this.p1y = p1y;
    }

    public void setP2(double p2x, double p2y) {
        this.p2x = p2x;
        this.p2y = p2y;
    }

    public void setP3(double p3x, double p3y) {
        this.p3x = p3x;
        this.p3y = p3y;
    }

}
