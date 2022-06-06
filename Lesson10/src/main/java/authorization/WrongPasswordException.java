package authorization;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Пароли несовпадают");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
