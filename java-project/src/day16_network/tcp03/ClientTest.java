package day16_network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {	// Socket 1개 필요
	public static void main(String[] args) {
		Socket s = null;
		
		System.out.println("-- Client Start --");
		
		try {
			s = new Socket("127.0.0.1", 9000);	// server ip & port number
			
			// I / O
			InputStream is = s.getInputStream();	// read
			OutputStream os = s.getOutputStream();	// write
			
			String str = "안녕 ... Server ... !!!";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			System.out.println(System.currentTimeMillis());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
