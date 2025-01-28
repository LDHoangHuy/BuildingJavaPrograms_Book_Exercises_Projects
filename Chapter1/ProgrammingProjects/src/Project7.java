public class Project7 {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
    }

    public static void verse1() {
        System.out.println("I once wrote a program that wouldn't compile");
        partA();
    }

    public static void verse2() {
        System.out.println("My program did nothing");
        System.out.println("So I started typing.");
        partB();
    }

    public static void verse3() {
        System.out.println("\"Parse error,\" cried the compiler");
        System.out.println("Luckily I'm such a code baller.");
        partC();
    }

    public static void verse4() {
        System.out.println("Now the compiler wanted an identifier");
        System.out.println("And I thought the situation was getting dire.");
        partD();
    }

    public static void verse5() {
        System.out.println("Java complained it expected an enum");
        System.out.println("Boy, these computers really are dumb!");
        partE();
    }

    public static void partE() {
        System.out.println("I added a public class and called it Scum,");
        partD();
    }

    public static void partD() {
        System.out.println("I added a main method with its String[] args,");
        partC();
    }

    public static void partC() {
        System.out.println("I added a backslash to escape the quotes,");
        partB();
    }

    public static void partB() {
        System.out.println("I added System.out.println(\"I <3 coding\"),");
        partA();
    }

    public static void partA() {
        System.out.println("I don't know why it wouldn't compile,");
        System.out.println("My TA just smiled.");
        System.out.println();
    }
}