package arrayPlus;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		new ScannerPlusTest();
	}
}

class  ScannerPlusTest {
	ScannerPlusTest() {
	// 스캐너 기능을 이용해서 간단한 게임을 만든다.
	// (Scanner)in.nextInt();와 (Random)r.nextInt();의 차이를 구분하면서 보자
	//-- 필요한 변수 --//
	Scanner in  = new Scanner(System.in);
	Random	r   = new Random();
	int[]	com = new int[3];	int[] user = new int[3];
	int strike = 0, ball = 0, count = 0;
	boolean	exitFlag = true;
	
		while(exitFlag) {
			// 시작 전, 컴퓨터가 랜덤한 숫자를 3개 뽑는다(1~9) -- 랜덤한 숫자를 고르는 법은 2가지가 있지만 1개만 만든다.
			com[0] = r.nextInt(9) + 1;	com[1] = r.nextInt(9) + 1;
			while(com[0] == com[1]) {	com[1] = r.nextInt(9) + 1;	}
			com[2] = r.nextInt(9) + 1;
			while(com[0] == com[2]) {	com[2] = r.nextInt(9) + 1;	}
	
			// 준비가 끝났으면 게임을 시작한다.
			strike = 0;	ball = 0;	// 학원에서는(strike = 0; ball = 0;) 부분이 while(true) 밑에 있었는데.. 게임이 오래 걸려서 위로 올림.  
			while(true) {
				// 유저가 임의의 숫자를 3개 입력한다. //
				for(int i = 0; i < user.length; i++) {
					System.out.print((i+1) + "번째 수를 입력하십시오: ");	user[i] = in.nextInt();
					if(user[i] < 1 || user[i] > 9) { System.out.println("1부터 9 사이의 값을 입력하세요.");	i--;	continue; }
				}	count++;	System.out.println("게임 횟수: " + count);
				if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) { System.out.println("똑같은 값이 입력되었습니다.");	continue; }
								
				// 정답을 판별한다. //
				for(int i = 0; i < user.length; i++) {
					if(com[i] == user[i]) 	strike++;
					else			ball++;
				}
				
				// 3개를 모두 맞추면 프로그램을 종료한다. //
				if(strike >= 3) {
					System.out.println("홈런입니다.");
					System.out.println("게임을 종료하시려면 0을, 계속하시려면 아무 숫자나 입력하세요: ");
					if(in.nextInt() == 0)	{ exitFlag = false; }
					break;
				} else {
					System.out.println("컴퓨터의 값... 첫 번째: " + com[0] + " 두 번째: " + com[1] + " 세 번째: " + com[2]);
					System.out.println("사용자의 값... 첫 번째: " + user[0] + " 두 번째: " + user[1] + " 세 번째: " + user[2] + "\n");
					System.out.println(strike + " 스트라이크, " + ball + " 볼 \n");
					}
			}
		} // End - while(exitFlag) 
	} // End - ScannerPlusTest() - 기본생성자
} // End - class  ScannerPlusTest
