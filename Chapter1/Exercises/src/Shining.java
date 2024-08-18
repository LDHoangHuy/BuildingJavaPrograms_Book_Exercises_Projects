public class Shining {
    public static void main(String[] args) {
        messageX1000();
    }

    public static void messageX1000() {
        messageX200();
        messageX200();
        messageX200();
        messageX200();
        messageX200();
    }

    public static void messageX200() {
        messageX40();
        messageX40();
        messageX40();
        messageX40();
        messageX40();
    }

    public static void messageX40() {
        messageX8();
        messageX8();
        messageX8();
        messageX8();
        messageX8();
    }

    public static void messageX8() {
        messageX4();
        messageX4();
    }

    public static void messageX4() {
        messageX2();
        messageX2();
    }

    public static void messageX2() {
        message();
        message();
    }

    public static void message() {
        System.out.println("All work and no play makes Jack a dull boy.");
    }
}