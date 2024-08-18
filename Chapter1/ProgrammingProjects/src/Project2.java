public class Project2 {
    public static void main(String[] args) {
        letterToParents();
        letterToFriend();
        letterToSister();
    }

    public static void letterToParents() {
        System.out.println("Dear mom & dad,");
        aboutClasses();
        aboutFriends();
        askForMoney();
        drawSeperatingLine();
    }

    public static void letterToFriend() {
        System.out.println("Dear Alex,");
        aboutPets();
        aboutClasses();
        aboutHobbies();
        drawSeperatingLine();
    }

    public static void letterToSister() {
        System.out.println("Hi -.- !");
        aboutHobbies();
        aboutFriends();
        askForMoney();
        drawSeperatingLine();
    }

    public static void aboutClasses() {
        System.out.println("Computer science is my favorite subject now.");
        System.out.println("It does not only open to me a new world of technology,");
        System.out.println("but also helps me know how to solve problems properly.");
        System.out.println();
    }

    public static void aboutFriends() {
        System.out.println("I have a friend, Alex."); 
        System.out.println("He's a really smart guy from New York.");
        System.out.println("He has helped me a lot with my homework and stuff.");
        System.out.println();
    }

    public static void aboutHobbies() {
        System.out.println("Whenever I am stressed struggling with my codes,");
        System.out.println("then I will take a break, open Minecraft,");
        System.out.println("and start building something.");
        System.out.println();
    }

    public static void aboutPets() {
        System.out.println("I love dogs and cats, I can pet them whenever I want.");
        System.out.println("They're cute.");
        System.out.println();
    }

    public static void askForMoney() {
        System.out.println("I know this is quite hard to say and to respond,");
        System.out.println("but I'm in a tough situation that I don't have enough money to afford a course online");
        System.out.println("which I really want to take because it will help me a lot for my future career.");
        System.out.println("Just $300. So, pleassssse~~~~");
        System.out.println();
    }

    public static void drawSeperatingLine() {
        System.out.println("==========================================================================================");
    }
}