package day14_io.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;

public class FileCopy {
	public static void main(String[] args) throws Exception{	// 예외처리 위임
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("./day14/yuna.png");	// 읽기 최상위 클래스(추상 클래스)
		
		// 쓰기 객체 - FileOutputStream
//		OutputStream os = new FileOutputStream("./day14/kim.png");	// 쓰기 최상위 클래스(추상 클래스)
		OutputStream os = new FileOutputStream("./day14/kim1.jpg");
		
		byte[] buffer = new byte[1024 * 8];

		long start = System.currentTimeMillis();
		
		while(true) {
//			int inputData = is.read();
			int inputData = is.read(buffer);	// buffer 크기만큼 읽어들임
			if(inputData == -1) break;
//			os.write(inputData);
			os.write(buffer, 0, inputData);
		}	// while end
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);	// 복사(작업)에 걸린 시간
		is.close();
		os.close();
		System.out.println("copy success!!");
	}
}
