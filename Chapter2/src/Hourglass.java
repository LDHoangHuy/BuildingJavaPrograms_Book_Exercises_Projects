public class Hourglass {
    public static final int HEIGHT = 8;
    public static void main(String[] args) throws Exception {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= (HEIGHT - 2); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void drawTop() {
        for (int line = 1, numOfLines = ((HEIGHT - 2) / 2); line <= numOfLines; line++) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 1; i <= 2 * (numOfLines - line); i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void drawBottom() {
        for (int line = 1, numOfLines = ((HEIGHT - 2) / 2); line <= numOfLines; line++) {
            System.out.print("|");
            for (int i = 1; i <= (numOfLines - line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (numOfLines - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
