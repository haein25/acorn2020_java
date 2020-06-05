package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적: 아래의 useMen() 메소드를 호출하는것
		 *  아래의 useMen() 메소드를 호출해보세요
		 */
		MainClass13.useMen(new Men(new Blood("+","B")));
		
	}
	public static void useMen(Men m) {
		m.walk();
		m.study();
		m.seeMovie();
		
	}
}
