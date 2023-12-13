package day17_network.chat;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		
		String nameTag = "";
		System.out.print("대화명 : "); 
		nameTag = new Scanner(System.in).nextLine();
		
		if(nameTag.length() == 0) {
			System.out.println("USAGE : java TcpMultiChatClient 대화명이 없습니다.");
			System.exit(0);
		}
		
		try {
			String ip = "127.0.0.1";
			int port = 7777;
			Socket s = new Socket(ip, port);
			System.out.println("서버에 연결 되었습니다.");
			Thread sender = new Thread(new ClientSender(s, nameTag));
			Thread receiver = new Thread(new ClientReciever(s));
			
			sender.start();
			receiver.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	// main() end
	
	static class ClientSender extends Thread{	// Inner class
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);	// 키보드로부터 입력 받기
			try {
				if(dos != null) dos.writeUTF(name);
				while(dos != null) dos.writeUTF("[" + name + "] " + sc.nextLine());
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}	// ClientSender class end
	
	static class ClientReciever extends Thread{	// Inner class
		Socket s;
		DataInputStream dis;
		
		public ClientReciever(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while(dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}	// ClientReciever class end
}
