import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    static List<User> userList = new ArrayList<>();
    static List<String> usersLoginList = new ArrayList<>();
    static List<String> usersPasswordList = new ArrayList<>();

    public static void addUser(User user) {
        userList.add(user);
    }

    public static void showAllUsers() {
        userList.forEach(System.out::println);
    }

    public static void putAllUsersLoginToList() {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            String userLogin = user.getUserLogin();
            usersLoginList.add(userLogin);
        }
    }

    public static void putAllUsersPasswordToList() {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            String userPassword = user.getUserPassword();
            usersPasswordList.add(userPassword);
        }
    }
}
