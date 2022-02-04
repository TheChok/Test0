package arrayPlus;

import java.util.Scanner;

public class Three69 {
	public static void main(String[] args) {
		new Three69Exam01();
	} // End - public static void main(String[] args)
} // End - public class Three69

class Three69Exam01 {
	Three69Exam01() {
		// 3, 6, 9의 숫자에 박수를 치자! - 1부터 100까지만.
		Scanner in = new Scanner(System.in);
		System.out.println("1이상 100이하의 양의 정수를 입력하십시오.");
		int count = in.nextInt();	int a, b;
		
		for(int i = 1; i < count; i++) {
			a = i / 10; // 검사대상을 10으로 나눈 몫
			b = i % 10; // 검사대상을 10으로 나눈 나머지
			
			if(a > 0 && b > 0 && a % 3 == 0 && b % 3 == 0) 	System.out.println("짝짝");
			else if(a > 0 && a % 3 == 0)			System.out.println("짝");
			else if(b > 0 && b % 3 == 0)			System.out.println("짝");
			else 						System.out.println(i);
		}
	} // End - Three69Exam01()
} // End - class Three69Exam01
