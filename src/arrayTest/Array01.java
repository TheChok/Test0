package arrayTest;

public class Array01 {

	public static void main(String[] args) {
		// 총점과 평균 구하기 -> '총점'과 '평균'을 담을 바구니(변수)가 필요.
		int  sum = 0;  float avg = 0;
		
		int score[] = {100, 54, 70, 88, 45, 95, 64, 77, 50, 82};
		// sum = score[0] + score[2] + score[3] + ..... score[8] + score[9];
		for(int i = 0; i < score.length; i++) {	sum += score[i]; }	avg = (float)sum/score.length;
		System.out.println("sum: " + sum + ", avg: " + avg);		System.out.println();
		
		//-------------------------------------------------------------------------------------------//
		// 배열의 최대값, 최소값 구하기 -> '최대값'과 '최소값'을 담을 그릇(변수)이 필요.
		int[] score1 = {20, 54, 70, 88, 45,  95, 64, 77, 50, 82};
		int max = score1[0], min = score1[0];

		// max 또는 min과 score[i]의 값을 비교해서 최대값 수정
		for(int i = 0; i < score.length; i++) {
			if(max < score1[i]) max = score1[i];
			if(min > score1[i]) min = score1[i];
		}	System.out.println("max: " + max + ", min: " + min);		 System.out.println();
		
		//-------------------------------------------------------------------------------------------//
		// 각 배열에 있는 숫자를 랜덤한 숫자로 바꾸기 - '배열' 1개와 '랜덤한 숫자를 저장할 변수'1개 + 숫자들을 바꾸기 위한 변수 1개(중요)
		int num[] = new int[10];
		for(int i = 0; i < num.length; i++) { num[i] = i;	System.out.print(num[i] + ", "); }	System.out.println();
		for(int i = 0; i < num.length; i++) {
			int n = (int)(Math.random()*10);
			int imsi = num[0];	num[0] = num[n];	num[n] = imsi;
		}
		for(int i = 0; i < num.length; i++) System.out.print(num[i] + ", ");
	}
}
