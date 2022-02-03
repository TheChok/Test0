package conTest;

public class CondStar04 {
	public static void main(String[] args) {
		new StarExam10();

	} // End - public static void main(String[] args)
} // End - public class CondStar04

class StarExam08 {
	StarExam08() {
		int lineNumber = 5;
		for(int line = lineNumber; line >= 1; line--) {		// 역삼각형부분
			for(int col = 0; col < lineNumber-line; col++)	{System.out.print("_");}	 // 빈공간을 만들고
			for(int k = 1; k < line * 2; k++) 		{System.out.print("★");}	// ★을 이어 붙인다.
			System.out.println();
		}
		for(int line = 1; line <= lineNumber; line++) {		// 정삼각형부분
			for(int col = 1; col <= lineNumber-line; col++)	{System.out.print("_");}	 // 빈공간을 만들고
			for(int col = 1; col <= line * 2 - 1; col++) 	{System.out.print("★");}	// ★을 이어 붙인다. 
			System.out.println();
      	}
	} // End - StarExam08()
} // End - class StarExam08

class StarExam09 {
	StarExam09() {
		int lineNumber = 5;
		for(int row = 0; row < lineNumber; row++) {
			for(int col = 0; col < lineNumber; col++) {
				if(row == col)				System.out.print("★");	// 대각선1
				else if(row+col == lineNumber-1)	System.out.print("★");	// 대각선2
				else					System.out.print(" ");	 // 빈공간
			} System.out.println();
		}
	} // End - StarExam09()
} // End - class StarExam09

class StarExam10 {
	StarExam10() {
		int lineNumber = 5;
		for(int row = 0; row < lineNumber; row++) {
			for(int col = 0; col < lineNumber; col++) {
				if((row == col) || (row+col == lineNumber-1))	System.out.print("★");	// 대각선1, 대각선2
				else						System.out.print(" ");	// 나머지 빈공간.
			} System.out.println();
		}
	} // End - StarExam10()
} // End - class StarExam10
