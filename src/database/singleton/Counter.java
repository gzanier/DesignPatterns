package database.singleton;

public class Counter {

    public static Counter  instance;
    private int counter;

    private Counter(){
        this.counter = 1;
    }
    public  static  Counter getInstance(){
        if(instance == null){
            instance = new Counter();
        }
        return instance;
    }

    public int getCounter(){
        return counter++;
    }
}
