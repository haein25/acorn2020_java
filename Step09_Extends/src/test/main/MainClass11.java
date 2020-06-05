package test.main;

import test.human.Blood;
import test.human.Men;
import test.human.Woman;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 영활르 보고싶다.
		 *  영화를 보는 프로그래밍의 목적을 달성해 보세요.
		 */
		Blood b1=new Blood("+", "A");
		Men m1=new Men(b1);
		m1.seeMovie();
		
		Blood b2=new Blood("+","B");
		Woman m2=new Woman(b2);
		m2.reading();
		
		/*
		 *  Men 객체를 생성해보자
		 *  객체 생성은 new 예약어와 함께 class 명() 이겠지?
		 *  맞다~ class명() 는 해당 클래스의 생성자를 호출하는 거였지?
		 *  객체가 생성이 안되는걸보니 저런 모양의 생성자가 없는것 같다.
		 */
		Men men=new Men(new Blood("+","A"));
		men.seeMovie();
		
		Blood b3=new Blood("+","O");
		Men men2=new Men(b3);
		men2.seeMovie();
		
		new Men(new Blood("-","B")).seeMovie();
	}
}
