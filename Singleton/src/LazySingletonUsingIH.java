
// for lazy initialization of singleton object using initialization holder class
public class LazySingletonUsingIH {

    private LazySingletonUsingIH(){

    }
    // why inner class ?
    // because inner class is loaded when it is first referenced;
    private static class SingletonHolder{
        static LazySingletonUsingIH lazySingletonUsingIH = new LazySingletonUsingIH();
    }

    public static LazySingletonUsingIH getInstance(){
        return SingletonHolder.lazySingletonUsingIH;
    }
}
