package prac5;

public class UsualSingleton {
    private static final UsualSingleton instance = new UsualSingleton();

    private UsualSingleton() {}

    public static UsualSingleton getInstance() {
        return instance;
    }
}

