/*
package day16_Lambda;

interface Message{
	void something();	// void 형태
}

class Person{
	public void greeting(Message msg) {
		msg.something();
	}
}

public class MainEntry {
	public static void main(String[] args) {
		// Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {	// 일반 상태
			@Override
			public void something() {
				System.out.println("good morning!");
				System.out.println("한주 동안 열공합시다!");
			}
		});
		
		System.out.println("-------------------------");
		
		p.greeting(() -> {
			System.out.println("Lambda : good morning!");
			System.out.println("Lambda : 한주 동안 열공합시다!");
		});
	}
}
*/
/*
 * 	Lambda Expression
 * 	JDK 8.0 이상
 *  형식>
 *  (매개변수 목록) -> (실행문)
 *  - 불필요한 클래스의 정의도 없다.
 *  - 메소드의 리턴 타입도 없고, 이름도 없다.(익명)
 *  - Anonymous Function(익명함수) ===> 익명클래스로 봐도 됨
 *  
 *  
 *  ex) 
 *  public int sum(int x, int y) { return x + y; }
 *  (x, y) -> { x + y }
 *  
 *  -- 장점 --
 *  . 코드를 간결하게 만들 수 있다.
 *  . 코드가 간결하고 식에 개발자의 의도가 명확히 드러나기에 가독성이 향상된다.
 *  . 코딩 시간이 줄어듬
 *  . 병렬프로그래밍이 가능함
 *  
 *  -- 단점 --
 *  . 재사용이 불가능하다.
 *  . 디버깅이 다소 까다롭다.
 *  . 람다를 남발하면 코드가 지저분함(중복 생성 할 가능성이 높음)
 *  . 재귀로 만들 경우에는 부적합하다.
 * 
 */