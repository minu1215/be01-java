package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws IOException {
		URL google = new URL("https://www.google.com");
//		URL encore = new URL("https://www.en-core.com");
		
		// System.in 키보드 표준 입력으로 부터
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
//		BufferedReader br = new BufferedReader(new InputStreamReader(encore.openStream()));
		
		String inputLine;
		while((inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		br.close();
	}
}
