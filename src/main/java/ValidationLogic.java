import java.util.Scanner;

public class ValidationLogic {
    public static void validationLogin(String input) {
        if (DataStorage.usersLoginList.contains(input) == true) {
            System.out.println("Ошибка. Данный логин уже занят.");
            System.exit(0);
        }
    }

    public static void validationPassword(String input) {
        if (DataStorage.usersPasswordList.contains(input) == true) {
            System.out.println("Ошибка. Данный пароль уже существует.");
            System.exit(0);
        }
    }
}
