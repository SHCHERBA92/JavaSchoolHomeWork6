import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class FriendsTest {
    @Test
    public void friendsTest()
    {
        Friends friends = new Friends();
        friends.addFriends("Pashsa");
        friends.addFriends("Mashsa");
        friends.addFriends("Tashsa");
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("Pashsa","Mashsa","Tashsa"));

        Assertions.assertIterableEquals(strings,friends.getFrinds().values());
    }
}
