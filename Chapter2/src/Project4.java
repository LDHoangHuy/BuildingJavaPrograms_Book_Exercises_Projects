public class Project4 {
    public static final int SUBHEIGHT = 4;
    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawMid();
        drawBottom();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("|");
        int numOfQuoteMarks = 2 * (SUBHEIGHT + 1);
        for (int i = 1; i <= numOfQuoteMarks; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void drawTop() {
        for (int line = 1; line <= SUBHEIGHT; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int numOfColons = 2 * (SUBHEIGHT + 1 - line);
            for (int i = 1; i <= numOfColons; i++) {
                System.out.print(":");
            }
            System.out.println("/");
        }
    }

    public static void drawMid() {
        for (int i = 1; i <= SUBHEIGHT + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }

    public static void drawBottom() {
        for (int line = 1; line <= SUBHEIGHT; line++) {
            for (int i = 1; i <= SUBHEIGHT + 1 - line; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * line; i++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }
}
