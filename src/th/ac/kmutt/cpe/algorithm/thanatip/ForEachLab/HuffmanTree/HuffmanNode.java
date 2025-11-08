package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.HuffmanTree;

public class HuffmanNode implements Comparable<HuffmanNode> {

    public String alph;
    public double freq;
    HuffmanNode leftChild;
    HuffmanNode rightChild;

    public HuffmanNode(String alph, double freq) {
        this.alph = alph;
        this.freq = freq;
    }

    public String getAlph() {
        return this.alph;
    }

    public double getFreq() {
        return this.freq;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return Double.compare(this.freq, other.freq);
    }

    @Override
    public String toString() {
        if (this.alph == null) {
            return "(Node: " + this.freq + ")";
        }
        return "('" + this.alph + "': " + this.freq + ")";
    }

}
