//
//public class SingletonThreadSafe {
//  private static Singleton _instance;
//
//    public static Singleton getInstanceDC(){
//        if(_instance == null) {
//            synchronized (Singleton.class) {
//                if (_instance == null) {
//                    _instance = new Singleton();
//                }
//            }
//        }
//        return _instance;
//    }
//
//}
