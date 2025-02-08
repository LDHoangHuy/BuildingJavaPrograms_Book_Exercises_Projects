public class Project8 {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        drawTopLine();
        drawBookCover();
        drawMidLine();
        drawTextblock();
        drawBottomLine();
    }

    public static void drawTopLine() {
        for (int i = 1; i <= SIZE + 1; i++) {
            System.out.print(" ");
        }
        drawLine();
        System.out.println();
    }

    public static void drawBookCover() {
        for (int line = 1; line <= SIZE; line++) {
            for (int i = 1; i <= SIZE + 1 - line; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= (3 * SIZE) - (3 * line); i++) {
                System.out.print(" ");
            }
            System.out.print("___/");
            for (int i = 1; i <= line - 1; i++) {
                System.out.print("__/");
            }
            for (int i = 1; i <= line - 1; i++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static void drawMidLine() {
        drawLine();
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("/");
        }
        System.out.println();
    }

    public static void drawTextblock() {
        for (int line = 1; line <= SIZE - 5; line++) {
            System.out.print("|");
            for (int i = 1; i <= SIZE - 6; i++) {
                System.out.print(" ");
            }
            System.out.print("Building Java Programs");
            for (int i = 1; i <= (2 * SIZE) - 16; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int i = 1; i <= SIZE + 2 - (2 * line); i++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static void drawBottomLine() {
        drawLine();
        System.out.println();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 3 * SIZE; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
