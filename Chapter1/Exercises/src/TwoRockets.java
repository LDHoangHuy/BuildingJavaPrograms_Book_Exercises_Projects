public class TwoRockets {
    public static void main(String[] args) {
        drawDoubleCone();
        drawDoubleBox();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        drawDoubleBox();
        drawDoubleCone();
    }

    public static void drawDoubleCone() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void drawDoubleBox() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}
