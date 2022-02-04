package arrayPlus;

import java.util.Scanner;

public class RockPaperscissors {
	public static void main(String[] args) {
		// 컴퓨터와 하는 가위바위보 게임
		Scanner sc = new Scanner(System.in);
		String	 player, computer;		    boolean exitFlag = true;		
		String[] sArr = {"가위", "바위", "보"};	int[] score = new int[3];
		
		// 게임 시작 - 사용자 선택 => 컴퓨터 선택 => 판정 => 반복(종료).
		while(exitFlag) {
			System.out.println("가위, 바위, 보 중에 하나를 입력하십시오(종료를 입력하면 게임이 종료됩니다.)");
			player = sc.nextLine();		// player 변수에 저장할 문자열이 입력된다. (사용자 선택)
			
			// 장치1 - 가위, 바위, 보, 종료가 아닌 문자열이 입력될 경우 다시 입력한다.
			// 장치2 - 종료를 입력하면 exitFlag를 false로 바꾸고 반복문 밖으로 빠져나간다.
			if(!player.equals("가위") && !player.equals("바위") && !player.equals("보") && !player.equals("종료")) {	continue;	}
			else if(player.equals("종료")) {		exitFlag = false; 		continue;		}	
			
			computer = sArr[(int)(Math.random() * sArr.length)];	// 컴퓨터의 가위, 바위, 보를 정한다. (컴퓨터 선택)
			System.out.println("컴퓨터 : " + computer);

			// 판정 - 입력된 값은 가위, 바위, 보, 종료 4가지.
			if(player.equals("가위")) {		// 플레이어 "가위"
				if(computer.equals("가위"))      { System.out.println("무승부");	 score[1]++; } // score[1] 무승부
				else if(computer.equals("바위")) { System.out.println("컴퓨터 승");	score[2]++; } // score[2] 컴퓨터 승
				else if(computer.equals("보")) 	{ System.out.println("플레이어 승");	score[0]++; } // score[0] 플레이어 승
			} else if(player.equals("바위")) {   	// 플레이어 "바위"
				if(computer.equals("가위"))      { System.out.println("플레이어 승"); score[0]++; }
				else if(computer.equals("바위")) { System.out.println("무승부");	 score[1]++; }
				else if(computer.equals("보")) 	{System.out.println("컴퓨터 승");	 score[2]++; }				
			} else if(player.equals("보")) {	 	// 플레이어 "보"	
				if(computer.equals("가위"))      { System.out.println("컴퓨터 승");   score[2]++; }
				else if(computer.equals("바위")) { System.out.println("플레이어 승"); score[0]++; }
				else if(computer.equals("보")) 	{ System.out.println("무승부");	  score[1]++; }				
			} else if(player.equals("종료")) {
				exitFlag = false;		   continue; // "종료" - exitFlag를 false로 바꾸고 반복문을 벗어난다.			
			} else {
				System.out.println("가위, 바위, 보 중 하나를 입력하셔야 합니다.");
				System.out.println("종료를 입력하면 프로그램이 끝납니다."); // 오류확인용
			}
			// 게임 현황을 보여준다.
			System.out.println("현재 사용자의 전적은  " + score[0]+"승 " + score[1]+"무 " + score[2]+"패  입니다.");
		}
		System.out.println("이용해주셔서 감사합니다.");
	} // End - public static void main(String[] args)
} // End - public class RockPaperscissors
