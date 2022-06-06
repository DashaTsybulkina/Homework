package authorization;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        checkAuthorization("wndejcbf", "jdj_12rnc", "jdj_12rnc");
        checkAuthorization("wndejcbf", "jdj_12rnc", "jgj_12rnc");
    }

    public static void checkAuthorization(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password);
            checkConfirmPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException wrongLoginException) {
            System.out.println(wrongLoginException.getMessage());
        }
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (login.matches("\\w{1,20}")) {
            System.out.println("Ваш логин принят!");
        } else {
            throw new WrongLoginException("Логин не подходит");
        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        if (password.matches("\\w{1,20}")) {
            System.out.println("Ваш пароль принят!");
        } else {
            throw new WrongPasswordException("Пароль неверный");
        }
    }

    private static void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (Objects.equals(password, confirmPassword)) {
            System.out.println("Регистрация прошла успешно!");
        } else {
            throw new WrongPasswordException();
        }
    }
}
