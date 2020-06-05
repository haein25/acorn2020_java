package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		// SmartPhone type 의 지역변수 p1을 만들 준비만하고 만들어 지지 않은 ㅅ ㅏㅇ태
		SmartPhone p1;
		// SmartPhone type 의 지역변수 p2를 만들고 비워둔 상태(참조값이 담기지 않은)
		SmartPhone p2=null;
		// SmartPhone type 의 지역변수 p3를 만들고 참조값을 넣어둔 상태
		SmartPhone p3=new SmartPhone();
		
		//p1은 아직 만들어지지 않았기 때문에 문법이 성립하지 않는다.
		//p1.call();
		//p2는 null이기 때문에 문법은 성립하지만 실행되지않는다.
		//p2.call();
	}
}
