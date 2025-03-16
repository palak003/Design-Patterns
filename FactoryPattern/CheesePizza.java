package FactoryPattern;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese pizza is ready");
    }

}
