

public class Gin extends DecoratorClass {
    public Gin(Offering obj){
        this.OfferingObj=obj;
    }
    @Override
    public String GiveName() {
        return OfferingObj.GiveName()+" and Gin";
    }
    @Override
    public int GivePrice() {
        return OfferingObj.GivePrice()+60;
    }
}

