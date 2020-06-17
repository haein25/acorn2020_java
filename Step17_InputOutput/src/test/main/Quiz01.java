package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서  문자열 한줄을 입력 받은 다음
		 *  c:/acorn2020/myFolder/quiz.txt 파일을 만들어서
		 *  해당 파일에 문자열을 저장해 보세요
		 */
		System.out.println("문자열을 입력하세요: ");
		Scanner scan=new Scanner(System.in);
		String sc=scan.nextLine();
		
		File quizfile=new File("c:/acorn2020/myFolder/quiz.txt");
		try {
			boolean isExist=quizfile.exists();
			if(!isExist) {
				quizfile.createNewFile();
			}
			FileWriter fw=new FileWriter(quizfile, true);
			//fw.write(sc);
			fw.append(sc);
			fw.append("\r\n");
			//fw.flush();
			fw.close(); //자동 flush 된다.
			System.out.println("문자열을 저장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("quiz.txt 파일을 만들었습니다.");
		
	}
}
