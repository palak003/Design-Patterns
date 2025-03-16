package FactoryPattern;

public class PizzaFactory {

    public static Pizza getPizza(String choice){
        if(choice=="Cheese Pizza")
            return new CheesePizza();
        else if(choice=="Veggies Pizza")
            return new VeggiesPizza();
        return null;
    }
}
