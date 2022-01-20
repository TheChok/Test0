package calculatorExam;

import java.util.Scanner;

public class CalculatorDoWhile {
	public static void main(String[] args) {
		// 멤버변수 //
		Scanner in = new Scanner(System.in);
		float num1 = 0, num2 = 0;
		String oper = "", con = "";
		boolean exitFlag;
		
		// 실행부분 (외부 do ~ while ) //
		do {
			System.out.println("첫번째 숫자: ");
			num1 		= in.nextFloat();
			exitFlag 	= true;
			
			// (내부 do ~ while) //
			do {				
				System.out.println("연산자 입력: ");
				oper	= in.next();

				switch(oper) {
					case "+":
					case "-":
					case "/":
					case "*":
						exitFlag	= false;	break; // in.next(); 값이 +, -, /, * 이면 
													   // exitFlag를 false로 돌려서 두번째 do ~ while 문을 벗어날 준비를 하고 break;로 switch문을 종료시킨다. 
						default : System.out.println("연산자를 다시 입력해주세요.\n");	// 해당하지 않는 값이 입력되면 do 이후에 while 부분에서 exitFlag가 true이므로 다시 반복된다.
				}
							
			} while(exitFlag); // eixtFlag가 true값이면 do를 반복, false값이면 두번째 do ~ while 문을 벗어난다. ▼ 아래로 이동 ▼ 
			// (내부 do ~ while) 종료 //
			
			System.out.println("두번째 숫자: ");
			num2 	= in.nextFloat();
				// 첫번째 switch문은 연산입력 부호가 맞게 입력됐는지 확인하기 위한 것이고,
				// 두번째 switch문은 num1, oper, num2가 입력이 된 상태이므로 연산 결과를 출력해주기 위해 사용한다. 
				switch(oper) {
					case "+": System.out.println(num1 + num2); break;	// 각각의 연산에 해당하는 값을 보여준 후에는 개별적으로 break;를 입력한다.
					case "-": System.out.println(num1 - num2); break;
					case "/": System.out.println(num1 / num2); break;
					case "*": System.out.println(num1 * num2); break;	// 기본적인 연산은 프로그램에 기본으로 되어있거나 CPU에서 처리한다.
						default : System.out.println("처음부터 다시 입력하세요"); continue;
				}
			// 연산을 끝내고 이후 행동을 묻는다. //
			System.out.println("계산을 계속하려면 y 또는 Y를 입력하십시오.");
			System.out.println("프로그램을 종료하려면 아무값이나 입력하십시오.");
			con = in.next();
			if(con.equals("y") || con.equals("Y"))		continue;
			else 										System.out.println("프로그램을 종료합니다."); break;
			
		} while(true);
		// (외부 do ~ while 종료) //
		in.close(); // Scanner 기능 종료.
		
	} // End - public static void main(String[] args)
	
} // End - public class CalculatorScanner
