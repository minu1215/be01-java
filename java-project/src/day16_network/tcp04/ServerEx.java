package day16_network.tcp04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stdin = null;
		BufferedWriter bw = null;
		ServerSocket server = null;	// socket 1
		Socket client = null;	// socket 2
		int port = 9999;
		System.out.println("Server run......");
		
		try {
			server = new ServerSocket(port);
			client = server.accept();
			
			// 네트워크를 통해서 데이터 읽어옴
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 키보드로부터 입력 스트림
			stdin = new BufferedReader(new InputStreamReader(System.in));
			
			// 클라이언트로의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();	// 클라이언트에서 한행의 문자열 읽음
				System.out.println(inputMessage);
				// 클라이언트가 "EXIT"을 보내면 연결 종료
				if(inputMessage.equalsIgnoreCase("exit")) break;
				
				System.out.print("input message : ");
				String outputMessage = stdin.readLine();	// 키보드에서 한 행의 문자열 읽음
				// 키보드에서 읽은 문자열 전송
				bw.write(client.getInetAddress() + " 서버 > " + outputMessage + "\n");
				bw.flush();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				client.close();
				server.close();
			} catch (Exception e) {
				System.out.println("Client와 채팅 중 오류 발생..................X_X");
			}
		}
		
		
	}
}
