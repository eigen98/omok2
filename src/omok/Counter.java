package omok;

public class Counter {
	private static int cnt = 0; //(�� ����)�Լ��� ȣ���� ������ �ٸ� �ν��Ͻ��� ������ �ʿ� ������
	private static int turn = 0;//(����) 
	
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
