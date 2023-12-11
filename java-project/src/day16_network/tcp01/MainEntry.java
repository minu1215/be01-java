package day16_network.tcp01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	public static void main(String[] args) {
		String host = "127.0.0.1";	// String host = "192.168.0.67";
//		String host = "192.168.0.67";

		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for(InetAddress item : address) {
				System.out.println(item);
				System.out.println(item.getCanonicalHostName());
				// 127.0.0.1	127.0.0.1
				// 192.168.0.67	LAPTOP-71RGVRE0
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
