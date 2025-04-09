



public class MainFile {
    public static void main(String[] args) {
        tea teaObj=new tea();
        Rum RumObj=new Rum(teaObj);
        Coffee CoffeeObj=new Coffee();
        Gin GinObj=new Gin(CoffeeObj);
        System.out.println(RumObj.GiveName());
        System.out.println(RumObj.GivePrice());
        System.out.println(GinObj.GiveName());
        System.out.println(GinObj.GivePrice());
    }
}

