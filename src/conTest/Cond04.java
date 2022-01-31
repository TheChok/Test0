package conTest;

public class Cond04 {
	public static void main(String[] args) {
		new NumExam02();
	}
}

class NumExam01 {
	NumExam01() {
		// num의 각 자리수를 더하면 얼마인가요?
		int num = 123456;
		int sum = 0;
		
		while(num > 0) {
			System.out.println(num % 10);
			sum += num % 10;	num /= 10;
		}
		System.out.println("각 자리수를 더한 결과: " + sum);
	} // End - NumExam01()
} // End - class NumExam01

class NumExam02 {
	NumExam02() {
		// 피보나치 수열
		// 1, 1, 2, 3, 5, ...........
		int num1 = 1, num2 = num1;		int num3 = 0;
		System.out.print(num1 + ", " + num2);
		
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;	num2 = num3;
		}
		
	} // End - NumExam02()
} // End - class NumExam02
