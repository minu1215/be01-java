package day14_io.fileEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class FileBufferedWriterEx {
	public static void main(String[] args) throws IOException {
		String str, file;
		Date date = new Date();
		String path = "./day14/";
		
		str = "파일 생성 시간 \r\n" + date + "\r\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름 입력 요망 : ");
		file = path + br.readLine();
		System.out.println("저장할 문자열 입력 요망 : ");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		System.out.println(file + " 파일을 성공적으로 저장했습니다.");
	}
}
