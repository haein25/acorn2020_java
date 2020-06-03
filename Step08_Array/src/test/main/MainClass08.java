package test.main;

import java.util.Random;

/*
 *   1.cherry, apple, banana, melon, 7
 *   5개의 문자열중에서 하나가 랜덤하게 출력되게 해보세요.
 *   
 *   2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요.
 *   	예) cherry | apple | cherry
 *   		7 | apple | melon
 *   		7 | 7 | 7
 */
public class MainClass08 {
	public static void main(String[] args) {
		Random ran=new Random();
		String[] str={"cherry","apple","banana","melon","7"};
		//System.out.println(str[ran.nextInt(5)]);
		
		//System.out.println();
		
		String[] str2=new String[3];
		for(int i=0;i<str2.length;i++) {
			str2[i]=str[ran.nextInt(5)];
		};
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]);
			if(i==2) {
				break;
			};
			System.out.print(" | ");
		};
	}
}
