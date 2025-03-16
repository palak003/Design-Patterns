package SingletonPattern;

public class LazyLoading {

    private static LazyLoading instance=null;

    private LazyLoading(){

    }

    public static LazyLoading getInstance(){
        if(instance==null){
            instance=new LazyLoading();
        }
        return instance;
    }

}

class Test1{
    public static void main(String[] args){
        LazyLoading l1=LazyLoading.getInstance();
        LazyLoading l2=LazyLoading.getInstance();

        System.out.println(l1==l2);
    }
}
