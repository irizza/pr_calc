/**
 * Created by root on 30.06.2016.
 */
public class Singleton {
    private String str = "";
    private static Singleton instance;



    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
