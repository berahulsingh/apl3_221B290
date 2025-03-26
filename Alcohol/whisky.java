
public class whisky {
    private void PoureIntoCup(){
        System.out.println("Pouring into cup");
    }
    private void AddIceWater(){
        System.out.println("Adding ice water");
    }   
    private void AddWhisky(){
        System.out.println("Adding whisky");
    }
    public void MakeDrink(){
        System.out.println("Making whisky");
        System.out.println("Take Glass");
        PoureIntoCup();
        AddIceWater();
        AddWhisky();
        System.out.println("Drink is ready");
    }

}
