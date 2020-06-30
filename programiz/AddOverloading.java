package programiz;

public class AddOverloading {
    public void add(double no1,double no2) {
		System.out.printf("sum of two number:%.1f",no1+no2);
	}
    public void add(double no1,double no2,double no3) {
    	System.out.printf("sum of two number:%.1f",no1+no2+no3);
   	}
    public void add(double no1,double no2,double no3,double no4) {
    	System.out.printf("sum of two number:%.1f",no1+no2+no3+no4);
   	}
	public static void main(String[] args) {
		AddOverloading add=new AddOverloading();
		add.add(2, 3);
		System.out.println();
		add.add(2, 3, 4);
		System.out.println();
		add.add(2, 3, 5);
		

	}

}
