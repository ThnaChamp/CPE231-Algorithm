package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.Shapes;

public class Circle extends Shape {

    private double r;
    private double px, py;

    public Circle(String color, double r, double px, double py) {
        super(color);
        this.r = r;
        this.px = px;
        this.py = py;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void getP() {
        System.out.printf("(%.2f,%.2f)", this.px, this.py);
    }

    public void setP(double px, double py) {
        this.px = px;
        this.py = py;
    }
}
