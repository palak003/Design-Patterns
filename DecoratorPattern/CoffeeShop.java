package DecoratorPattern;

// Demo / Client code
public class CoffeeShop {
    public static void main(String[] args) {
        // Start with a plain coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.description() + " $" + myCoffee.cost());
        // → Simple Coffee $5.0

        // Add sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.description() + " $" + myCoffee.cost());
        // → Simple Coffee, Sugar $5.5

        // Then add milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.description() + " $" + myCoffee.cost());
        // → Simple Coffee, Sugar, Milk $7.0
    }
}
