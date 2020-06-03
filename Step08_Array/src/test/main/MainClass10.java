package test.main;

import java.util.Random;

public class MainClass10 {
	public static void main(String[] args) {
		/*cheery,apple,banana, melon
		 * 
		 * cherry|cherry|cherry
		 * 10점
		 * apple
		 * 20점
		 * 
		 * 777
		 * 1000점
		 * 
		 * 다르면
		 * 0점
		 * 
		 */
		Random ran=new Random();
		String[] str={"cherry","apple","banana","melon","7"};
		
		String[] str2=new String[3];
		for(int i=0;i<str2.length;i++) {
			str2[i]=str[ran.nextInt(5)];
		};
		for(int i=0;i<str2.length;i++) {
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
			/*
			if(str2[0]=="cherry") {
				System.out.println(points[0]+"점 입니다.");
			}
			else if(str2[0]=="apple") {
				System.out.println(points[1]+"점 입니다.");
			}
			else if(str2[0]=="banana") {
				System.out.println(points[2]+"점 입니다.");
			}
			else if(str2[0]=="melon") {
				System.out.println(points[3]+"점 입니다.");
			}
			else if(str2[0]=="7") {
				System.out.println(points[4]+"점 입니다.");
			}
			*/
		};
		if(str2[0]!=str2[1]||str2[1]!=str2[2]) {
			System.out.println("0점 입니다.");
		};
		
	}
}
