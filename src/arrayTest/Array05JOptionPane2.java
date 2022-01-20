package arrayTest;

import javax.swing.JOptionPane;

public class Array05JOptionPane2 {
	public static void main(String[] args) {
		testJOptionPane3 tj3 = new testJOptionPane3();
	} 
}
class testJOptionPane3 {
	testJOptionPane3() {
		// 인덱스 번호 2개를 입력받아 서로 바꾸되, 인덱스 범위(0 ~ 9)를 넘어가면 입력을 다시 받아야 한다.
		int arr3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("변경할 인덱스 번호를 입력하십시오(0 ~ 9 범위)");
		boolean flag = true;	// while 문에서 쓰일 변수
		int choice1 = 0, choice2 = 0;
		
		// 인덱스 번호 2개를 입력받는 부분
		while(flag) {
			choice1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 인덱스 번호를 입력하세요."));
			if(choice1 < 0 && choice1 > 9) {
				System.out.println("범위를 벗어났습니다. \n 다시 입력하세요");	continue; // 값 무시하고 처음부터△ 
			}	else flag = false;	// 첫번째 while 문을 벗어남. ↓↓↓↓
		}	flag = true;	// 두번째 while문으로 진입			 ↓↓↓↓				
		while(flag) {
			choice2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 인덱스 번호를 입력하세요."));
			if(choice2 < 0 && choice2 > 9) {
				System.out.println("범위를 벗어났습니다. \n 다시 입력하세요");	continue; // 값 무시하고 처음부터△
			}	else flag = false;	// 두번째 while 문을 벗어남. ↓↓↓↓
		}
		
		// 입력받은 방의 값을 교환
		int temp = arr3[choice1];		arr3[choice1] = arr3[choice2];		arr3[choice2] = temp;
		
		String msg = "";
		for(int i = 0; i < arr3.length; i++) {	msg += arr3[i] + ", ";	}
		
		JOptionPane.showInputDialog(msg);
	}
}