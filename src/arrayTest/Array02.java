package arrayTest;

public class Array02 {

	public static void main(String[] args) {
		// 랜덤한 배열 생성 후, 각 배열의 숫자 갯수를 알아내기 		// '배열' 1개, '카운터 변수 n개'
		// 배열갯수 25개, 숫자 범위 0 ~ 24(25개)
		int num = 25;		int room[] = new int[num]; 		int counter[] = new int[num];
		
		for(int i = 0; i < room.length; i++) {
			room[i] = (int)(Math.random()*num);
			System.out.print(room[i] + ", ");
			counter[room[i]]++;										// room[0] 값이 8일때 -> counter[8]의 값이 1씩 증가 - 카운팅이 됨(중요)
		}	System.out.println();
		for(int i = 0; i < room.length; i++) {
			System.out.print(i + "의 갯수: " + counter[i] + ",   ");
		}	System.out.println();
		
		
		//-------------------------------------------------------------------------------------------------------------------------------//
		// 번호 1 ~ 45까지 생성 후 랜덤으로 6개 뽑기				// '로또번호를 저장할 배열' 1개.
		int rottoRoom[] = new int[45];
		
		for(int i = 0; i < rottoRoom.length; i++) {
			rottoRoom[i] += i+1;
			System.out.print(rottoRoom[i] + ", ");
		} 	System.out.println();
		for(int i = 0; i < rottoRoom.length; i++) {
			int n = (int)(Math.random()*rottoRoom.length);
			int imsi = rottoRoom[0];
			rottoRoom[0] = rottoRoom[n];
			rottoRoom[n] = imsi;
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(rottoRoom[i] + ", ");
		}	System.out.println();
		// 위 방법은 단순한 예제로, 배열 45개를 간단하게 섞어버리면 중복된 수가 나올 수 있다.
		
		
		//--------------------------------------------------------------------------------------------------------//
		// 1부터 45까지 랜덤한 정수 중에서 6개의 수 추출하기
		// 배열의 방은 6개만 사용, 중복된 수는 다시 뽑는다.
		int roomT[] = new int[6];
		
		for(int i = 0; i < roomT.length; i++) {
			roomT[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i && i > 0; j++) {
				if(roomT[j] == roomT[i]) i--;
			}	System.out.print(room[i] + ", ");
		} 		System.out.println();
		
		// 추출된 번호를 오름차순으로 정렬한다.
		for(int i = 0; i < roomT.length; i++) {
			for(int j = 0; j < roomT.length-1-i; j++) {
				if(roomT[j] > roomT[j+1]) {
					int 	imsi = roomT[j];
						 roomT[j] = roomT[j+1];
					   roomT[j+1] = imsi;
				}
			}
		}
		
		// 중복되지 않은 6개의 수 추출하기
		for(int i = 0; i < roomT.length; i++) {
			System.out.print(roomT[i] + ", ");
		}
	}
}
