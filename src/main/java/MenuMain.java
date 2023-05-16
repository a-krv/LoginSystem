import java.util.Scanner;

public class MenuMain {
    public static void showMenu() {
        System.out.println("-------Основное меню------------");
        System.out.println("Выберите один из вариантов:");
        System.out.println("1. Регистрация пользователя");
        System.out.println("2. Отобразить всех пользователей");
        System.out.println("3. Выход");
        System.out.print("Ввод: ");

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        if (value == 1) {
            MenuRegistration.startRegistration();
        } else if (value == 2) {
            MenuAllUsers.showAllUsers();
        } else if (value == 3) {
            System.exit(0);
        }
    }
}
