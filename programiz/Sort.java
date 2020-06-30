package programiz;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Sort {
	Map<String,Integer> treeMap=new TreeMap<String,Integer>();
    public  void insert(String str,int i) {
    treeMap.put(str,i);
    }
    public void display() {
    	for(Map.Entry<String, Integer> entry:treeMap.entrySet()) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
	public static void main(String[] args) {
		Sort sort=new Sort();
		Scanner scan=new Scanner(System.in);
        System.out.println("treemap method:enter string count:");
        int count=scan.nextInt();
        for(int i=0;i<count;i++) {
        	sort.insert(scan.next().toLowerCase(),i);
        }
        sort.display();
        String[] arr=new String[count];
        System.out.println("String method:enter "+count +" string");
        for(int i=0;i<count;i++) {
        	arr[i]=scan.next().toLowerCase();
        }
        for(int i=0;i<count;i++) {
        	for(int j=i+1;j<count-1;j++) {
        		if(arr[i].compareTo(arr[j])>0) {
        		   String temp=arr[i];
        		   arr[i]=arr[j];
        		   arr[j]=temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
	}

}
