package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// 1. Flyweight interface
interface Shape {
    void draw(int x, int y, int radius);
}

// 2. ConcreteFlyweight: stores intrinsic state (color)
class Circle implements Shape {
    private final String color;  // intrinsic, shared

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing a " + color + " circle at (" 
            + x + ", " + y + ") with radius " + radius);
    }
}

// 3. FlyweightFactory: reuses Circle instances by color
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating new " + color + " circle");
        }
        return circle;
    }
}

// 4. Client / Demo
public class FlyweightDemo {
    private static final String[] COLORS = 
        { "Red", "Green", "Blue", "White", "Black" };
    private static final Random rand = new Random();

    private static String randomColor() {
        return COLORS[rand.nextInt(COLORS.length)];
    }
    private static int randomX() {
        return rand.nextInt(100);
    }
    private static int randomY() {
        return rand.nextInt(100);
    }
    private static int randomRadius() {
        return 5 + rand.nextInt(20);
    }

    public static void main(String[] args) {
        // Draw 20 circles; only 5 unique colors => only 5 Circle objects created
        for (int i = 0; i < 20; i++) {
            Shape circle = ShapeFactory.getCircle(randomColor());
            circle.draw(randomX(), randomY(), randomRadius());
        }
    }
}
