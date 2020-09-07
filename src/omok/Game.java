package omok;

public class Game {
	public static void main(String []args) {
		

		Board board = new Board();
		
		for(int i = 0 ; i < 15 ; i++ ) {
			for(int j = 0 ; j < 14 ; j++) {
				board.arr[i][j] = 0;
				System.out.print(board.arr[i][j] +" ");
			}
			System.out.println();
		}
		
		
		while(PostRules.keep) {
			board.wuziPlay();
			PostRules postrules = new PostRules();
			postrules.showWinner();
			
			
		}
	}

}
