public class Project7 {
    public static final int SIZE = 4;
    public static void main(String[] args) {
        drawColumnThin();
        drawCone();
        drawV();
        drawColumnThin();
        drawColumnThick();
        drawCone();
    }

    public static void drawColumnThin() {
        for (int line = 1; line <= SIZE; line++) {
            for (int i = 1; i <= SIZE * 3; i++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void drawColumnThick() {
        for (int line = 1; line <= SIZE + 12; line++) {
            for (int i = 1; i <= SIZE * 3 - 3; i++) {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }

    public static void drawCone() {
        for (int line = 1; line <= SIZE; line++) {
            for (int i = 1; i <= 3 * SIZE - 3 * line; i++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int i = 1; i <= 3 * line - 3; i++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int i = 1; i <= 3 * line - 3; i++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }
        System.out.print("|");
        for (int i = 1; i <= 6 * SIZE; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void drawV() {
        for (int line = 1; line <= SIZE; line++) {
            for (int i = 1; i <= 2 * line - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int i = 1; i <= 1 + 3 * SIZE - 2 * line; i++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }
}
