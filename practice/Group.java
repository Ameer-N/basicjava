package practice;
public class Group {
    String res,str;
    int count;
    char prev;
    public Group(String str) {
    	this.str=str;
    	this.count=1;
    	this.prev=str.charAt(0);
    	this.res="";
	}
    private char lower(char ch) {
		if(ch>='A' && ch<='Z')
			ch+=32;
		return ch;
	}
    void isLetter(char current){
        current=lower(current);
        prev=lower(prev);   
        if(current == prev){
            count++;
        }
        else{
            res+=prev;
            res+=count;
            count=1;
            prev=current;
        }
       
    }
    private void findGroup() {
    	System.out.println("original string"+str);
    	for(int i=1;i<str.length();i++) {
    		char ch=str.charAt(i);
    	    isLetter(ch);
    	}
        res+=prev;
        res+=count;
        System.out.println("grouped string:"+res);
	}
	public static void main(String[] args) {
    Group grp=new Group("aAbcccccaaA");
	grp.findGroup();
	Group grp2=new Group("BbBbBbBbBb");
	grp2.findGroup();
	}
}
