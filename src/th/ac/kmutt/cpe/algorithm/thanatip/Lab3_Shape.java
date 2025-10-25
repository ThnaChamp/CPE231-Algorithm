//Thanatip Nitinantakul 67070501023
package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Shapes.*;

public class Lab3_Shape {

    public static void main(String[] args) {
        double Red = 0, Green = 0, Blue = 0, Black = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String shape = sc.next();
            switch (shape) {
                case "Circle":
                    double r = sc.nextDouble();
                    double px = sc.nextDouble();
                    double py = sc.nextDouble();
                    String color = sc.next();
                    Circle C = new Circle(color, r, px, py);
                    double red1 = 0;
                    double green1 = 0;
                    double blue1 = 0;
                    Black += C.perimeter();
                    switch (color) {
                        case "Red":
                            red1 = C.area();
                            Red += C.area();
                            break;
                        case "Green":
                            green1 = C.area();
                            Green += C.area();
                            break;
                        case "Blue":
                            blue1 = C.area();
                            Blue += C.area();
                            break;
                        default:
                            break;
                    }
                    System.out.printf("Circle used Red: %.2f unit^3, Green : %.2f unit^3, Blue : %.2f unit^3, Black : %.2f unit\n", red1, green1, blue1, C.perimeter());
                    break;
                case "Rectangle":
                    double p1x = sc.nextDouble();
                    double p1y = sc.nextDouble();
                    double p2x = sc.nextDouble();
                    double p2y = sc.nextDouble();
                    String color1 = sc.next();
                    Rectangle R = new Rectangle(color1, p1x, p1y, p2x, p2y);
                    double red2 = 0;
                    double green2 = 0;
                    double blue2 = 0;
                    Black += R.perimeter();
                    switch (color1) {
                        case "Red":
                            red2 = R.area();
                            Red += R.area();
                            break;
                        case "Green":
                            green2 = R.area();
                            Green += R.area();
                            break;
                        case "Blue":
                            blue2 = R.area();
                            Blue += R.area();
                            break;
                        default:
                            break;
                    }
                    System.out.printf("Rectangle used Red: %.2f unit^3, Green : %.2f unit^3, Blue : : %.2f unit^3, Black : %.2f unit\n", red2, green2, blue2, R.perimeter());
                    break;
                case "Triangle":
                    double p3x = sc.nextDouble();
                    double p3y = sc.nextDouble();
                    double p4x = sc.nextDouble();
                    double p4y = sc.nextDouble();
                    double p5x = sc.nextDouble();
                    double p5y = sc.nextDouble();
                    String color2 = sc.next();
                    Triangle T = new Triangle(color2, p3x, p3y, p4x, p4y, p5x, p5y);
                    double red3 = 0;
                    double green3 = 0;
                    double blue3 = 0;
                    Black += T.perimeter();
                    // System.out.println(T.area());
                    switch (color2) {
                        case "Red":
                            red3 = T.area();
                            Red += T.area();
                            break;
                        case "Green":
                            green3 = T.area();
                            Green += T.area();
                            break;
                        case "Blue":
                            blue3 = T.area();
                            Blue += T.area();
                            break;
                        default:
                            break;
                    }
                    System.out.printf("Triangle used Red: %.2f unit^3, Green : %.2f unit^3, Blue : %.2f unit^3, Black : %.2f unit\n", red3, green3, blue3, T.perimeter());
                    break;
                default:
                    System.out.print("Shape of yohoo");
            }

        }
        System.out.printf("All shape used Red: %.2f unit^3, Green : %.2f unit^3, Blue : %.2f unit^3, Black : %.2f unit\n", Red, Green, Blue, Black);
    }
}
