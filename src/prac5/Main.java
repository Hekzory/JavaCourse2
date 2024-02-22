package prac5;

public class Main {
    public static void main(String[] args) {
        UsualSingleton usualInstance = UsualSingleton.getInstance();
        System.out.println("Usual Initialization instance: " + usualInstance);

        LazySingleton lazyInstance = LazySingleton.getInstance();
        System.out.println("Lazy Initialization instance: " + lazyInstance);

        EnumSingleton enumInstance = EnumSingleton.getInstance();
        System.out.println("Double Checked Locking instance: " + enumInstance);

        System.out.println("Verifying Singleton property...");
        System.out.println("Usual Initialization instance is the same: " + (usualInstance == UsualSingleton.getInstance()));
        System.out.println("Lazy Initialization instance is the same: " + (lazyInstance == LazySingleton.getInstance()));
        System.out.println("Enum instance is the same: " + (enumInstance == EnumSingleton.getInstance()));
    }
}
