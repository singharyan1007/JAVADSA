package oops.staticExample.Singleton;

public class Basic {
    private Basic(){
        System.out.println("Inside Constructor");
    }
    private static Basic instance=null;
    public static Basic getInstance(){
        if(instance==null){
            instance = new Basic();
        }
        return instance;
    }

}
