package test.main;

import test.mypac.Drill;
import test.mypac.MultiPlayer;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//MultiPlayer 객체는 3가지 type 이 모두 될수 있기 때문에
		MultiPlayer mp=new MultiPlayer();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
	
	public static void useMultiPlayer(MultiPlayer mp) {
		mp.up();
		mp.down();
		mp.hole();
	}
}
