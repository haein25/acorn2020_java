package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 *  [ 컴퓨터와 가위 바위 보 하기 ]
 *  
 *  가위(s) 바위(r) 보(p) :
 *  
 *  나: 가위 vs 컴: 보
 *  win, draw, lose 
 */
public class MainClass13 {
	public static void main(String[] args) {
		String[] srp= {"가위","바위","보"};
		String[] srp2= {"s","r","p"};
		Random ran=new Random();
		
		System.out.println("가위(s), 바위(r), 보(p) 중 하나를 골라보세요 :");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		if(str.equals("s")) {
			System.out.print("나: "+srp[0]);
		}
		else if(str.equals("r")) {
			System.out.print("나: "+srp[1]);
		}
		else if(str.equals("p")) {
			System.out.print("나: "+srp[2]);
		}
		else {
			System.out.print("잘못입력했습니다.");
		}
		System.out.print(" vs ");
		//컴퓨터가 내는 랜덤한 값
		int com=ran.nextInt(3);
		System.out.println(srp[com]);
		String comSrp=srp2[com];
		//win, draw, lose
		for(int i=0;i<srp.length;i++) {
			if((str.equals("s")&&com==2)||(str.equals("r")&&com==0)||(str.equals("p")&&com==1)) {
				System.out.print("win");
				break;
			}
			else if(str.equals(comSrp)) {
				System.out.print("draw");
				break;
			}else {
				System.out.print("lose");
			
			}
			/*if(str.equals(srp2[i])) {
				System.out.print("draw!");
			}
		}*/
		/*if(str.equals("s")){
			if(com==0) {
				System.out.println("draw");
			}else if(com==1) {
				System.out.println("lose");
			}else {
				System.out.println("win");
			}
		};
		if(str.equals("r")){
			if(com==0) {
				System.out.println("win");
			}else if(com==1) {
				System.out.println("draw");
			}else {
				System.out.println("lose");
			}
		};
		if(str.equals("p")){
			if(com==0) {
				System.out.println("lose");
			}else if(com==1) {
				System.out.println("win");
			}else {
				System.out.println("draw");
			}
		};
		*/

	}
	}
}
