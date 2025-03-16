package FactoryPattern;

public class Test {

    public static void main(String[] args){
        Pizza pizza1=PizzaFactory.getPizza("Cheese Pizza");
        pizza1.prepare();

        Pizza pizza2=PizzaFactory.getPizza("Veggies Pizza");
        pizza2.prepare();
    }
}
