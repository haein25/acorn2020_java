package test.main;

import test.mypac.Myutil;

public class MainClass05 {
	public static void main(String[] args) { 
		Myutil.draw();
		
		try {
			//send() 메소드에서 발생하는 Exception 을 처리해야한다.
			Myutil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
