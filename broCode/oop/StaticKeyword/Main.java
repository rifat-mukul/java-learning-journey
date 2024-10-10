public class Main {

    public static void main(String[] args) {
        Friend friend1 = new Friend("Arik");
        Friend friend2 = new Friend("Stev");
        
        System.out.println(Friend.numberofFriend); //this is access variable in a static way
        //if we remove static the we cannot access without object name
        // System.out.println(friend1.numberofFriend);
        // System.out.println(friend2.numberofFriend);
        System.out.println(friend1.name);
        System.out.println(friend2.name);

        Friend.displayFriend(); //call static method
    }
}