// Parent class with int a and display method
class Parent {
    int a = 20; // Initializing a with a value

    // Method to display value of a
    void display() {
        System.out.println("Value of a in Parent: " + a);
    }
}

// Student class that inherits from Parent
class Student extends Parent {
    // Empty body; Student inherits display() from Parent
}

public class Application {
    public static void main(String[] args) {
        // Creating an object of Parent
        Parent p = new Parent();
        p.display(); // display() of Parent is called

        // Creating an object of Student
        Student s = new Student();
        s.display(); // display() inherited from Parent is called
    }
}
