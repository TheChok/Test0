package arrayPlus;

import java.util.Scanner;

public class EvenManOddMin {

	public static void main(String[] args) {
		new MinExam();
	}

}

class MinExam {
	MinExam() {
		Scanner in1 = new Scanner(System.in);
		int[] num1 = new int[10];
		int max1 = 0, min1 = 0;
		// 10개의 값을 입력받아 홀수의 최소값과 짝수의 최대값을 구한다.
		for(int i = 0; i < num1.length; i++) {
			System.out.println((i+1) + "번째 수를 입력하세요: ");
			num1[i] = in1.nextInt();
			if(i == 0) min1 = num1[0];
			
			if(num1[i] % 2 != 0) {
				if(num1[i] < min1)	min1 = num1[i];
			} else {
				if(num1[i] > max1) max1 = num1[i];
			}
		}
		System.out.println("홀수의 최소값: " + min1 + ", 짝수의 최대값: " + max1);
	}
}

class MaxExam {
	MaxExam() {
		Scanner in2 = new Scanner(System.in);
		int[] num2 = new int[10];
		int max2 = 0, min2 = 0;
		// 10개의 값을 입력받아 짝수의 최소값과 홀수의 최대값을 구한다.
		for(int i = 0; i < num2.length; i++) {
			System.out.println((i+1) + "번째 수를 입력하세요: ");
			num2[i] = in2.nextInt();
			if(i == 0) min2 = num2[0];
			
			if(num2[i] % 2 != 0) {
				if(num2[i] > max2)	max2 = num2[i];
			} else {
				if(num2[i] < min2)	min2 = num2[i];
			}
		}
		System.out.println("짝수의 최소값: " + min2 + ", 홀수의 최대값: " + max2);
	}
}