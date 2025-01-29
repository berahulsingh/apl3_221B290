// Step 1: Define behavior interfaces

// Behavior interface for flying
interface Flyable {
    void fly();
}

// Behavior interface for quacking
interface Quackable {
    void quack();
}

// Behavior interface for squeaking
interface Squeakable {
    void squeak();
}

// Step 2: Define the Duck interface that all ducks should implement
interface Duck {
    void swim();  // All ducks can swim
}

// Step 3: Define different Duck classes implementing behaviors

// RubberDuck class - Can't fly, squeaks, and swims
class RubberDuck implements Duck, Squeakable {
    @Override
    public void swim() {
        System.out.println("RubberDuck swims.");
    }
    
    @Override
    public void squeak() {
        System.out.println("RubberDuck squeaks.");
    }
}

// WoodenDuck class - Can't fly, mute, and swims
class WoodenDuck implements Duck {
    @Override
    public void swim() {
        System.out.println("WoodenDuck swims.");
    }
}

// RedHeadDuck class - Can fly, quack, and swim
class RedHeadDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("RedHeadDuck swims.");
    }
    
    @Override
    public void fly() {
        System.out.println("RedHeadDuck flies.");
    }
    
    @Override
    public void quack() {
        System.out.println("RedHeadDuck quacks.");
    }
}

// LakeDuck class - Can fly, quack, and swim
class LakeDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("LakeDuck swims.");
    }
    
    @Override
    public void fly() {
        System.out.println("LakeDuck flies.");
    }
    
    @Override
    public void quack() {
        System.out.println("LakeDuck quacks.");
    }
}

// Step 4: Main class to demonstrate duck behavior
public class DuckGame {
    public static void main(String[] args) {
        // Create instances of different types of ducks
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();
        
        // Demonstrating the behavior of each duck
        System.out.println("Rubber Duck behavior:");
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak(); // Cast to Squeakable
        
        System.out.println("\nWooden Duck behavior:");
        woodenDuck.swim();
        
        System.out.println("\nRedHead Duck behavior:");
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();  // Cast to Flyable
        ((Quackable) redHeadDuck).quack();  // Cast to Quackable
        
        System.out.println("\nLake Duck behavior:");
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();  // Cast to Flyable
        ((Quackable) lakeDuck).quack();  // Cast to Quackable
    }
}
