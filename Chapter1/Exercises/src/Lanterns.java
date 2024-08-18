public class Lanterns {
    public static void main(String[] args) {
        drawCone();
        System.out.println();
        lanternA();
        System.out.println();
        lanternB();
        
    }

    public static void lanternA() {
        drawCone();
        drawLight();
        draw_13_Asterisks();
        drawCone();
    }

    public static void lanternB() {
        drawCone();
        draw_5_Asterisks();
        drawLight();
        drawLight();
        draw_5_Asterisks();
        draw_5_Asterisks();
    }

    public static void drawCone() {
        draw_5_Asterisks();
        draw_9_Asterisks();
        draw_13_Asterisks();
    }

    public static void drawLight() {
        System.out.println("* | | | | | *");
    }

    public static void draw_5_Asterisks() {
        System.out.println("    *****");
    }

    public static void draw_9_Asterisks() {
        System.out.println("  *********");
    }

    public static void draw_13_Asterisks() {
        System.out.println("*************");
    }
}