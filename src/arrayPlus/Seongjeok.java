package arrayPlus;

import java.util.Scanner;

public class Seongjeok {

	public static void main(String[] args) {
		// 임의의 학생들의 성적을 보여준다.
		// 1. 학생들의 수를 입력한다. 
		Scanner in = new Scanner(System.in);
		System.out.println("학생 수는 몇 명인가요? ");
		String name[] = new String[in.nextInt()];	// 정수를 입력받을 때는 nextInt()
		
		// 2. name[] 변수의 길이를 이용해서 변수들을 준비한다.
		int[] 	 	kor = new int[name.length], 	eng = new int[name.length], 	mat = new int[name.length],
				 	tot = new int[name.length], 	rank = new int[name.length];	double[] avg = new double[name.length];		
		String[] 	grade = new String[name.length];
		
		// 3. 학생의 수만큼 이름, 국어점수, 영어점수, 수학점수를 입력받아 각각의 배열에 저장한다. 
		for(int i = 0; i < name.length; i++) {
			System.out.print("학생이름: ");	 name[i] = in.next();		System.out.print("국어점수: ");  kor[i] = in.nextInt();
			System.out.print("영어점수: ");	 eng[i] = in.nextInt();		System.out.print("수학점수: ");	 mat[i] = in.nextInt();

			// 총점과 평균을 구한다.
			tot[i] = kor[i] + eng[i] + mat[i];		avg[i] = tot[i] / 3;
			// 등급 분류
			if(avg[i] >= 90) 		grade[i]	= "A학점";
			else if(avg[i] >= 80)	grade[i]	= "B학점";
			else if(avg[i] >= 70)	grade[i]	= "C학점";
			else if(avg[i] >= 60)	grade[i]	= "D학점";
			else					grade[i]	= "F학점";
		}
		
		// 4. 석차 구하기 - 석차는 1부터 시작하므로 rank의 방을 1로 초기화하고 시작한다.
		for(int i = 0; i < rank.length; i++) {	rank[i] = 1; }
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				if(tot[i] < tot[j]) {	rank[i]++;	}
			}
		}
		
		// 5. 성적리스트를 출력하자
		for(int i = 0; i < name.length; i++) {
			System.out.println("==============================================================================================================================");
			System.out.printf("이 름 : %s점 | 국 어 : %d점 | 영 어 : %d점 | 수 학 : %d점 | 총 점 : %d점 | 평 균 : %.2f점 | 학 점 : %s | 석 차 : %d등",
								name[i], kor[i], eng[i], mat[i], tot[i], avg[i], grade[i], rank[i]);										System.out.println();
		}	System.out.println("==============================================================================================================================");
		in.close();
	} // End - public static void main(String[] args)
} // End - public class Seongjeok
