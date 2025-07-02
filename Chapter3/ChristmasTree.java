package Chapter3;

public class ChristmasTree {
    public static void main(String[] args) {
        /* segment, height
         * for (int seg = 0; seg < segments; seg++)
         *      # in each seg
         *      for (int line = 0; line < height; line++)
         *          # in each line
         *          #   spaces
         *          #       space: height + seg - 2 #1st line
         *          #       space phu thuoc vao seg va line, sau moi seg - 1, sau moi line - 1
         *          printElement(' ', (height + segments - 2) - seg - line)
         *          #   stars: phu thuoc vao seg va line, sau moi seg + 2, sau moi line + 2
         *          printElement('*', 2 * seg + 2 * line + 1)
         *          println()
         * 
         * # tree foot
         * for (int line = 0; line < 2; line++)
         *      printElement(' ', height + segments - 2)
         *      printElement('*', 1)
         *      println()
         * printElement('*', 7)
         */
        printTree(2, 5);
    }

    public static void printTree(int segments, int height) {
        printBody(segments, height);
        printFoot(segments, height);
    }

    public static void printBody(int segments, int height) {
        for (int seg = 0; seg < segments; seg++) {
            for (int line = 0; line < height; line++) {
                printElement(' ', (height + segments - 2) - seg - line);
                printElement('*', 2 * seg + 2 * line + 1);
                System.out.println();
            }
        }
    }

    public static void printFoot(int segments, int height) {
        for (int line = 0; line < 2; line++) {
            printElement(' ', height + segments - 2);
            printElement('*', 1);
            System.out.println();
        }
        printElement(' ', height + segments - 5);
        printElement('*', 7);
    }

    public static void printElement(char element, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(element);
        }
    }
}

