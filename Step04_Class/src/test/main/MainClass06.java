package test.main;

import test.mypac.Member;
import test.mypac.Box;
import test.mypac.Rect;
import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		//new Box().
		System.out.println("main 메소드가 시작 되었습니다.");
		Member a=Box.mem; //null
		Rect b=Box.rect; //null
		Car c=Box.car; //참조값이 들어있다.
		c.drive(); // 메소드 호출가능!
		
		//아래와 같이 사용할수도 있따.
		Box.car.drive();
		
		//a.showInfo(); // a 가 null이므로 NullPointerException 발생
		//b.showInfo(); // b가 null이므로 NullPointerExcption 발생
	}

}
