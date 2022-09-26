package Singleton;

public class Application {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("First call");
        Singleton anotherSingleton = Singleton.getInstance("Second call");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
