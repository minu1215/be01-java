package day14_io.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws Exception { // throws IOException {
		
		Grade vo = new Grade();
//		vo.setSubject("미술");
//		vo.setScore(80);
		
		vo.setSubject("전산");
		vo.setScore(95);
		
		System.out.println(vo);	// 화면출력
		OutputStream os = new FileOutputStream("./day14/grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);	// 지정한 파일 grade.dat 안에 쓴다.
		oos.close();
	}
}
