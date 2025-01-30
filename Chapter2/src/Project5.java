public class Project5 {
    public static final int HEIGHT = 7;
    public static void main(String[] args) {
        int numOfSpacesFront;
        int numOfSpacesBehind;

        for (int stairs = 1; stairs <= HEIGHT; stairs++) {
            numOfSpacesFront = 5 * HEIGHT + 1 - 5 * stairs;
            numOfSpacesBehind = 5 * stairs - 5;

            //Start of head
            for (int i = 1; i <= numOfSpacesFront; i++) {
                System.out.print(" ");
            }
            System.out.print(" o  ******");
            for (int i = 1; i <= numOfSpacesBehind; i++) {
                System.out.print(" ");
            }
            System.out.println("*"); 
            //End of head

            //Start of body
            for (int i = 1; i <= numOfSpacesFront; i++) {
                System.out.print(" ");
            }
            System.out.print("/|\\ *     ");
            for (int i = 1; i <= numOfSpacesBehind; i++) {
                System.out.print(" ");
            }
            System.out.println("*"); 
            //End of body

            //Start of legs
            for (int i = 1; i <= numOfSpacesFront; i++) {
                System.out.print(" ");
            }
            System.out.print("/ \\ *     ");
            for (int i = 1; i <= numOfSpacesBehind; i++) {
                System.out.print(" ");
            }
            System.out.println("*"); 
            //End of legs

            //Print the base line
            if (stairs == HEIGHT) {
                for (int i = 1; i <= 5 * HEIGHT + 6; i++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
        }   
    }
}