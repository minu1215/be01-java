package day10_API.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		//StringTokenizer st = new StringTokenizer("this is a test");	// 입력값 없으면 구분자 공백
		StringTokenizer st = new StringTokenizer("김연아/박태환/강감찬/이순신", "/");
		
		while(st.hasMoreTokens()) {	// 다음 요소가 있는가?
			System.out.println(st.nextToken());
		}
		
		System.out.println("--------------------------");
		String[] result = "this is a test".split("\\s");
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
