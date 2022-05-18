public class HomeWork {
    public static void main(String[] args) {
        User userNew = new User();
        User user = new User(20, "Иванов", "Иван", 'm');
        System.out.println(user.toString());
        System.out.println(userNew.getInfo());
    }
}