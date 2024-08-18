public class Egg {
    public static void main(String[] args) {
        printEgg();
    }

    public static void printEgg() {
        printTopHalf();
        printMiddleLine();
        printBottomHalf();
    }

    public static void printTopHalf() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void printMiddleLine() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    public static void printBottomHalf() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}