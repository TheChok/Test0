package variable;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.로그인 2.회원가입 3.종료");
		System.out.print("번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
			case 1:
				System.out.println("로그인 메뉴입니다.");
				System.out.println("아이디를 입력하세요");
				System.out.print("아이디 : ");
				String id = sc.next();
				
				if (id.equals("abc")) {
						System.out.println("비밀번호를 입력하세요");
						System.out.print("비밀번호 : ");
						String pw = sc.next();
						
						if(pw.equals("1234")) {
								System.out.println("로그인이 되었습니다.");
						} else {
								System.out.println("비밀번호가 틀렸습니다.");
					
						}
					
				} else {
						System.out.println("아이디가 존재하지 않습니다.");
				}
			break;

			case 2:
			break;

			case 3:
			break;

			default:
				
		
		
		}

sc.close();

						
		

	} // End of public static void main(String[] args)

} // End of public class test1
