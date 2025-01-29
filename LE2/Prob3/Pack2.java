// File: Pack2.java
public class Pack2 extends Pack1 {
    public static void main(String[] args) {
        // Create an object of Pack2
        Pack2 obj = new Pack2();
        
        // Access the protected method from Pack1 via Pack2 (subclass)
        obj.display();
    }
}
