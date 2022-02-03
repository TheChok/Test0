package conTest;

public class CondStar03 {
	public static void main(String[] args) {
		new StarExam06();
	} // End - public static void main(String[] args)
} // End - public class CondStar03

class StarExam06 {
	StarExam06() {
		int lineNum = 5;
		for(int line = 0; line < lineNum; line++) {
			for(int col = 0; col < lineNum; col++) {
				if(line <= lineNum / 2) {			 // 윗부분
					if(line+col <= lineNum / 2 - 1) 	 System.out.print(".");
					else if(col-line >= lineNum / 2 + 1)	 System.out.print("_");
					else 					 System.out.print("★");
				} else if(line > lineNum / 2) {			 // 아랫부분
					if(line-col >= lineNum / 2 + 1)		 System.out.print(".");
					else if(line+col >= lineNum / 2 * 3 + 1) System.out.print("_");
					else					 System.out.print("★");
				}
			} System.out.println();
		} // for(int line)
	} // End - StarExam06()
} // End - class StarExam06

class StarExam07 {
	StarExam07() {
		int lineNum = 5;
		for(int line = 0; line < lineNum; line++) {
			for(int col = 0; col < lineNum; col++) {
				if(line <= lineNum/2) {						     // 윗부분
					if((line+col <= lineNum/2-1) ||(col-line >= lineNum/2+1))    System.out.print("_");
					else							     System.out.print("★");
				} else if(line > lineNum/2) {					     // 아랫부분
					if((line-col >= lineNum/2+1) || (line+col >= lineNum/2*3+1)) System.out.print("_"); 
					else							     System.out.print("★");
				}
			} System.out.println();						
		} // for(int line)
	} // End - StarExam07()
} // End - class StarExam07
