package Chapter3;

import java.util.Scanner;
import java.lang.Math;

public class Prj4_triangle {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Fill in the lengths of the sides of a triangle to calculate its three angles");
        System.out.print("Length of 1st side: ");
        float a = prompt.nextFloat();
        System.out.print("Length of 2nd side: ");
        float b = prompt.nextFloat();
        System.out.print("Length of 3rd side: ");
        float c = prompt.nextFloat();
        prompt.close();

        if (!checkValidTriangle(a, b, c)) {
            System.out.println("Invalid triangle");
            return;
        }

        double radA = Math.acos((b*b + c*c - a*a) / (2*b*c));
        double degA = Math.toDegrees(radA);
        double radB = Math.acos((a*a + c*c - b*b) / (2*a*c));
        double degB = Math.toDegrees(radB);
        double radC = Math.acos((a*a + b*b - c*c) / (2*a*b));
        double degC = Math.toDegrees(radC);

        System.out.println("First angle: " + degA);
        System.out.println("Second angle: " + degB);
        System.out.println("Third angle: " + degC);
    }

    public static boolean checkValidTriangle(float a, float b, float c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }
}
