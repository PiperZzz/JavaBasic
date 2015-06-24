package exception;

/**
 *
 * @author pzhao
 */
public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String errorMessage) {
        super(errorMessage);
    }
}
