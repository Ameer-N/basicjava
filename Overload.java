public class Overload{
    int add(int a,int b){
    return a+b;    
    }
    int add(int a,int b,int c){
    return a+b+c;    
    }
    int add(int a,int b,int c,int d){
    return a+b+c+d;    
    }
    public static void main(String[] args) {
    Main obj=new Main();
	  System.out.println(obj.add(1,2));
	  System.out.println(obj.add(1,2,2));
	  System.out.println(obj.add(1,2,4,5));
	
	}
}
