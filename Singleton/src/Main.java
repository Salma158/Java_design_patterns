public class Main {
    public static void main(String[] args) {

        // to check that getInstance() returns the same instance every time we invoke it
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1 == eagerSingleton2);

        LazySingletonUsingDCL lazySingletonUsingDCL1 = LazySingletonUsingDCL.getInstance();
        LazySingletonUsingDCL lazySingletonUsingDCL2 = LazySingletonUsingDCL.getInstance();

        System.out.println(lazySingletonUsingDCL1 == lazySingletonUsingDCL2);

    }
}