package AdapterPattern;

public class Adapter implements NewCharger{

    private OldCharger oldCharger;

    public Adapter(OldCharger oldCharger){
        this.oldCharger=oldCharger;
    }

    @Override
    public void newMethod() {
        oldCharger.oldMethod();
    }
}
