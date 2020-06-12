package test.main;

import java.io.File;
import java.io.IOException;

/*
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		File f1=new File("c:/acorn2020/myFolder/test.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료되었습니다");
	}
}
