package arrayTest;

public class Array04Arraycopy {
	public static void main(String[] args) {
		// arraycopy 함수에 대해서 알아보자
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};	// 값을 입력할땐 중괄호
		
		// 배열 abc와 num을 붙여서 새로운 배열을 만들자.
		char result[] = new char[abc.length + num.length];			// 방의 갯수를 입력할땐 대괄호
		// System.arraycopy(복사위치, 복사시작지점, 붙여넣기위치, 붙여넣을시작위치, 길이);
		System.arraycopy(abc, 0, result, 0, abc.length);			// abc에 있는 내용을 붙여넣기하고
		System.arraycopy(num, 0, result, abc.length, num.length);		// num에 있는 내용도 붙여넣기 한다 (2번 작업)
		
		// 결과 확인
		for(int i = 0; i < result.length; i++) {	System.out.print(result[i] + ", ");	}
		System.out.println();
		// 동전 바꾸기 복습용 ------------------------------------------------------------------------------------------//
		CoinExchangeTest ce = new CoinExchangeTest();
	}
}
class CoinExchangeTest {
	CoinExchangeTest() {	// 12번 예제 코인교환 복습용
		// 소지한 돈을 동전이 큰 단위부터 거슬렀을 때 교환하고 남은 동전의 갯수를 구하시오.
		int myMoney = 4970;		int coinUnit[] = {500, 100, 50, 10}, 	coin[] = {5, 5, 5, 5};
		System.out.println("소지하고 있는 액수: " + myMoney);
		
		// 돈을 500원으로 나눈 숫자 = 코인, 코인을 5개 줄였으면 남은 돈을 100, 50, 10 순으로 나누면서 코인을 줄여나간다.
		for(int i = 0; i < coin.length; i++) {
			int num = myMoney/coinUnit[i]; 			// 가지고 있는 동전으로 바꿀 수 있는지 확인해야 한다.
			if(coin[i] >= num) 	coin[i] -= num;		// 동전갯수가 충분하면 num만큼 뺀다.
			else {	num = coin[i]; coin[i] = 0;	}	// 동전갯수가 부족하면 num을 5로 바꾸고 코인갯수는 0으로 바꾼다.
			myMoney -= num*coinUnit[i];			// 소지금액에서 (동전단위 * num) 만큼 차감한다.
			System.out.println(coinUnit[i] + "원을 " + num + "개 바꾸었습니다.");
		}	System.out.println();
		
		if(myMoney > 0) System.out.println("동전으로 교환하고 남은 돈: " + myMoney);
		for(int i = 0; i < coin.length; i++) {	System.out.println(coinUnit[i] + "원의 갯수: " + coin[i] + "개");	}
	};
}
