package test.main;

import test.human.Blood;

public class MainClass10 {
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값을 b1 이라는 지역변수에 담아보세요.
		Blood b1=new Blood("+", "B"); //Rh+ B형 혈액형의 의미
		Blood b2=new Blood("+", "A"); //Rh+ A형 혈액형을 의미
		
		String result1=b1.getRh(); //"+"
		String result2=b1.getType(); //"B"
		
		String result3=b2.getRh(); //"+"
		String result4=b2.getType(); //"A"
	}
}
