public class LazySingletonUsingDCL {

    // double checking locking
    private LazySingletonUsingDCL(){
    }
    // volatile to force reading from the main memory not the cache,
    // so the real value is visible to all the threads
    private static volatile LazySingletonUsingDCL INSTANCE;

    // double-checking reduces the need for synchronization once the instance is initialized.
    public static  LazySingletonUsingDCL getInstance(){
        if(INSTANCE == null){ // First check (no locking)
            synchronized (LazySingletonUsingDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingletonUsingDCL();
                }
            }
        }
        return INSTANCE;
    }
}
