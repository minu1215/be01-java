package day10_API.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();	//system이 갖고 있는 날짜 얻어옴
		
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println((c.get(Calendar.MONTH)+ 1) + "월");	// 월은 0부터 시작함
		System.out.println(c.get(Calendar.DATE) + "일");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.printf("현재 시간은 %d시 %d분 %d초 입니다.\n", h, m, s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		//12 월은 11 입력, 넘어가는 수는 년도 + 1 1월
		c2.set(2022, 13, 30, 12, 0, 0);
		System.out.println(c2.get(Calendar.YEAR) + "년");
		System.out.println((c2.get(Calendar.MONTH)+ 1) + "월");	// 월은 0부터 시작함
		System.out.println(c2.get(Calendar.DATE) + "일");
		
		if(c1.after(c2)) {
			System.out.println("0");
		} else if(c.before(c2)) {
			System.out.println("X");
		} else if(c1.equals(c2)) {
			System.out.println("==");
		}
		
	}
}
