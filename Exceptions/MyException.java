public class MyException extends Exception {
    // Exception implements Serializable, so give the class a fixed version id
    private static final long serialVersionUID = 1L;

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
