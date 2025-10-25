package th.ac.kmutt.cpe.algorithm.thanatip;

import java.io.*;
import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.BinPacking.*;
import th.ac.kmutt.cpe.algorithm.thanatip.CheckTime.*;

public class Lab7_StrategyIII {

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
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/BinPacking/test1.csv";
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

            System.out.print("Input the box width: ");
            double widthBox = sc.nextDouble();
            System.out.print("Input the box length: ");
            double lengthBox = sc.nextDouble();

            FF packing1 = new FF(widthBox, lengthBox);
            FFD packing2 = new FFD(widthBox, lengthBox);
            FFD_R packing3 = new FFD_R(widthBox, lengthBox);

            // Warm-Up
            FF warmUp1 = new FF(widthBox, lengthBox);
            FFD warmUp2 = new FFD(widthBox, lengthBox);
            FFD_R warmUp3 = new FFD_R(widthBox, lengthBox);

            System.out.print("Warming up..");
            for (int i = 0; i < 100; i++) {
                ArrayList<BoxSize> warmUpList1 = new ArrayList<>(boxList);
                ArrayList<BoxSize> warmUpList2 = new ArrayList<>(boxList);
                ArrayList<BoxSize> warmUpList3 = new ArrayList<>(boxList);
                warmUp1.packBoxes(warmUpList1);
                warmUp2.packBoxes(warmUpList2);
                warmUp3.packBoxes(warmUpList3);
                System.out.print(".");
            }
            System.out.println("\nWarm-up complete.");
            // End Warm-Up

            ArrayList<BoxSize> boxListFF = new ArrayList<>(boxList);
            ArrayList<BoxSize> boxListFFD = new ArrayList<>(boxList);
            ArrayList<BoxSize> boxListFFDR = new ArrayList<>(boxList);

            // CheckTime for each Algorithm
            CheckTime timer1 = new CheckTime();
            CheckTime timer2 = new CheckTime();
            CheckTime timer3 = new CheckTime();

            timer1.start();
            packing1.packBoxes(boxListFF);
            timer1.stop();

            timer2.start();
            packing2.packBoxes(boxListFFD);
            timer2.stop();

            timer3.start();
            packing3.packBoxes(boxListFFDR);
            timer3.stop();

            // Summary Table each Algorithm
            packing1.getSeparateList();
            packing2.getSeparateList();
            packing3.getSeparateList();

            // Summary Table
            System.out.println("=======================================================");
            System.out.println(ANSI_GREEN + "RESULT SUMMARY" + ANSI_RESET);
            System.out.println("=======================================================");
            System.out.printf("%-9s | %-6s | %-9s | %-10s | %-12s%n", "Algorithm", "Packed", "NotPacked", "RemainArea", "Time(ms)");
            System.out.println("-------------------------------------------------------");
            System.out.printf(ANSI_YELLOW + "%-9s" + ANSI_RESET + " | %-6d | %-9d | %-10.2f | %-12.2f%n",
                    "FF", packing1.getPacked(), packing1.getNotPacked(), packing1.getLastRemainArea(), timer1.getMilliDuration());
            System.out.printf(ANSI_PURPLE + "%-9s" + ANSI_RESET + " | %-6d | %-9d | %-10.2f | %-12.2f%n",
                    "FFD", packing2.getPacked(), packing2.getNotPacked(), packing2.getLastRemainArea(), timer2.getMilliDuration());
            System.out.printf(ANSI_CYAN + "%-9s" + ANSI_RESET + " | %-6d | %-9d | %-10.2f | %-12.2f%n",
                    "FFD-R", packing3.getPacked(), packing3.getNotPacked(), packing3.getLastRemainArea(), timer3.getMilliDuration());
            System.out.println("-------------------------------------------------------");

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
