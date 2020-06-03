package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {

		/*
		 *  2. Random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서
		 *  배열에 저장한다.
		 *  모두다 저장이되면 for문을 이용해서 배열에 저장된 모든 로또 번호를
		 *  콘솔창에 순서대로 출력하는 코드를 작성해보세요.
		 */
		Random random=new Random();
		Integer[] num=new Integer[6];
		for(int i=0;i<num.length;i++) {
			num[i]=random.nextInt(45)+1;
		};
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		};
		/*for(int tmp:num) {
			int tmp=num[i];
			System.out.println(tmp);
		}*/
	}
}
