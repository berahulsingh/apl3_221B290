

public class Bear {
    private void PoureIntoCup(){
        System.out.println("Pouring into cup");
    }
    private void AddSodaWater(){
        System.out.println("Adding soda water");
    }
    private void AddBear(){
        System.out.println("Adding bear");
    }
    public void MakeDrink(){
        System.out.println("Making bear");
        System.out.println("Take Glass");
        PoureIntoCup();
        AddSodaWater();
        AddBear();
        System.out.println("Drink is ready");
    }
}
