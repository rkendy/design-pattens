package src.singleton;

/**
 * Singleton
 */
public class Singleton {
    // If initialized here (which is thread-safe), the synchronized
    // block is not necessary.
    // ex: private static final Singleton uniqueIntence = new Singleton();
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // "double-checked locking" pattern. Works since 'uniqueIntance' is volatile:
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}