package test.main;

import test.auto.Engine;
import test.auto.SportsCar;
import test.auto.Suv;
import test.auto.Train;
import test.auto.Truck;

public class MainClass08 {
	public static void main(String[] args) {		
		//Truck 객체를 생성해서 .drive() .dump() 메소드를 호출해 보세요.
		Truck t=new Truck(new Engine());
		t.drive();
		t.dump();
		
		//SportsCar 객체를 생성해서 .drive() 메소드를 호출해 보세요. 
		
		SportsCar s1=new SportsCar(new Engine());
		s1.drive();
		
		//test
		Suv s2=new Suv(new Engine());
		s2.drive();
		
		Train t2=new Train(new Engine());
		t2.user();
	}
}
