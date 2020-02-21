public class Main
{
    int no1;
    float no2;
    String name;
    //default  constructor
    Main(){
        no1=0;
        no2=0.0f;
        name="Hello";
    }
    //parameterized constructor
    Main(Main ob){
        this.no1=ob.no1;
        this.no2=ob.no2;
        this.name=ob.name;
    }
    //copy constructor
    Main(int no1,float no2,String name){
        this.no1=no1;
        this.no2=no2;
        this.name=name;
    }
    void show(){
        System.out.println(no1+" | "+no2+" | "+name);
    }
	public static void main(String[] args) {
		Main obj=new Main();
		obj.show();
	    Main obj1=new Main(1,2.2f,"ameer");
		obj1.show();
		Main obj2=new Main(1,2.2f,"ameer");
		obj2.show();
	}
}
