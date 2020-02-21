class Base{
    void print(){
        System.out.println("I'm from base class");
    }
    
}
class Derived extends Base{
    @Override
    void print(){
        super.print();
        System.out.println("I'm from derived class");
    }
}

public class Main
{
	public static void main(String[] args) {
     //derived class
     Derived obj=new Derived();
     obj.print();
     // base class
     System.out.println();
     Base obj1=new Base();
     obj1.print();
     
	}
}
