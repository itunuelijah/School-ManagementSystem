package exceptions;

public class SchoolNotFoundException extends Throwable {
//    delete the method formed by intelligent and right click, then go to generate ,then click override method.
    public SchoolNotFoundException() {
        super();
    }

    public SchoolNotFoundException(String message) {
        super(message);
    }

    public SchoolNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchoolNotFoundException(Throwable cause) {
        super(cause);
    }
}
