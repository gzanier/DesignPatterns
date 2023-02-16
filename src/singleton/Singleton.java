package singleton;

import java.time.LocalTime;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton newInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public  void log(String log){
        System.out.println(log);
    }
    public void logINFO (String log){
        System.out.printf("[INFO] - %s - %s \n", LocalTime.now(), log);
    }

}
