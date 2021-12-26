package creational.singleton;

public class SingletonPattern {

    /*
    *   C1: Eager
    * */
//    private static final SingletonPattern INSTANCE = new SingletonPattern();
//    private SingletonPattern() {
//    }
//    public static SingletonPattern getInstance(){
//        return INSTANCE;
//    }

    /*
    *   C2: Static block
    * */
//    private static final SingletonPattern INSTANCE;
//    private SingletonPattern() {
//    }
//    static {
//        try {
//            INSTANCE = new SingletonPattern();
//        }
//        catch (Exception e) {
//            throw new RuntimeException("Message...");
//        }
//    }
//    public SingletonPattern getInstance() {
//        return INSTANCE;
//    }

    /*
    *   C3: Lazy
    * */
//    private static SingletonPattern INSTANCE;
//    private SingletonPattern() {
//    }
//    public static SingletonPattern getInstance() {
//        if(INSTANCE==null) {
//            return new SingletonPattern();
//        }
//        return INSTANCE;
//    }

    /*
     *   C4: Multi Thread
     * */
//    private static SingletonPattern INSTANCE;
//    private SingletonPattern() {
//    }
//    public static synchronized SingletonPattern getInstance() {
//        if(INSTANCE==null) {
//            return new SingletonPattern();
//        }
//        return INSTANCE;
//    }

    /*
     *   C5: Double check
     * */
//    private static SingletonPattern INSTANCE;
//    private SingletonPattern() {
//    }
//    public static synchronized SingletonPattern getInstance() {
//        if(INSTANCE==null) {
//            synchronized (SingletonPattern.class){
//                if(INSTANCE==null){
//                    return new SingletonPattern();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    /*
    *   C6: Bill pugh
    * */
    private SingletonPattern(){
    }
    public static SingletonPattern getInstance() {
        return SingletonHelper.INSTANCE;
    }
    private static class SingletonHelper {
        private static final SingletonPattern INSTANCE = new SingletonPattern();
    }
}
