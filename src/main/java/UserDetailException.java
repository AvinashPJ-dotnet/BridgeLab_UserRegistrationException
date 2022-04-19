public class UserDetailException extends Exception {
    enum ExceptionTypes{
        ENTERED_NULL,
        ENTERED_EMPTY
    }
    static ExceptionTypes types;

    public UserDetailException(String message, ExceptionTypes types) {
        super(message);
        this.types = types;
    }



}
