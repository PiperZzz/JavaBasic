package basic;

/**
 *
 * @author PiperZzz
 */
public class MySingletonEager {

    private static final MySingletonEager INSTANCE = new MySingletonEager();

    private MySingletonEager() {
    }

    public static MySingletonEager getInstance() {
        return INSTANCE;
    }
}

//If the program will always need an instance, or if the cost of creating the instance is not too large in terms of time/resources, 
//the programmer can switch to eager initialization, which always creates an instance:

//This method has a number of advantages:
//
//The static initializer is run when the class is initialized, after class loading but before the class is used by any thread.
//There is no need to synchronize the getInstance() method, meaning all threads will see the same instance and no (expensive) locking is required.
//The final keyword means that the instance cannot be redefined, ensuring that one (and only one) instance ever exists.