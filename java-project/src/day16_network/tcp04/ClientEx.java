package day16_network.tcp04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stdin = null;
		BufferedWriter bw = null;
		Socket client = null;	// socket 1
		int port = 9999;
		
		try {
			client = new Socket("127.0.0.1", port);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			stdin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			
			while(true) {
				System.out.print("message input : ");
				outputMessage = stdin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				
				bw.write(client.getInetAddress() + " 클라이언트 > " + outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				client.close();
			} catch (Exception e) {
				System.out.println("Server와 채팅 중 오류 발생....................X_X");
			}
		}
		
	}
}
