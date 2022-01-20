package arrayTest;

public class Array03 {

	public static void main(String[] args) {
		// 배열의 총합과 평균 구하기
		int score[][] = {
			{88, 70, 91},	// 각 학생의 국어, 영어, 수학 점수
			{50, 88, 70},
			{77, 67, 95},
			{45, 92, 88},
			{80, 66, 78}
		};
		// System.out.println("행의 갯수: " + score.length);															// 행과						score.length
		// for(int i = 0; i < score.length; i++) {	System.out.println(i + "행 열의 갯수: " + score[i].length);	}		// 열의 차이에 대한 설명	score[i].length
				
		// 각 과목별 총합 구하기
		int korTotal = 0, engTotal = 0, matTotal = 0;
		
		for(int i = 0; i < score.length; i++) {
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			// 각 학생의 총합 및 평균
			float sum = 0;									// 두번째 반복문이 시작되기 전 sum 값이 0으로 초기화, 다음번 학생의 총합을 구한다.
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}	System.out.print((i+1) + "번 학생의 총합: " + (int)sum); System.out.printf(",  평균: %.2f", (sum/3)); System.out.println();
		}		System.out.println("국어총합: " + korTotal + ", 영어총합: " + engTotal + ", 수학총합: " + matTotal); 

		

		
		
		
	}

}
