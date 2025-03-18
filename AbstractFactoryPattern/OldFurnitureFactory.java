package AbstractFactoryPattern;

public class OldFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Table createTable() {
        return new OldTable();
    }
}
