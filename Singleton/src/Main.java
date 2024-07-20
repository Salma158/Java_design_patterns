public class Main {
    public static void main(String[] args) {

        // to check that getInstance() returns the same instance every time we invoke it
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1 == eagerSingleton2);
    }
}