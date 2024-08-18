public class StarFigures {
    public static void main(String[] args) {
        print15();
        System.out.println();
        print25();
        System.out.println();
        print18();
    }

    public static void print15() {
        print10();
        print5();
    }

    public static void print25() {
        print15();
        print10();
    }

    public static void print18() {
        print3();
        print15();
    }

    public static void print10() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void print5() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    public static void print3() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
