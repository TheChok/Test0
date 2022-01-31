package conTest;

public class CondStar01 {
	public static void main(String[] args) {
		new StarExam02();
		
		} // End - public static void main(String[] args)
	} // End - public class CondStar01

class StarExam01 {
	StarExam01() {
		int lineNumber = 10;
		for(int i = 1; i < lineNumber; i++) {
			for(int j = lineNumber; j > 0; j++) {
				if(j > i)	System.out.println("☆");
				else 		System.out.println("★");
			}
		}
	} // End - StarExam01()
} // End - class StarExam01

class StarExam02 {
	StarExam02() {
		int lineNum = 4;
		for(int i = 0; i < lineNum; i++) {
			for(int j = 0; j < lineNum-1-i; j++) {
				System.out.print("☆");
			}
			for(int j = 0; j < i*2 +1; j++) {
				System.out.print("★");
			} 
			System.out.println();
		}
	} // End - StarExam02()
} // End - class StarExam02

class StarExam03 {
	StarExam03() {
		int lineNum = 4;
		for(int line = 1; line <= lineNum; line++) {
			for(int col = 1; col <= lineNum+line-1; col++) {
				if(col <= lineNum-line) System.out.print("☆");
				else 					System.out.print("★");
			}	
			System.out.println();
		}	
	} // End - StarExam03()
} // End - class StarExam03