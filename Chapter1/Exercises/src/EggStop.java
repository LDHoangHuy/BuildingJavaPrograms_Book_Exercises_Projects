public class EggStop {
    public static void main(String[] args) {
        drawEgg();
        drawBottomHalfEgg();
        drawLine();
        drawEggStop();
        drawTopHalfEgg();
        drawLine();
    }

    public static void drawEgg() {
        drawTopHalfEgg();
        drawBottomHalfEgg();
    }

    public static void drawEggStop() {
        drawTopHalfEgg();
        System.out.println("|   STOP  |");
        drawBottomHalfEgg();
    }

    public static void drawTopHalfEgg() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void drawBottomHalfEgg() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void drawLine() {
        System.out.println("+---------+");
    }
}