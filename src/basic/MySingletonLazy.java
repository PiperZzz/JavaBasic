package basic;

/**
 *
 * @author pzhao
 */
public class MySingletonLazy {

    private static volatile MySingletonLazy mySingleton;

    private MySingletonLazy() {
    }

    @SuppressWarnings("DoubleCheckedLocking")
    public static MySingletonLazy getInstance() {
        if (mySingleton == null) {
            synchronized (MySingletonLazy.class) {
                if (mySingleton == null) {
                    mySingleton = new MySingletonLazy();
                }
            }
        }
        return mySingleton;
    }
}

//This method uses double-checked locking, which should not be used prior to J2SE 5.0, as it is vulnerable to subtle bugs. 
//The problem is that an out-of-order write may allow the instance reference to be returned before the Singleton constructor is executed.

//when object is being created but not completed, whether the object's reference is null depends on OS
//therefore, this code may cause problem when OS return a concrete reference of object when creating object. 
//Since object's reference is available, other thread may try to access some fields of the this object, however those field may not be created yet.
