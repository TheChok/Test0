package arrayTest;

import java.util.Scanner;

public class Array06Scanner {
	public static void main(String[] args) {
		ScannerTest1 st1 = new ScannerTest1();
		//ScannerTest2 st2 = new ScannerTest2();
	}
}

class ScannerTest1 {
	ScannerTest1() {
	// Scanner 함수 예제 익숙해지기
	String name[] = {"dooley", "gildong", "sooil", "choonhyang", "soonae"};
	int[] height = new int [name.length];
	int total = 0; // 키의 합계를 저장
	Scanner scanner = new Scanner(System.in);	// 변수 선언 시 new Scanner(System.in)으로 넣어주면 된다.
	
	// Scanner 함수를 이용해서 각 인원들의 키를 입력
	for(int i = 0; i < name.length; i++) {
		System.out.println(name[i] + "의 키를 입력하세요: ");
		height[i] = scanner.nextInt();	// <- ▲ 위처럼 텍스트 먼저 넣고 scanner.nextInt()를 써주면 된다.
		total += height[i];
	}
	for(int i = 0; i < name.length; i++) {
		System.out.println(name[i] + "의 키는 " + height[i] + "입니다.");
	} System.out.println();
	System.out.println("평균 키: " + total / name.length);
	}
}

class ScannerTest2 {
	ScannerTest2() {
	// Scanner 함수 예제 익숙해지기2
	String[] subject = { "Java", "JSP", "html", "Android", "Spring" }; // 시험과목
	int[]	 score   = {     88,    91,   77,       82,      60  };       // 과목에 따른 성적
	Scanner	 sc 	 = new Scanner(System.in);	// 생성자를 불러와서 변수 선언 new Scanner(System.in)
	
	System.out.println("과목을 입력하면 시험성적을 볼 수 있습니다.");
	while(true) {
		System.out.println("과목명을 입력하세요 : ");
		String name = sc.next();				// sc.next();를 대입해서 시스템입력 가능하도록
		System.out.println("입력한 과목명은 : " + name + "입니다.");
		
		// toLowerCase() - 모든 문자열을 소문자로 / toUpperCase() - 모든 문자열을 대문자로
		if(name.toLowerCase().equals("stop".toLowerCase()))	break;	// stop 타이핑하면 종료한다.
		for(int i = 0; i < subject.length; i++) {
			if(subject[i].toUpperCase().equals(name.toUpperCase())) {
				System.out.println(subject[i] + "과목점수: " + score[i]);
			}
		}
	}
		
		
	}
}