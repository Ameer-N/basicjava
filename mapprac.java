import java.util.*;
class Student{
	String name;
	int rollno;
    Map<String,Integer> map=new HashMap<>();
    Student(String name,Map map,int rollno){
        this.name=name;
    	this.rollno=rollno;
    	this.map=map;
    //	System.out.println(map+"|"+name+" |"+rollno);
    }
    @Override
public String toString(){
	return name;
}

}
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
Set<Student> set=new HashSet<>();
	
	int i=0;
	while(i<2){
	String name=scan.next();
	int rollno=scan.nextInt();
	int mark1=scan.nextInt();
	int mark2=scan.nextInt();
	int mark3=scan.nextInt();
	Map<String,Integer> map=new HashMap<>();
	map.put("m1",mark1);
    map.put("m2",mark2);
    map.put("m3",mark3);
	Student st=new	Student(name,map,rollno);
	i++;
	set.add(st);
	
	}
	
	 TreeMap<String, Integer> sorted = new TreeMap<>(); 
	 Map<String,Integer> map1=new HashMap<>();
	Iterator itr1=set.iterator();
	while(itr1.hasNext()){
	    Student stud=(Student)itr1.next();
	    System.out.println(stud.map.get("m1"));
// 	    System.out.println(stud.map.get("m1"));
// 	}
// 	 Student stud=(Student)itr.next();
	
  
        // Copy all data from hashMap into TreeMap 
    sorted.putAll(stud.map); 
   
  
//         // Display the TreeMap which is naturally sorted 
//         for (Map.Entry<String, Integer> entry : sorted.entrySet())  
//             //System.out.println("Key = " + entry.getKey() +  
//                       //  ", Value = " + entry.getValue());  
	}
		System.out.println(map1);
// 	Iterator itr2=set.iterator();
// 	while(itr2.hasNext()){
// 	Student stu=(Student)itr2.next();
// 	for (Map.Entry<String, Integer> entry : sorted.entrySet())  
// 	  if(sorted.containsKey("m1"))
//             System.out.println("hii"); 
// 	}
	}
}
