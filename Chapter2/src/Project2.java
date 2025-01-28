public class Project2 {
    public static void main(String[] args) {
        drawLine();
        for (int i = 1; i <= 2; i++) {
            drawCone();
        }
        drawLine();
        for (int i = 1; i <= 2; i++) {
            drawV();
        }
        drawLine();
    }

    public static void drawLine() {
        System.out.println("+------+");
    }

    public static void drawCone() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int i = 1; i <= (2 * line - 2); i++) {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void drawV() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int i = 1; i <= (6 - 2 * line); i++) {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
