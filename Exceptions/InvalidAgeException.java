public class InvalidAgeException extends Exception {
    // Exception implements Serializable, so give the class a fixed version id
    private static final long serialVersionUID = 1L;


    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
