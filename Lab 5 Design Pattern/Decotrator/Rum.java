
public class Rum extends DecoratorClass{
    public Rum(Offering Obj){
        this.OfferingObj=Obj;
    }
    @Override
    public String GiveName() {
        return OfferingObj.GiveName()+" and Rum";
    }
    @Override
    public int GivePrice() {
        return OfferingObj.GivePrice()+50;
    }
}

