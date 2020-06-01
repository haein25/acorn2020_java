package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj=new MyObject();
		//useSome() 메소드를 호출해보세요.
		obj.useSome("abcd",new Car());
		
		obj.doSome(new Radio(), new Speaker()); 
	}

}
