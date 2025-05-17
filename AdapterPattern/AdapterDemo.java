package AdapterPattern;

public class AdapterDemo {

    public static void main(String[] args){
        OldCharger oldCharger=new OldCharger();
        Adapter adapter=new Adapter(oldCharger);
        adapter.chargingNewWay();
    }
}
