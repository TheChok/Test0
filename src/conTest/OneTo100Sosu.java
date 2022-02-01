package conTest;

public class OneTo100Sosu {
	public static void main(String[] args) {
		// 소수 : 1 과 자기자신으로만 나누어지는 수
		// 2 부터 100까지의 정수들의 모든 소수를 구하십시오.
		// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
		int count = 0;
		
		for(int num = 2; num <= 100; num++) {
			for(int j = 2; j <= num; j++) {
				if(num % j == 0)	count++;
			}
				if(count == 1)		System.out.print(num + ", ");
				count = 0;
		}
	} // End - public static void main(String[] args)
} // End - public class OneTo100Sosu
