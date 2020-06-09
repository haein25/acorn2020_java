package test.mypac;

@FunctionalInterface
public interface Joinner {
	//전달 되는 두 문자열을 연결해서 리턴하는 메소드
	public String join(String first, String second);
}
