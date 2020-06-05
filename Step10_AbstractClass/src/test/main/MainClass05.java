package test.main;

public class MainClass05 {
	//필드
	public String myName="김구라";
	public static String yourName="원숭이";
	
	public static void main(String[] args) {
		//static 메소드 안에서 this 는 의미도 없고 사용불가
		//System.out.println(this.myName);
		
		//myName 이라는 필드는 non static이므로 클래스명. 으로 접근불가
		//System.out.println(MainClass05.myName);
		
		//myName 은 non static 필드임ㅇ으로 참조값으로 접근가능
		System.out.println(new MainClass05().myName);
		
		//yourName 이라는 필드는 static 이므로 클래스명. 으로 접근가능
		System.out.println(MainClass05.yourName);
		//yourName 의 main() 메소드는 동일 클래스에 있기 때문에 클래스명 생략가능
		System.out.println(yourName);
		//static 메소드 안에서 this 는 의미도없고 사용불가
		//System.out.println(this.yourName);
	}
}
