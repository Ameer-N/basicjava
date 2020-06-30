package programiz;

import java.util.Arrays;

public class BinaryNumberAdd {
    
	public static void main(String[] args) {
	int no1=11111;
	int no2=1000;
	int i=0,temp1=0,temp2=0;
	System.out.println("method 1:(unequal)");
	while(no1>0) {
		temp1+=(no1%10)*(int)Math.pow(2,i++);
		no1/=10;
	}
	i=0;
	while(no2>0) {
		temp2+=(no2%10)*(int)Math.pow(2,i++);
		no2/=10;
	}
	int res=temp1+temp2;
	int[] sum=new int[100];
	i=0;
	while(res>0) {
	   sum[i++]=(res%2);
	   res=res/2;
	}
	for(int val=i-1;val>=0;val--)
	   System.out.print(sum[val]);
	
	System.out.println("\nmethod 2:(equal)");
	int no= 11111;
	int no3=10001;
	int carry=0,i1=0,count=0;
	int[] res1=new int[100];
    while(no>0 && no3>0) {
		res1[i1++]=(no%10 + no3%10+carry)%2;
		carry=(no%10 + no3%10+carry)/2;
	    no/=10;
	    no3/=10;
	    count++;
	}
    while(no>0) {
    	res1[i1++]=(no%10 +carry)%2;
		carry=(no%10 +carry)/2;
	    no/=10;
	    count++;
    }
    while(no3>0) {
    	res1[i1++]=(no3%10+carry)%2;
		carry=(no3%10+carry)/2;
	    no3/=10;
	    count++;
    }
    res1[i1++]=carry;
    count++;
  for(int j=count-1;j>=0;j--) {
	  System.out.print(res1[j]);
  }
 }

}
