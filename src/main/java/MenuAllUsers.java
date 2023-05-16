public class MenuAllUsers {
    public static void showAllUsers() {
        System.out.println("------Список пользователей------");
        DataStorage.showAllUsers();
        MenuMain.showMenu();

    }
}
