// Base class: Bharatvanshi
class Bharatvanshi {
    // All Bharatvanshis are fighters
    public void fight() {
        System.out.println("I am fighting as a Bharatvanshi!");
    }
}

// Pandav class extending Bharatvanshi
class Pandav extends Bharatvanshi {
    public void obey() {
        System.out.println("I am obedient as a Pandav!");
    }
    
    public void kind() {
        System.out.println("I am kind as a Pandav!");
    }
}

// Kaurav class extending Bharatvanshi
class Kaurav extends Bharatvanshi {
    public void disobey() {
        System.out.println("I disobey as a Kaurav!");
    }
    
    public void cruel() {
        System.out.println("I am cruel as a Kaurav!");
    }
}

// Arjun (A Pandav)
class Arjun extends Pandav {
    public void display() {
        System.out.println("I am Arjun, a Pandav.");
        fight();
        obey();
        kind();
    }
}

// Bheem (A Pandav)
class Bheem extends Pandav {
    public void display() {
        System.out.println("I am Bheem, a Pandav.");
        fight();
        obey();
        kind();
    }
}

// Duryodhan (A Kaurav)
class Duryodhan extends Kaurav {
    public void display() {
        System.out.println("I am Duryodhan, a Kaurav.");
        fight();
        disobey();
        cruel();
    }
}

// Vikarn (A Kaurav who is noble: good fighter, obedient, and kind)
// Change: Now extending Pandav since Vikarn should be obedient and kind
class Vikarn extends Pandav {
    public void display() {
        System.out.println("I am Vikarn, a noble Kaurav.");
        fight();
        obey();
        kind();
    }
}

// Main class to test the inheritance and behavior
public class tempCodeRunnerFile {
    public static void main(String[] args) {
        // Creating objects of different characters
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
        
        // Displaying the behavior of each character
        arjun.display();
        System.out.println();
        bheem.display();
        System.out.println();
        duryodhan.display();
        System.out.println();
        vikarn.display();
    }
}
