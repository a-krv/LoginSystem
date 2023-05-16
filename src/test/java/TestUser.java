import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    void testGetUserName() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        Assertions.assertEquals("Алексей", newUser.getUserName());
    }

    @Test
    void testGetUserLastName() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        Assertions.assertEquals("Петров", newUser.getUserLastName());
    }

    @Test
    void testGetUserLogin() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        Assertions.assertEquals("Lol1234", newUser.getUserLogin());
    }

    @Test
    void testGetUserPassword() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        Assertions.assertEquals("333444888", newUser.getUserPassword());
    }

    @Test
    void testSetUserName() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        newUser.setUserName("Виктор");

        Assertions.assertEquals("Виктор", newUser.getUserName());
    }

    @Test
    void testSetUserLastName() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        newUser.setUserLastName("Иванов");

        Assertions.assertEquals("Иванов", newUser.getUserLastName());
    }

    @Test
    void testSetUserLogin() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        newUser.setUserLogin("Bob364");

        Assertions.assertEquals("Bob364", newUser.getUserLogin());
    }

    @Test
    void testSetUserPassword() {
        User newUser = new User("Алексей", "Петров", "Lol1234", "333444888");

        newUser.setUserPassword("123456789");

        Assertions.assertEquals("123456789", newUser.getUserPassword());
    }


}
