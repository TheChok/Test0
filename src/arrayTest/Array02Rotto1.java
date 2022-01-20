package arrayTest;

import java.util.Scanner;

public class Array02Rotto1 {

	public static void main(String[] args) {
		// 1부터 45까지의 정수 중에서 6개의 수 추출하기(배열은 6개만 사용)
		// 추출한 수는 중복되면 안 된다.
		int ball[] 	= new int[6];		int ballNum = 6;
		Scanner in = new Scanner(System.in);	// 사용자가 로또 번호를 입력한다.
		int user[] = new int[6];
		int winCount = 0;
		
		
		// 컴퓨터가 로또번호 45개 추출 //
		for(int i = 0; i < ball.length; i++) {
			ball[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i && i > 0; j++) {	if(ball[j] == ball[i]) i--;	}
		}
		
		
		// 사용자가 로또번호 6개 입력 //
		System.out.println("1부터 45사이의 값을 입력하세요.");
		for(int i = 0; i < ballNum; i++) {
			System.out.println((i+1) + "번째 수를 입력하세요: ");
			user[i] = in.nextInt();
			if(user[i] > 45 || user[i] < 1) {	System.out.println("1부터 45사이의 값을 입력하셔야 합니다.");	i--;	continue;	}
			for(int j = 0; j < i && i > 0; j++) {
				if(user[j] == user[i]) {	System.out.println("같은 수를 입력하시면 안됩니다."); i--;	}
			}
		}	System.out.println();
		
		
		// 컴퓨터의 로또번호와 사용자가 입력한 로또 변호를 비교한다.
		for(int i = 0; i < ball.length; i++) {
			for(int j = 0; j < user.length; j++) {	if(ball[i] == user[j])	winCount++;	}
		}
		
		
		// 화면에 출력하기 전 오름차순 정렬
		for(int i = 0; i < ball.length-1; i++) {
			for(int j = 0; j < ball.length-1-i; j++) {
				if(ball[j] > ball[j+1]) {	int imsi = ball[j];		ball[j] = ball[j+1];	ball[j+1] = imsi;	}
				if(user[j] > user[j+1]) {	int imsi = user[j];		user[j]	= user[j+1];	user[j+1] = imsi;	}
			}
		}
		
		
		// 화면에 출력한다.
		for(int i = 0; i < ball.length; i++) {	System.out.print(ball[i] + ", ");	} 	System.out.println();
		for(int i = 0; i < user.length; i++) {	System.out.print(user[i] + ", ");	}
		System.out.println("맞은 갯수: " + winCount);
	}
}
