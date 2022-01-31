package conTest;

public class Cond05 {
	public static void main(String[] args) {
		new NumExam04();
		
	} // End - public static void main(String[] args)
} // End - public class Cond05

class NumExam03 {
	NumExam03() {
		// 회문수 검증하기
		int number = 1235321;	int temp = number;	int result = 0;
		
		while(temp != 0) {	System.out.println(temp + "==" + result);	result = result * 10 + temp % 10;	temp = temp / 10;	}
		if(number == result) 	System.out.println(number + "는 회문수입니다.");
		else 					System.out.println(number + "는 회문수가 아닙니다.");
	} // End - NumExam03()
} // End - class NumExam03

class NumExam04 {
	NumExam04() {
		// 숫자 맞추기 놀이
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0, count = 0;
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		do {
			count++;	System.out.println("1부터 100 사이의 정수를 입력하세요: ");		input = keyboard.nextInt();
			if(input < 1 || input > 100) {	System.out.println("1부터 100 사이의 정수를 입력하셔야 합니다.");	count--;	continue;	}
			if(answer > input) 		System.out.println("더 큰 수를 입력하세요.");
			else if(answer < input) System.out.println("더 작은 수를 입력하세요");
			else 		  		  {	System.out.println("정답입니다. " + count + "번 만에 맞추셨습니다."); break;	}
		} while(true);
		System.out.println("이용해주셔서 감사합니다.");
	} // End - NumExam04()
} // End - class NumExam04