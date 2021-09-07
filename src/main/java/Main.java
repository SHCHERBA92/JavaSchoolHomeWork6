public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();
        MessageMy messageMy = new MessageMy();
        friends.addFriends("kirill");
        friends.addFriends("Misha");
        System.out.println(friends);
        System.out.println(friends.getFrinds());

    }
}
