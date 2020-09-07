package omok;

public class Counter {
	private static int cnt = 0; //(돌 개수)함수로 호출할 때마다 다른 인스턴스가 생성될 필요 없도록
	private static int turn = 0;//(차례) 
	
	public static int getCount(){
		return cnt;
	}
	public static void minusCount() {
		cnt--;
	}
	
	public static void plusCount() {
		cnt++;
	}

	public static int getTurn() {
		return turn;
	}

	public static void setTurn(int turn) {
		Counter.turn = turn;
	}
	

}
