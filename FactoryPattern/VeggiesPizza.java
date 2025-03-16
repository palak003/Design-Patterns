package FactoryPattern;

public class VeggiesPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Veggies pizza is ready");
    }
}
