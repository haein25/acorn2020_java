package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 문자열을 두번 입력 받는다.
		 *  즉 새로 추가할 이름과 주소를 입력 받아서
		 *  MemberDao 객체를 이용해서 DB 에 저장하는 code 를 작성해보세요.
		 */
		
		//Scanner 객체를 이용해서 이름과 주소를 입력 받는다.
		Scanner scan=new Scanner(System.in);
		System.out.println("새로운 회원의 이름을 입력하세요 : ");
		String name=scan.nextLine();
		System.out.println("새로운 회원의 주소를 입력하세요  : ");
		String addr=scan.nextLine();
		
		//이름과 주소를 MemberDto 객체에 저장하기
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//MemberDao 객체의 참조값 얻어오기
		MemberDao dao1=MemberDao.getInstance();
		
		//MemberDao 객체의 메소드를 이용해서 DB에 저장하기
		boolean isSuccess=dao1.insert(dto);
	}
}
