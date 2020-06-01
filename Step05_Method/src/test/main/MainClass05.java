package test.main;

import test.mypac.Car;
import test.mypac.First;
import test.mypac.MyObject;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * test.mypac 패키지에 다양한 모양의 메소드를 가지는
		 * 클래스를 정의하고
		 * 그 클래스를 이용해서 객체도 생성하고 메소드도 호출해보세요.
		 */
		Car car1=new Car();
		car1.name="sonata";
		car1.drive();
		
		Car car2=new Car();
		car2.drive();
		
		MyObject obj1=new MyObject();
		obj1.walk();
		obj1.getNumber();
		obj1.getGreeting();
		
		obj1.getCar();
		obj1.setNum(7);
		obj1.setName("abcd");
		
		obj1.useCar(new Car());
		
		new First();
	}

}
