
public class Main
{
    String name;
    int age;
    
    public void setter(){
        name="rakshit";
        age=22;
    }
    
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:" +age);
        
    }
    
	public static void main(String[] args) {
	
	Main obj=new Main();
	obj.setter();
	obj.display();
	}
}
