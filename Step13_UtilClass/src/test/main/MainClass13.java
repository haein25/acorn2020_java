package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass13 {
	public static void main(String[] args) {
		//정수를 담을수 있는 HashSete 객체를 생성해서 참조값을 Set type 지역 변수에 담기
		Set<Integer> nums=new HashSet<Integer>();
		
		//0~9 정수를 for 문을 이용해서 담기
		for(int i=0;i<10;i++) {
			nums.add(i);
		}
		
		//Set 에 저장된 item의 갯수?
		int size=nums.size();
		//int 에 저장된 item 을 모두 불러오기?
		
		//iterator 반복자 객체 얻어오기
		Iterator<Integer> it=nums.iterator();
		// it.hasNext() 는  커서 다음에 얻어낼 데이터가 있는지 확인해서 있으면 true 를
		// 리턴하고 없으면 false 를 리턴한다.
		while(it.hasNext()) {
			//it.next() 는 커서를 한칸 움직여서 커서가 위치한 곳의 데이터를 얻어온다.
			int tmp=it.next();
			System.out.println(tmp);
		} //근데 닭가슴살 소세지 마시쪄 좋겠당 좋은생각이야
		
	}
}
