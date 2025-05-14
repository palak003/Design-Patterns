package DecoratorPattern;

// Concrete Component: a simple, plain coffee
public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;  // base price for plain coffee
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
