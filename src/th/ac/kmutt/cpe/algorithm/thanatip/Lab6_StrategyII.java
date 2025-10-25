package th.ac.kmutt.cpe.algorithm.thanatip;

import java.io.*;
import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.BinPacking.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Sorting.*;

public class Lab6_StrategyII {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ฺBLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input File: ");
        int file = sc.nextInt();

        String filePath = "";
        if (file == 1) {
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/BinPacking/boxSize1.csv";
        } else if (file == 2) {
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/BinPacking/boxSize2.csv";
        } else if (file == 3) {
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/BinPacking/boxSize3.csv";
        } else if (file == 4) {
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/BinPacking/test.csv";
        } else {
            System.out.println("file not supported.");
            return;
        }

        ArrayList<BoxSize> boxList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = false; // Flag สำหรับข้ามบรรทัดแรก

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] values = line.split(",");

                if (values.length == 2) {
                    double width = Double.parseDouble(values[0].trim());
                    double length = Double.parseDouble(values[1].trim());

                    BoxSize box = new BoxSize(width, length);
                    boxList.add(box);
                }
            }

            SelectionSort<BoxSize> sorter = new SelectionSort<>();

            sorter.sort(boxList, -1, -1);
            System.out.print("Input the box width: ");
            double widthBox = sc.nextDouble();
            System.out.print("Input the box length: ");
            double lengthBox = sc.nextDouble();
            FFD packing1 = new FFD(widthBox, lengthBox);

            packing1.packBoxes(boxList);
            packing1.getSeparateList();

            System.out.println("=====================================================");
            System.out.println(ANSI_GREEN + "RESULT SUMMARY" + ANSI_RESET);
            System.out.println("=====================================================");
            System.out.printf("%-12s | %-10s | %-10s | %-10s%n", "Algorithm", "Packed", "NotPacked", "RemainArea");
            System.out.println("-----------------------------------------------------");
            System.out.printf(ANSI_PURPLE + "%-12s" + ANSI_RESET + " | %-10d | %-10d | %-10.2f%n", "FFD", packing1.getPacked(), packing1.getNotPacked(), packing1.getLastRemainArea());
            System.out.println("-----------------------------------------------------");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
