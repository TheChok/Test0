package conTest;

public class Cond01 {
	public static void main(String[] args) {
		// String msg와 switch문의 결합을 이해하자.
		int score = (int)(Math.random() * 10) +1;
		score *= 100;
		
		String msg = "당신의 점수는 " + score + "점이고, 상품은 ";	// String 문자열 전체가 msg 변수로 선언된다.
									  // msg 문자열 마지막 "상품은 " 뒷부분은 switch 문으로 연결한다.
			switch(score) {
				case 100:
					msg += "연필";		break;
				case 200:
					msg += "지우개";	break;
				case 300:
					msg += "필통";		break;
				case 400:
					msg += "실내화";	break;
				case 500:
					msg += "가방";		break;
				case 600:
					msg += "자전거";	break;
				case 700:
					msg += "노트북";	break;
				case 800:
					msg += "자동차";	break;
				default:
					System.out.println("다음 기회에.....");
					msg += "꽝";
			}	// msg 변수에 += 연산을 이용해서 문자열을 추가해준다.
		System.out.println(msg + "입니다.");

	} // End - public static void main(String[] args)
} // End - public class Cond01
