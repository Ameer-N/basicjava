package programiz;

import java.util.HashMap;
import java.util.Map;

public class DuplicateinString_2 {
    private static void checkDuplicate(String str) {
    	System.out.println("_________");
	   Map<Character,Integer> hashmap=new HashMap<Character,Integer>();
	   char [] arr=str.toCharArray();
	   for(Character ch:arr) {
		   if(hashmap.containsKey(ch)) {
			   hashmap.put(ch,hashmap.get(ch)+1);
		   }
		   else {
			   hashmap.put(ch,1);
		   }
	   }
	   for(Map.Entry<Character, Integer> entry:hashmap.entrySet()) {
		   if(entry.getValue()>1)
			   System.out.println("key"+entry.getKey()+",value"
		        +entry.getValue());
	   }
	   
    }
	public static void main(String[] args) {
		DuplicateinString_2 dup=new DuplicateinString_2();
		dup.checkDuplicate("BeginnersBook.com");
		dup.checkDuplicate("ChaitanyaSingh");
		dup.checkDuplicate("#@$@!#$%!!%@");
		

	}

}
