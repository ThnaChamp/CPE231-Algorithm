package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.Shapes;

abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
}
