package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.BinPacking;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Sorting.SelectionSort;

public class FFD_R {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ฺBLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private int packed = 0;
    private int notPacked = 0;
    private double area;
    private boolean checkFirst = true;
    private boolean checkRotate = false;

    private double widthBox;
    private double lengthBox;
    ArrayList<PackingType> packedList = new ArrayList<>();

    public FFD_R(double widthBox, double lengthBox) {
        this.widthBox = widthBox;
        this.lengthBox = lengthBox;
        this.area = widthBox * lengthBox;
    }

    public void packBoxes(ArrayList<BoxSize> boxList) {
        SelectionSort<BoxSize> sorter = new SelectionSort<>();
        sorter.sort(boxList, -1, -1);
        packBoxes(boxList, widthBox, lengthBox, 0, 0);
    }

    private void packBoxes(ArrayList<BoxSize> boxList, double remainWidth, double remainLength, double previousBoxWidth, double previousBoxLength) {
        if (boxList.isEmpty()) {
            return;
        }


        BoxSize box = boxList.get(0);
        ArrayList<BoxSize> nextList = new ArrayList<>(boxList.subList(1, boxList.size()));
        if ((box.getWidth() <= remainWidth && box.getLength() <= remainLength)) {
            packed++;
            if (checkFirst) {
                packedList.add(new PackingType(box, "First"));
                checkFirst = false;
            } else if (!checkFirst && !checkRotate) {
                packedList.add(new PackingType(box, "Right"));
            } else {
                packedList.add(new PackingType(box, "Down"));
                checkRotate = false;
            }
            area -= box.getArea();
            packBoxes(nextList, remainWidth - box.getWidth(), remainLength, box.getWidth(), box.getLength());

        } else if ((box.getWidth() <= remainLength && box.getLength() <= remainWidth)) { //Condition for Rotation
            packed++;
            packedList.add(new PackingType(box, "Rotate"));
            checkRotate = true;
            area -= box.getArea();
            packBoxes(nextList, previousBoxWidth, (remainLength - previousBoxLength), box.getWidth(), box.getLength());

        } else if (box.getWidth() <= widthBox && box.getLength() <= (remainLength - previousBoxLength)) {
            packed++;
            packedList.add(new PackingType(box, "Down"));
            area -= box.getArea();
            packBoxes(nextList, previousBoxWidth - box.getWidth(), (remainLength - previousBoxLength), previousBoxWidth, box.getLength());

        } else {
            notPacked++;
            packedList.add(new PackingType(box, "NotPacked"));
            packBoxes(nextList, remainWidth, remainLength, previousBoxWidth, previousBoxLength);
        }
    }

    public int getPacked() {
        return packed;
    }

    public int getNotPacked() {
        return notPacked;
    }

    public void getSeparateList() {
        int no = 1;
        System.out.println("=======================================================");
        System.out.println(ANSI_CYAN + "First-Fit-Decreasing-Rotate" + ANSI_RESET);
        System.out.println("=======================================================");
        System.out.printf("%-4s | %-8s | %-8s | %-8s | %-12s%n", "No.", "Width", "Length", "Area", "PackingType");
        System.out.println("-------------------------------------------------------");
        for (PackingType pt : packedList) {
            String type = pt.getType();
            String color;
            if (type.equals("First")) {
                color = ANSI_GREEN;
            } else if (type.equals("Right")) {
                color = ANSI_PURPLE;
            } else if (type.equals("Down")) {
                color = ANSI_YELLOW;
            } else if (type.equals("Rotate")) {
                color = ANSI_ฺBLUE;
            } else {
                color = ANSI_RED;
            }
            System.out.printf("%-4d | %-8.2f | %-8.2f | %-8.2f | ", no++, pt.getWidth(), pt.getLength(), pt.getArea(), type);
            System.out.printf(color + "%-12s" + ANSI_RESET + "%n", type);
        }
        System.out.println("-------------------------------------------------------\n");
    }

    public double getLastRemainArea() {
        return area;
    }
}
