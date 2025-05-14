package DecoratorPattern;

// Concrete Decorator 1: adds milk
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;   // extra cost for milk
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}
