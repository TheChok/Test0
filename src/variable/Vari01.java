package variable;

public class Vari01 {

	public static void main(String[] args) {

		int x;     // 선언
		x = 10;    // 초기화
		int y = 3; // 선언과 동시에 초기화한다.

		System.out.println("더하기 값은 => " + x + y); // 괄호를 씌우지 않으면 문자처럼 x뒤에 y값을 이어붙인다.
		System.out.println("더하기 값은 => " + (x + y)); // 수식에 괄호를 씌우면 정상적으로 연산처리된다.
		System.out.println("빼기의 값은 => " + (y - x)); // 괄호를 씌운 빼기도 마찬가지
		System.out.println("곱하기 값은 => " + (x * y)); // 곱하기도 괄호를 씌우니 연산이 된다.
		System.out.println("나누기 값은 => " + (x / y)); // 나누기의 값은 / 연산으로 한다.
		System.out.println("나누기 나머지 => " + (x % y)); // 나누기의 나머지를 알고 싶을 때는 % 연산으로.
	}

}
