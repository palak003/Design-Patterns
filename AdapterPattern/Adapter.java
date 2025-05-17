package AdapterPattern;

public class Adapter implements NewCharger{

    private final OldCharger oldCharger;

    public Adapter(OldCharger oldCharger){
        this.oldCharger=oldCharger;
    }

    @Override
    public void chargingNewWay(){
        oldCharger.chargingOldWay();
    }
}
