package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  3명의 회원정보(번호, 이름, 주소) 를 HashMap 객체에 담고
		 *  
		 *  HashMap 객체의 참조값을 ArrayList 객체에 순서대로 담아 보세요.
		 */
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		Map<String, Object> m1=new HashMap<String, Object>();
		Map<String, Object> m2=new HashMap<String, Object>();
		Map<String, Object> m3=new HashMap<String, Object>();
		m1.put("num", 1);
		m1.put("name", "김구라");
		m1.put("addr", "노량진");
		
		m2.put("num", 2);
		m2.put("name", "해골");
		m2.put("addr", "행신동");
		
		m3.put("num", 3);
		m3.put("name", "원숭이");
		m3.put("addr", "동물원");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
				
		for(Map<String,Object> tmp:list) {
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			System.out.println(num+" | "+name+" | "+addr);
		}
	}
}
