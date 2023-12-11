package day16_network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class ClientTime {
	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		int port = 7000;
		Date date = null;
		
		try {
			Socket s = new Socket(serverIP, port);
			InputStream is = s.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			System.out.println("Server측 날짜/시간 확인.......");
			date = (Date) ois.readObject();
			System.out.println("현재 서버측 시간 : " + date + " 입니다.");
			ois.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
