public class Project6 {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        drawTop();
        drawBody();
        drawBottom();
    }

    public static void drawTop() {
        drawCone();
        drawLine();
    }

    public static void drawBottom() {
        drawLine();
        drawCone();
    }

    public static void drawCone() {
        for (int line = 1; line <= 2 * SIZE - 1; line++) {
            for (int i = 1; i <= 2 * SIZE - line; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int i = 1; i <= line - 1; i++) {
                System.out.print("\\");
            }
            System.out.println("\\");
        }
    }

    public static void drawBody() {
        drawBodyConeUp();
        drawBodyConeDown();
        drawLine();
        drawBodyConeDown();
        drawBodyConeUp();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 2 * SIZE; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void drawBodyConeUp() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int i = 1; i <= SIZE - line; i++) {
                System.out.print(".");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("/\\");
            }
            for (int i = 1; i <= 2 * SIZE - 2 * line; i++) {
                System.out.print(".");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("/\\");
            }
            for (int i = 1; i <= SIZE - line; i++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

    public static void drawBodyConeDown() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int i = 1; i <= SIZE - line; i++) {
                System.out.print(".");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("\\/");
            }
            for (int i = 1; i <= 2 * SIZE - 2 * line; i++) {
                System.out.print(".");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("\\/");
            }
            for (int i = 1; i <= SIZE - line; i++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
}
