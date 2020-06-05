package test.auto;

public class Suv extends Car{
	public Suv(Engine engine) {
		super(engine);
	}
	@Override
	public void drive() {
		System.out.println("짐을 싣고 달려요");
	}
}
