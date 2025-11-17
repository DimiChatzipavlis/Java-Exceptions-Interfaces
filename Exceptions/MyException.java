public class MyException extends Exception {
    // default constructor
    public MyException() {
        super();
    }

    // message constructor
    public MyException(String message) {
        super(message);
    }

    // message + cause constructor
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    // cause constructor
    public MyException(Throwable cause) {
        super(cause);
    }
}
