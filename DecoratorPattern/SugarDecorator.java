package DecoratorPattern;

// Concrete Decorator 2: adds sugar
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;   // extra cost for sugar
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
