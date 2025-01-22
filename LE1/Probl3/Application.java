package Probl3;

class Mother {
   
    public void show() {
        System.out.println("Mother's show() method");
    }

    public static void staticShow() {
        System.out.println("Mother's static show() method");
    }
}

class Child extends Mother {
    
    @Override
    public void show() {
        System.out.println("Child's show() method");
    }

    public static void staticShow() {
        System.out.println("Child's static show() method");
    }
}

public class Application {
    public static void main(String[] args) {
      
        Mother m1 = new Child();  
        
        m1.show();  
        
        m1.staticShow();  
        
        System.out.println("\nMaking show() static in Mother class...");
        Mother m2 = new Mother();
        m2.staticShow(); 
        
        Mother.staticShow();  
        
        System.out.println("\nStatic methods in both Mother and Child:");
        Mother.staticShow();  
        Child.staticShow();  
        
        System.out.println("\nMaking show() static in Child class...");
        
        Child.staticShow(); 
    }
}
