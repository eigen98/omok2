package omok;

import java.util.Scanner;

public class Board {
	
	//클래스 들
			//Board -> has a 관계로 스톤넣어짐 컨트롤센터
			//Game -> 여기서는 스톤과 카운터를 쓰면 안 됨 (보드 만으로 핸들링)
			//PreRules -> 3x3 하나라도 막히면 33아님
			//postRules -> 승패 5목만 (보드에 들어가도 됨)
			//counter -> int cnt =0 getcount(), plusCount()
			//stone -> xloc , yloc -- getter setter getx gety
	
	public static int arr[][] = new int[15][15];
	public static int LOC[] = new int[2];

	
	public void wuziPlay() {// while로 게임에서 불러옴
		
		
		Stone one = new Stone();
		Counter.plusCount(); //카운트 증가
		
		Scanner sc = new Scanner(System.in);
		one.setXloc(sc.nextInt());
		one.setYloc(sc.nextInt());
		
		
		
		if(arr[one.getXloc()-1][one.getYloc()-1]!= 0&&one.getXloc()-1<0&&one.getXloc()-1>14&&one.getYloc()-1<0 && one.getYloc()-1 >14) {
			System.out.println("둘 수 없는 곳입니다.");
			Counter.minusCount();
			return;
		}else {
			// 돌이 없을 때 
			//턴이 0일 때 흑돌, 1일 때 백돌
			if(Counter.getTurn()== 0) {
				arr[one.getXloc()-1][one.getYloc()-1] = 1;
			}else {
				arr[one.getXloc()-1][one.getYloc()-1] = -1;
			}
		}
		
		
		for(int i = 0 ; i < 15 ; i++ ) {
			for(int j = 0 ; j < 15 ; j++) {
				if(Board.arr[i][j]==1) {
					System.out.print("●"+ " ");
				}else if(Board.arr[i][j]==-1) {
					System.out.print("○"+ " ");
				}
				else {
					System.out.print(Board.arr[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		
		
		if(Counter.getTurn()==0) {
			Counter.setTurn(1);
		}else {
			Counter.setTurn(0);
		}
		//좌표 리턴
		
		LOC[0] = one.getXloc()-1;
		LOC[1] = one.getYloc()-1;
		
		
	}

}


