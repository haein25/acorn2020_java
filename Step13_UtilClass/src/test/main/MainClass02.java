package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 가변 배열 객체 생성
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//nums의 크기를 얻어와서 int 타입의 변수 size에 대입하기
		int size=nums.size();
		//각각의 방에 있는 값을 num1,num2,num3 에 저장하기 num2는 참조데이터타입으로 저장됨
		int num1=nums.get(0);
		Integer num2=nums.get(1);
		int num3=nums.get(2);
		//nums의 1번방의 내용을 40으로 수정하기
		nums.set(1, 40);
		//nums의 1번방 삭제하기
		nums.remove(1);
		//nums 전체 지우기
		nums.clear();
	}
}
