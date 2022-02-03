package arrayTest;

import javax.swing.JOptionPane;

public class Array05JOptionPane1 {
	public static void main(String[] args) {
		testJOptionPane1 tj1 = new testJOptionPane1();
		testJOptionPane2 tj2 = new testJOptionPane2();
	} 
}
class testJOptionPane1 {
	testJOptionPane1() {
		// JOptionPane.showInputDialog 예제 1번.
		// arr 배열은 값이 입력된 상태. 인덱스 번호를 입력받아서 각 방의 값을 변경.
		int arr1[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
			
		// int index = Integer.parseInt(JOptionPane.showInputDialog()); - 팝업 창에 입력한 값을 int index에 저장한다.
		// Integer.parseInt() <- 입력한 문자열을 Integer 형으로 반환해주는 함수.
		int index = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 배열의 인덱스 번호를 입력하세요."));
		int value = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요."));
			
		System.out.println("인덱스: " + index + ", 값: " + value);		arr1[index] = value;	// <- 해당 인덱스 방을 value 값으로 바꿔주는 작업.
		// 배열 확인
		for(int i = 0; i < arr1.length; i++) {	System.out.println(i + "번째 방의 값: " + arr1[i]);	}	System.out.println();
	}
}
class testJOptionPane2 {
	testJOptionPane2() {
		// JOptionPane.showInputDialog 예제 2번.
		// arr 배열은 값이 입력된 상태. 인덱스 번호를 2개 입력받아서 각 방의 값을 바꾼다.
		int arr2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int index1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 인덱스 번호를 입력하세요."));
		int index2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 인덱스 번호를 입력하세요."));
		
		int temp = arr2[index1];	arr2[index1] = arr2[index2];	arr2[index2] = temp;	   // <- 인덱스 방을 서로 바꿔주는 작업.
		// 배열 확인
		String msg = "";
		for(int i = 0; i < arr2.length; i++) {	msg += arr2[i] + ", ";	}
		JOptionPane.showMessageDialog(null, msg);
	}
}
