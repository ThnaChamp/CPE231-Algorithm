package th.ac.kmutt.cpe.algorithm.thanatip;

import java.io.*;
import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Fee.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Searching.ForLab5.*;

public class Lab5_StrategyI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Type: ");
        String type = sc.next();
        int zone = 1;

        String filePath = "";
        if (type.equals("Domestic")) {
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/Fee/EMS_Domestic.csv";
        } else if (type.equals("World")) {
            filePath = "src/th/ac/kmutt/cpe/algorithm/thanatip/Fee/EMS_World.csv";
            System.out.print("Input Zone: ");
            zone = sc.nextInt();
        } else {
            System.out.println("Type not supported.");
            return;
        }
        List<Range> routeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true; // Flag สำหรับข้ามบรรทัดแรก

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] values = line.split(",");

                if (values.length > zone + 1) {
                    double from = Double.parseDouble(values[0].trim());
                    double to = Double.parseDouble(values[1].trim());
                    String costStr = values[zone + 1].trim();
                    double cost;

                    if (costStr.isEmpty()) {
                        cost = -1;
                    } else {
                        cost = Double.parseDouble(costStr);
                    }

                    Range Range = new Range(from, to, cost);
                    routeList.add(Range);
                }
            }

            System.out.print("Input you Weight: ");
            double weight = sc.nextDouble();
            LinearSearchForLab5 solve = new LinearSearchForLab5();
            double cost = solve.findCostByWeight(routeList, weight);
            if (cost != -1) {
                System.out.println("Cost: " + cost + " Baht");
            } else {
                System.out.println("Not Found");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
