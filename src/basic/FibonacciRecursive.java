package basic;

/**
 *
 * @author PiperZzz
 */
public class FibonacciRecursive {

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
