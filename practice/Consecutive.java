package practice;

import java.util.HashMap;
import java.util.Map;

public class Consecutive {
	String oStr,removedStr;
	Map<String,Integer> map= new HashMap<String, Integer>();
	public Consecutive(String str) {
		this.oStr=str;
		this.removedStr="";
		removeUnwantedChar();
		checkConsective();
		System.out.println(map);
	}
	private char  toLower(char ch) {
		if(ch>='A' && ch<='Z')
			ch+=32;
		return ch;
	}
	private void removeUnwantedChar() {
		for(int i=0;i<oStr.length();i++) {
			char ch=toLower(oStr.charAt(i));
			if(ch>='a' && ch<='z') {
				removedStr+=ch;
			}
		}
	}
	private String checkConsecutive(char ch1,char ch2) {
		String temp="";
		if(ch2-ch1==1) {
			temp+=ch1;
			temp+=ch2;
		}
		return temp;	
		
	}
	private void putInput(String temp) {
		int count=1;
		if(map.containsKey(temp)) {
			count=map.get(temp)+1;
		}
		map.put(temp,count);
	}
	private void checkConsective() {
		String temp="";
		System.out.println(removedStr);
		for(int i=0;i<removedStr.length()-1;i++) {
			if(checkConsecutive(removedStr.charAt(i),removedStr.charAt(i+1))!="") {
				temp=checkConsecutive(removedStr.charAt(i),removedStr.charAt(i+1));
				putInput(temp);
			}
		}
	}
	public static void main(String[] args) {
		new Consecutive("i saw a CD play-er and a modem in ccd");
		new Consecutive("Student List do not exists in sys-tem");
		
	}
}
