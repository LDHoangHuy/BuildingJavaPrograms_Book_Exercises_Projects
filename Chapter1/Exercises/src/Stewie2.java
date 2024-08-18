public class Stewie2 {
    public static void main(String[] args) {
        printForwardSlashLine();
        printTheTower();
    }

    public static void printForwardSlashLine() {
        System.out.println("//////////////////////");
    }

    public static void printTheTower() {
        printCoupleLines();
        printCoupleLines();
        printCoupleLines();
        printCoupleLines();
        printCoupleLines();
    }

    public static void printCoupleLines() {
        printTextLine();
        printBackslashLine();
    }

    public static void printTextLine() {
        System.out.println("|| Victory is mine! ||");
    }

    public static void printBackslashLine() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
