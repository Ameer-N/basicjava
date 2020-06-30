package programiz;

import java.net.InetAddress;

public class IpAddress {

	public static void main(String[] args) throws Exception{
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("My IP Address is:");
	    System.out.println(ip.getHostAddress());
		

	}

}
