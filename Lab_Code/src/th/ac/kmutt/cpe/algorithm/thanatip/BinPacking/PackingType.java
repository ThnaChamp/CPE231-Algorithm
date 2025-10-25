package th.ac.kmutt.cpe.algorithm.thanatip.BinPacking;

public class PackingType {

    private BoxSize box;
    private String type;

    public PackingType(BoxSize box, String type) {
        this.box = box;
        this.type = type;
    }

    public double getWidth() {
        return box.getWidth();
    }

    public double getLength() {
        return box.getLength();
    }

    public double getArea() {
        return box.getWidth() * box.getLength();
    }

    public String getType() {
        return this.type;
    }

}
