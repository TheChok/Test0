package variable;

public class Vari03 {

	public static void main(String[] args) {
		// Byte Overflow
		byte b = 0; // byte형 변수 b를 선언하고 0으로 초기화 한다.
		int  i = 0; // int 형 변수 i를 선언하고 0으로 초기화 한다.
		
		// 반복문을 사용하여 b의 값을 1씩 0부터 270까지 증가시킨다.
		for(int x = 0; x <= 270; x++) {
				// for 반복문을 이용해서 - x는 for 변수의 이름일뿐 -  증가된 숫자의 최대치를 270로 설정했다.
				// 아래는 for 반복문의 중괄호 안에서 각기 다른 변수를 입력하였다.
			System.out.print(b++);
			System.out.print('\t');
			System.out.println(i++);
				// byte로 설정한 값과 int로 설정한 값이 1씩 늘어날때의 차이를 비교해보자.
				// byte는 127 이후 -128에서 수가 줄어든다.
				// int는 127 이후에도 수가 정수로 증가한다. 함수별로 표현할 수 있는 수의 크기가 다르기 때문.
		}

	}

}
