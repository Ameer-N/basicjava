package practice2;

import java.util.ArrayList;
import java.util.List;

public class SumPresent {
	static int flag=0;
	public  String checkSum(int[] arr,int len,int sum) {
		String str="";
		for(int inc=len-1;inc>=0;inc--) {
			if(arr[inc]<=sum) {
				sum -=arr[inc];
				str=arr[inc]+" "+str;
			}
			if(sum==0) {
				flag=1;
				return str;
			}
		}
		return "";
	}
	public static void main(String[] args) {
	SumPresent present = new SumPresent(); 
	int [] s= { 5, 34, 4, 12, 5, 2 };
	int sum =9;
	String str="";
	List<String> list = new ArrayList<String>();
	System.out.println("the sum is present in:");
	for(int inc=s.length;inc>=0;inc--) {
		str=present.checkSum(s,inc,sum);
		if(str!="" && !list.contains(str))
			list.add(str);
	}
	if(flag==0)
		System.out.print("not found");
	else
		for(String val:list)
			System.out.println(val);
	}
}
