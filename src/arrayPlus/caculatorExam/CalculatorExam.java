package arrayPlus.caculatorExam;

public class CalculatorExam {
	public static void main(String[] args) {
		Calc calc = new Calc();
		int result1 = calc.plus(10, 3);
		int result2 = calc.minus(10, 3);
		int result3 = calc.multiply(10, 3);
		int result4 = calc.divide(10, 3);
		System.out.println("더하기 : " + result1);
		System.out.println("빼  기 : " + result2);
		System.out.println("곱하기 : " + result3);
		System.out.println("나누기 : " + result4);
	}
}

class Calc {
	Calc() {}
	int plus(int num1, int num2) 	 {	return	num1 + num2;	}
	int minus(int num1, int num2) 	 {	return	num1 - num2;	}
	int multiply(int num1, int num2) {	return	num1 * num2;	}
	int divide(int num1, int num2) 	 {	return	num1 / num2;	}
}


