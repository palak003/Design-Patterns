package BridgePattern;

// Implementor
interface Pizza {
    void prepare();  // low‐level pizza preparation
}

// ConcreteImplementor #1
class MargheritaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza with tomato, mozzarella, and basil.");
    }
}

// ConcreteImplementor #2
class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza with tomato, mozzarella, and pepperoni.");
    }
}

// Abstraction
abstract class Restaurant {
    protected Pizza pizza;      // bridge to the Pizza implementor

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void serve();  // high‐level operation
}

// RefinedAbstraction #1
class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void serve() {
        System.out.print("Italian Restaurant: ");
        pizza.prepare();
        System.out.println("Serving in a fancy ceramic plate.\n");
    }
}

// RefinedAbstraction #2
class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void serve() {
        System.out.print("Fast‐Food Restaurant: ");
        pizza.prepare();
        System.out.println("Wrapping in branded cardboard box.\n");
    }
}

// Client / Demo
public class BridgeDemo {
    public static void main(String[] args) {
        // You can mix and match freely:
        Restaurant r1 = new ItalianRestaurant(new MargheritaPizza());
        Restaurant r2 = new ItalianRestaurant(new PepperoniPizza());
        Restaurant r3 = new FastFoodRestaurant(new MargheritaPizza());
        Restaurant r4 = new FastFoodRestaurant(new PepperoniPizza());

        r1.serve();
        r2.serve();
        r3.serve();
        r4.serve();
    }
}
