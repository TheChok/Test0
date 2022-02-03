package arrayTest;

import javax.swing.JOptionPane;

public class Array05JOptionPane4 {
	public static void main(String[] args) {
		testJOptionPane4 tj4 = new testJOptionPane4();
	} 
}
class testJOptionPane4 {
	testJOptionPane4() {
		// 양의 정수 10개를 배열에 저장하고, 그 중에서 3의 배수만 출력
		int[] 	arr4 = new int[10];
		int	num = 0;
		
		System.out.println("양의 정수 10개를 입력하세요");
		for(int i = 0; i < arr4.length; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "번째"));
			if(num < 1) i--;
			else arr4[i] = num;
		}

		// 저장된 방을 오름차순으로 정렬
		for(int i = 0; i < arr4.length-1; i++) {
			for(int j = 0; j < arr4.length-1-i; j++) {
				if(arr4[j] > arr4[j+1]) { //왼쪽값이 크면 값을 오른쪽으로 밀어낸다.
					int imsi = arr4[j];	 arr4[j] = arr4[j+1];	  arr4[j+1] = imsi;
				}
			}
		}
		// 입력된 값 출력
		System.out.println("입력된 값");
		for(int i :arr4) {
			if(i == arr4.length-1)	System.out.print(arr4[i]);
			else 			System.out.print(arr4[i] + ", ");
		}	System.out.println();
		
		System.out.println("3의 배수는?");
		for(int i : arr4) {
			if(arr4[i] % 3 == 0)	System.out.print(arr4[i] + "  ");
		}	System.out.println();
	}
}
