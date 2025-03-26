
public class Rum {
    private void PoureIntoCup(){
        System.out.println("Pouring into cup");
    }
    private void AddSodaWater(){
        System.out.println("Adding soda water");
    }
    private void AddSugar(){
        System.out.println("Adding sugar");
    }
    private void AddRum(){
        System.out.println("Adding rum");
    }
    public void MakeDrink(){
        System.out.println("Making rum");
        System.out.println("Take Glass");
        PoureIntoCup();
        AddSodaWater();
        AddSugar();
        AddRum();
        System.out.println("Drink is ready");
    }
}
