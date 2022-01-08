package ch07;




class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10);
	}
}

class Tv1 extends Product {
	Tv1 () {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer () {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

//class SuperComputer extends Computer {
//	SuperComputer() {
//		super(500);		// 부모의 부모(조부모)는 super()를 사용할 수 없다.
//	}
//	public String toString() {
//		return "SuperComputer";
//	}
//}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product cart[] = new Product [10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족"); return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 을/를 구입하셨습니다.");
		cart[i++] = p;
	}
}

public class DaHSExam {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만 원입니다.");
		System.out.println("보너스포인트는 " + b.bonusPoint + "점입니다.");

		

	}

}
