package test.main;

import test.mypac.Bow;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//여러분이 직접 클래스를 만들고 객체 생성을 해서 
		//아래의 useWeapon()메소드를 호출해보세요.
		Weapon b1=new Bow();
		MainClass02.useWeapon(b1);
		
		MainClass02.useWeapon(new Bow());
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
