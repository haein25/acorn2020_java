package test.auto;

public class Car {
	//필드
	protected Engine engine;
	//Engine 객체를 인자로 전달받는 생성자
	public Car(Engine engine) {
		//필드에 저장하기
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴 수 없어요");
			return; //메소드 끝내기
		}
		System.out.println("달려요");
	}
	//1.public => 전체공개
	//2.protected => 상속관계에만 공개
	//3.default(아무것도안쓰는것)
	//4.private => 객체안에서만, 클래스안에서만
}
