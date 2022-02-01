package conTest;

public class CondStar02 {
	public static void main(String[] args) {
		new StarExam05();
	} // End - public static void main(String[] args)
} // End - public class CondStar02

class StarExam04 {
	StarExam04() {
		int lineNum = 4;
		for(int line = 0; line < lineNum; line++) {
			for(int col = 0; col < lineNum - line; col++) {
				System.out.print("★");
			}
			System.out.println();
		}
	} // End - StarExam04()
} // End - class StarExam04

class StarExam05 {
	StarExam05() {
		int lineNum = 5;
		for(int line = lineNum; line > 0; line--) {
			for(int col = lineNum; col > 0; col--) {
				if(line < col) 	System.out.print(" ");
				else 			System.out.print("★");
			}
			System.out.println();
		}
	} // End - StarExam05()
} // End - class StarExam05
