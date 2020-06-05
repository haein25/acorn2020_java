package test.auto;

public class Train extends Car{
	public Train(Engine engine) {
		super(engine);
	}
	
	public void user() {
		super.drive();
		System.out.println("많은 사람이 이용해요");
	}

}
