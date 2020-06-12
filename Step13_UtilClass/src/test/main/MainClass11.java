package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Map<String, String> dic=new HashMap<String, String>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		/*
		 *  검색할 단어를 입력하세요: house
		 *  
		 *  house 의 뜻은 집입니다.
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.print("검색할 단어를 입력하세요: ");
		String a=scan.next();
		System.out.println(); //이거는 없어도되는데 그냥 한줄 띄운거
		
		if(dic.get(a)==null) {
			System.out.println(a+"는 목록에 없습니다.");
		}
		else{
			System.out.print(a+" 의 뜻은 "+dic.get(a)+"입니다.");
		}
	}
}
