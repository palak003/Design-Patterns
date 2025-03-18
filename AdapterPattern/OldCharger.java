package AdapterPattern;

public class OldCharger {

    public void oldMethod(){
        System.out.println("Charging with old charger");
    }
}

interface NewCharger{
    void newMethod();
}
