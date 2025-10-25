package th.ac.kmutt.cpe.algorithm.thanatip.Shapes;

public class Rectangle extends Shape {

    private double p1x, p1y, p2x, p2y;

    public Rectangle(String color, double p1x, double p1y, double p2x, double p2y) {
        super(color);
        this.p1x = p1x;
        this.p2x = p2x;
        this.p1y = p1y;
        this.p2y = p2y;
    }

    public double area() {
        return Math.abs(p1x - p2x) * Math.abs(p1y - p2y);
    }

    public double perimeter() {
        return (Math.abs(p1x - p2x) + Math.abs(p1y - p2y)) * 2;
    }

    public void getP() {
        System.out.printf("P1 (%.2f,%.2f)\n", this.p1x, this.p1y);
        System.out.printf("P2 (%.2f,%.2f)", this.p2x, this.p2y);
    }

    public void setP1(double p1x, double p1y) {
        this.p1x = p1x;
        this.p1y = p1y;
    }

    public void setP2(double p2x, double p2y) {
        this.p2x = p2x;
        this.p2y = p2y;
    }
}
