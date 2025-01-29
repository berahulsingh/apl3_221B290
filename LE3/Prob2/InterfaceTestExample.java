// Step 1: Define the Testable interface
interface Testable {
    // Method declaration in the interface. By default, it's public.
    void display();
}

// Step 2: Create the Test class that implements Testable
class Test implements Testable {
    // Implementing the display() method from Testable interface
    @Override
    public void display() {
        System.out.println("Display method implemented in Test class.");
    }
}

// Step 3: Create an abstract class AbsTest that implements Testable
abstract class AbsTest implements Testable {
    // No need to implement display() method here; it's abstract
    // We can leave it unimplemented, and concrete subclass must implement it.
}

// Step 4: Create a concrete class ConcreteTest that extends AbsTest and implements display()
class ConcreteTest extends AbsTest {
    // Implementing the display() method as required by the Testable interface
    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteTest class.");
    }
}

// Main class to test everything
public class InterfaceTestExample {
    public static void main(String[] args) {
        // Test class implements Testable directly
        Test testObj = new Test();
        testObj.display();  // Should print: Display method implemented in Test class.

        // ConcreteTest class implements Testable through AbsTest
        ConcreteTest concreteTestObj = new ConcreteTest();
        concreteTestObj.display();  // Should print: Display method implemented in ConcreteTest class.
    }
}
