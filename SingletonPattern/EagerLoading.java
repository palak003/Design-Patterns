package SingletonPattern;

public class EagerLoading {
    private static final EagerLoading eagerLoadingInstance = new EagerLoading();

    private EagerLoading(){

    }

    public static EagerLoading getInstance(){
        return eagerLoadingInstance;
    }

    public void showMessage(){
        System.out.println("Hello");
    }
}

 class Test{

    public static void main(String[] args){

        EagerLoading e1= EagerLoading.getInstance();
        EagerLoading e2=EagerLoading.getInstance();

        e1.showMessage();
        System.out.println(e1==e2);

    }
}
