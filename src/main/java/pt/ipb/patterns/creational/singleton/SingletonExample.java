package pt.ipb.patterns.creational.singleton;

/* thread-safe */
class Singleton {
    // Private constructor prevents instantiation from other classes
    private Singleton() {
        System.out.println("Singleton.Singleton");
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * LazyHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to LazyHolder.INSTANCE, not before.
     */
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("start");
        Singleton.getInstance();
        System.out.println("end");
    }
}
