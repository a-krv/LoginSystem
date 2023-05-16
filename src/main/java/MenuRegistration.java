import java.util.Scanner;

public class MenuRegistration {
    public static void startRegistration() {
        System.out.println("-------Меню регистрации---------");
        System.out.println("Введите имя:");
        Scanner scannerName = new Scanner(System.in);
        String userName = scannerName.nextLine();

        System.out.println("Введите фамилию:");
        Scanner scannerLastName = new Scanner(System.in);
        String userLastName = scannerLastName.nextLine();

        System.out.println("Введите логин:");
        Scanner scannerLogin = new Scanner(System.in);
        String userLogin = scannerLogin.nextLine();
        DataStorage.putAllUsersLoginToList();
        ValidationLogic.validationLogin(userLogin);

        System.out.println("Введите пароль:");
        Scanner scannerPassword = new Scanner(System.in);
        String userPassword = scannerPassword.nextLine();
        DataStorage.putAllUsersPasswordToList();
        ValidationLogic.validationPassword(userPassword);

        DataStorage.addUser(new User(userName,userLastName,userLogin,userPassword));

        MenuMain.showMenu();
    }

}
