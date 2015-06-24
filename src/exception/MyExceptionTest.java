package exception;

/**
 *
 * @author pzhao
 */
public class MyExceptionTest {

    public void print() throws MyException {
        try {
            throw new MyException("I threw my own exception");
        } catch (MyException me) {
            //do something to handle the exception
        } finally {
            //Can't call System.exit(0)
        }
    }
}