public class Project3 {
    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
        drawBottom();
        drawTop();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 9; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void drawTop() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int i = 1; i <= (5 - line); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print("\\");
            }
            for (int i = 1; i <= (5 - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void drawBottom() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int i = 1; i <= line; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (4 - line); i++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int i = 1; i <= (4 - line); i++) {
                System.out.print("/");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
