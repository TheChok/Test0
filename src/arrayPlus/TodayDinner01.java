package arrayPlus;

public class TodayDinner01 {
	public static void main(String[] args) {
		// 컴퓨터가 추천하는 저녁 메뉴
		String[] menu = {
			"김치찌개", "볶음밥", "짜장면", "동태탕", "회덮밥",
			"부대찌개", "설렁탕", "돈까스", "대구탕", "컵라면"
		};
		
		int num = 0;
		
		// 저녁식사 메뉴를 랜덤으로 추천하자!
		// num = (int)(Math.random() * menu.length);
		// System.out.println("오늘의 추천 저녁식사는 " + menu[num] + "입니다.");
		
		System.out.println("오늘의 추천 저녁식사는 " + menu[(int)(Math.random() * menu.length)] + "입니다.");
		
	} // End - public static void main(String[] args)
} // End - public class TodayDinner01
