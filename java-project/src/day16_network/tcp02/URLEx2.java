package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException{
		URL url = new URL("https://www.google.com/search?q=kim+yuna&sca_esv=589698990&ei=ual2ZeTnEJmg1e8Poo6xuA0&ved=0ahUKEwikqJ263oaDAxUZUPUHHSJHDNcQ4dUDCBA&uact=5&oq=kim+yuna&gs_lp=Egxnd3Mtd2l6LXNlcnAiCGtpbSB5dW5hMgUQLhiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAuGIAEMgUQLhiABDIUEC4YgAQYlwUY3AQY3gQY3wTYAQFIswVQkQFYkQFwAXgBkAEAmAGTAaABkwGqAQMwLjG4AQPIAQD4AQHCAgoQABhHGNYEGLAD4gMEGAAgQYgGAZAGCroGBggBEAEYFA&sclient=gws-wiz-serp");				
//		URL url = new URL("https://127.0.0.1");
		
//		https://www.google.com/
//		search?
//		q=kim+yuna
//		&sca_esv=589698990
//		&ei=ual2ZeTnEJmg1e8Poo6xuA0
//		&ved=0ahUKEwikqJ263oaDAxUZUPUHHSJHDNcQ4dUDCBA
//		&uact=5
//		&oq=kim+yuna
//		&gs_lp=Egxnd3Mtd2l6LXNlcnAiCGtpbSB5dW5hMgUQLhiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAuGIAEMgUQLhiABDIUEC4YgAQYlwUY3AQY3gQY3wTYAQFIswVQkQFYkQFwAXgBkAEAmAGTAaABkwGqAQMwLjG4AQPIAQD4AQHCAgoQABhHGNYEGLAD4gMEGAAgQYgGAZAGCroGBggBEAEYFA
//		&sclient=gws-wiz-serp
		
		// URL 이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
	}
}
