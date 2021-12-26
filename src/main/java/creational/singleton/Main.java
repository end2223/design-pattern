package creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();
        System.out.println(s1.hashCode());
        System.out.println("=====================");
        System.out.println(s2.hashCode());
    }
}
