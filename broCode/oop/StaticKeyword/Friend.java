public class Friend {
    String name;
    static int numberofFriend;
    // int numberofFriend;

    Friend(String name) {
        this.name = name;
        numberofFriend ++;
    }

    static void displayFriend() {
        System.out.println("You have total "+numberofFriend+" friend");
    }
}
