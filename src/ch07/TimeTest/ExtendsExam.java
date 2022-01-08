package ch07.TimeTest;

public class ExtendsExam {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();		// 실제 인스턴스가 무엇인지가 중요. <- 객체가 만들어져있음.
		FireEngine fe2 = null;					// 실제 인스턴스가 무엇인지가 중요. <- 객체가 없음 null상태이면 null Exception 발생함.
//		FireEngine fe3 = (FireEngine) car;		* 중요 : 컴파일 에러는 나지 않는다. 하지만 형변환실행에러 ClassCastException이 발생한다!!
		
		fe.water();
		car = fe;	// car = (Car)fe;에서 형변환이 생략됨
//		car.water;
		fe2 = (FireEngine)car;	// 자손타입 <- 조상타입. 형변환 생략 불가
		fe.water();
		
		Car c1 = new Car();
		
		System.out.println("c1 instanceof FireEngine : " + (c1 instanceof FireEngine)); // 괄호 안씌우면 에러발생
		
	}

}



class Car {
	String color;
	int door;
	Car() {	
		this("0", 0);
	}
	Car(String x, int y) {		color = x;		door = y;		}
	
	void drive() {	// 운전하는 기능;
		System.out.println("drive, Brrrrr~");
	}
	void stop() {	// 멈추는 기능;
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	FireEngine() {	super("0", 0);		}
	FireEngine(String x, int y) {		super.color = x;		super.door = y;		}
	void water() {	// 물을 뿜는 기능;
		System.out.println("water~~~!");
	}
}