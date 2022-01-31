package conTest;

public class Cond03 {
	public static void main(String[] args) {

	} // End - public static void main(String[] args)
} // End - public class Cond03

//-- class sSum --//
class MinusSum {
	MinusSum() {
		// 1 + (-2) + 3 + (-4) + 5 + ............과 같이 계속 더해갔을 때
		// 몇 번째에서 100이상이 되는지 구해보세요.
		int num, sum = 0;	int s = 1;
		
		for(int i = 1; true; i++, s = -s) {
			num = s * i;
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println("num : " + num + ", sum: " + sum);
	} // End - sSum()
} // End - class sSum

//-- class Dice --//
class DiceExam {
	DiceExam() {
		// 2개의 주사위를 던졌을 때 눈의 합이 6이 되는 경우의 수를 구해보자.
		// 1+5, 2+4, 3+3, 4+2, 5+1
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 6) System.out.println(i + " + " + j + " = " + (i+j));
			}
		}
	} // End - DiceExam()
} // End - class DiceExam