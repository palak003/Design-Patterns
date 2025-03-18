package AdapterPattern;

public class AdapterCharger {

    public static void main(String[] args){
        OldCharger oldCharger=new OldCharger();
        oldCharger.oldMethod();

        Adapter adapterCharger=new Adapter(oldCharger);
        adapterCharger.newMethod(); //we are still using its old functionality through a new class

    }
}
