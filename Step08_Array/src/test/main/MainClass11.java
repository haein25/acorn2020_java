package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//외형상 무한루프
		while(true) {
			System.out.print("종료(q) 계속(Enter):");
			String str=scan.nextLine();
			if(str.equals("q")) { //무한루프 탈출조건
				break; //while 문 탈출
			}
			System.out.println("무언가 작업합니다.");
			MainClass11.doGame(); 
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
	public static void doGame() {
		
		Random ran=new Random();
		String[] str={"cherry","apple","banana","melon","7"};
		
		String[] str2=new String[3];
		for(int i=0;i<str2.length;i++) {
			str2[i]=str[ran.nextInt(5)];
		};
		
		for(int i=0;i<str2.length;i++) {
			try{
				//실행의 흐름을 (스레드)을 1초 잡아놓기
				Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			System.out.print(str2[i]);
			if(i==2) {
				System.out.println();
				break;
			};
			System.out.print(" | ");
		};
		
		int[] points= {10,20,30,40,1000};
		if(str2[0]==str2[1]&&str2[1]==str2[2]) {
			for(int i=0;i<str.length;i++) {
				if(str2[0]==str[i]) {
					System.out.println(points[i]+"점 입니다.");
					break;
				};
			};
		};
		if(str2[0]!=str2[1]||str2[1]!=str2[2]) {
			System.out.println("0점 입니다.");
		};
	}
}
