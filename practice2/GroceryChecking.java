package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryChecking {
    static String bill="";
	static int no = 5001;
	int itemid;
	int price;
	public void generateitemId() {
		this.itemid = no++;
	}
	public GroceryChecking(int price) {
	 generateitemId();
	 this.price = price;
	}
	@Override
	public String toString() {
		return itemid+"-"+price;
	}
	 static boolean checkItemIsValid(int itemid) {
		boolean isValid = false;
		if(itemid>=5001 && itemid<=5005) {
			return !isValid;
		}
		return isValid;
	}
	static int caculatePrice(int itemid,int quantity,List<GroceryChecking> list) {
		int amount =0;
		for(GroceryChecking val:list) {
			if(val.itemid ==itemid) {
				bill+="itemid = "+itemid+"("+val.price+"*"+quantity+")="+(val.price*quantity)+"\n";	
				amount+=val.price*quantity;
			}
		}
		return amount;
	}
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<GroceryChecking> list = new ArrayList<GroceryChecking>();
    char ch='y';
    int billamount = 0,flag=0,price,itemid,quantity;
    boolean bool;
    System.out.println("Representation of item id and price:");
    for(int inc=0;inc<5;inc++) {
    	price=(int)(Math.random()*(200-100+1)+100);
    	list.add(new GroceryChecking(price));
    }
    System.out.println(list);
    System.out.println("welcome to grocery shop:");
    while(ch == 'y') {
    	System.out.print("enter the itemid that you want to purchase:");
    	itemid = scan.nextInt();
    	bool = checkItemIsValid(itemid);
    	if(bool) {
    		System.out.print("enter the Quantity(no):");
    		quantity = scan.nextInt();
    		billamount+=caculatePrice(itemid,quantity,list);
    		flag=1;
    	}
    	else {
    		System.out.println("Enter item id is not found");
    	}
    	System.out.print("do you want to puchase more:(y/n):");
    	ch = scan.next().charAt(0);
    }
    if(flag == 1) {
	    bill+="amount"+" "+billamount+"\n"+"discount"+"=5%\n";
	    bill+="dicount amount"+"= "+(billamount/5)+"\n"+"amount to be pay "+(billamount-(billamount/5));
	    System.out.println(bill);
	    System.out.println("thank for purchasing");
    }
    else {
    	System.out.println("thank u so much");
    }
    scan.close();
	}
}
