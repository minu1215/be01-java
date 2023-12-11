package day16_network.tcp03;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7000;
		
		System.out.println("-- Server Start --");
		
		try {
			ServerSocket ss = new ServerSocket(port);	// socket 1
			
			while(true) {
				Socket s = ss.accept();	// socket 2
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
//				oos.writeObject("교수컴 : " + new Date());
				oos.writeObject(new Date());
				oos.flush();	// 버퍼 비우기
				s.close();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
