package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  1.Scanner 객체를 이용해서 문자열을 5번 입력 받는다.
		 *  입력 받은 문자열은 차례대로 배열에 저장되어야한다.
		 *  모두다 입력 받은후 for문을 이용해서 배열에 저장된
		 *  모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해보세요.
		 */
		
		Scanner scan=new Scanner(System.in);
		String[] str=new String[5];
		
		for(int i=0;i<str.length;i++) {
			System.out.println("문자열을 입력하세요 :");
			str[i]=scan.nextLine();
		};
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		};
	}
}
