package variable;

public class Vari02 {

	public static void main(String[] args) {
		// 문자열 변수
		char x = 'a'; // char 명령어는 오직 한 글자만 입력 가능하다.
		// char y = 'ab'; - char 명령어 입력 후 한 글자 이상을 입력하면 오류표시가 뜬다.
		 
		String a = "abc";
		String b = 7 + "aaa";
		String c = " " + 7;
		String d = 7 + " ";
		String e = "" + 7;
		String f = " " + " ";
		String g = 7 + 7 + " "; // 숫자가 먼저 입력되면 연산 - 14가 된다.
		String h = " " + 7 + 7; // 문자가 먼저 입력되면 문자로 인식 - 77이 된다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
