package omok;

public class PostRules {
	// 최근에 둔 좌표 호출
	int lastlocX = Board.LOC[0];
	int lastlocY = Board.LOC[1];
	
	
	
	
	int ymx = Board.arr[lastlocX][lastlocY];
	
	public static boolean  keep = true;
	

	public void whoWin() {
		if(Counter.getCount()%2==0) {
			System.out.println(" 흑돌이 승리했습니다");
		}else {
			System.out.println(" 백돌이 승리했습니다");
		}
		
	}
	
	public void showWinner() {
		
	
		int sign = 0;

		
		// 검사 (가로 세로 , 대각선 두개)
		
//		
		
		for(int j = 0 ; j<11 ; j++) {
			int count=0;
			
			int garo = Board.arr[lastlocX][lastlocY];
			// 흑돌 = 1 , 백돌 = -1 
			if(garo == 1) {//흑돌일때
				for(int i = 0 ; i<5 ; i++) {
					
					garo *=Board.arr[i + j][lastlocY];
					count++;
					if(Board.arr[i + j][lastlocY] == -1) { // 백돌이나오는 경우 초기화
						count =0;
						break;
					}
				
				}
			}
			
			if(garo == -1) {// 백돌일 때
				for(int i = 0 ; i<5 ; i++) {
					
					garo *=Board.arr[i + j][lastlocY];
					count++;
					if(Board.arr[i + j][lastlocY] == 1) {// 흑돌이 나오는 경우 초기화
						count = 0;
						break;
					}
				
				}
			}
			
			if(garo==1 && count==5) {// 모두 곱한 값이 1이 나오고 5개인 경우 승리조건 만족
				
				//누가 이겼는지
				whoWin();
				sign ++;
				keep = false;
				break;
			}
		}
		
		
		//세로
		for(int j = 0 ; j<11 ; j++) {
			int count = 0;
			int sero = Board.arr[lastlocX][lastlocY];
			
			if(sero == 1) {//흑돌일때
				for(int i = 0 ; i<5 ; i++) {
					
					sero *=Board.arr[lastlocX ][i +j];
					count++;
					if(Board.arr[lastlocX ][i +j] == -1) { // 백돌이나오는 경우 초기화
						count =0;
						break;
					}
				
				}
			}
			
			
			
			if(sero == -1) {//흑돌일때
				for(int i = 0 ; i<5 ; i++) {
					
					sero *=Board.arr[lastlocX ][i +j];
					count++;
					if(Board.arr[lastlocX ][i +j] == +1) { // 백돌이나오는 경우 초기화
						count =0;
						break;
					}
				
				}
			}

			if(sero==1 && count==5) {// 모두 곱한 값이 1이 나오고 5개인 경우 승리조건 만족
				
				//누가 이겼는지
				whoWin();
				sign ++;
				keep = false;
				break;
			}
		}
		
		
		
		loof1 : for(int j = 0 ; j<5 ; j++) {	
			int count = 0;
			int ypx = Board.arr[lastlocX][lastlocY];
			
			if(Board.arr[lastlocX][lastlocY]==1) {
				for(int i = -4 ; i<1 ; i++) {
					
					if(lastlocX + i - j >=0 && lastlocY - i + j>=0 && lastlocX + i - j <15 &&  lastlocY - i + j < 15) {//모서리 처리
						ypx *=Board.arr[lastlocX + i + j ][lastlocY + i + j];
						count ++;
						if(Board.arr[lastlocX + i + j ][lastlocY + i + j]==-1) {
							count =0 ;
							break;
						}
						
						if(count==5 && ymx==1) {
							whoWin();
							sign ++;
							keep = false;
							break loof1;
						}
					}else {
						count = 0;
						break;
						
					}
					
				}
			}
			if(Board.arr[lastlocX][lastlocY]==-1) {
				for(int i = -4 ; i<1 ; i++) {
					
					if(lastlocX + i - j >=0 && lastlocY - i + j>=0 && lastlocX + i - j <15 &&  lastlocY - i + j < 15) {//모서리 처리
						ypx *=Board.arr[lastlocX + i + j ][lastlocY + i + j];
						count ++;
						if(Board.arr[lastlocX + i + j ][lastlocY + i + j]==1) {
							count =0 ;
							break;
						}
						
						if(count==5 && ymx==1) {
							whoWin();
							sign ++;
							keep = false;
							break loof1;
						}
					}else {
						count = 0;
						break;
						
					}
					
				}
			}
			
			
			
					
				
				
			
		}
			
			
		loof2 : for(int j = 0 ; j<5 ; j++) {	
			int count = 0;
			int ymx = Board.arr[lastlocX][lastlocY];
			
			
			if(Board.arr[lastlocX][lastlocY]==1) {
				for(int i = -4 ; i<1 ; i++) {
					
					if(lastlocX - i + j >=0 && lastlocY + i - j>=0 && lastlocX - i + j <15 && lastlocY + i - j < 15) {//모서리 처리
						ymx *=Board.arr[lastlocX - i + j ][lastlocY + i - j];
						count ++;
						if(Board.arr[lastlocX - i + j ][lastlocY + i - j]==-1) {
							count =0 ;
							break;
						}
						
						if(count==5 && ymx==1) {
							whoWin();
							sign ++;
							keep = false;
							break loof2;
						}
					}else {
						count = 0;
						break;
						
					}
					
				}
			}
			
			if(Board.arr[lastlocX][lastlocY]==-1) {
				for(int i = -4 ; i<1 ; i++) {
					
					if(lastlocX - i + j >=0 && lastlocY + i - j>=0 && lastlocX - i + j <15 && lastlocY + i - j < 15) {//모서리 처리
						ymx *=Board.arr[lastlocX - i + j ][lastlocY + i - j];
						count ++;
						if(Board.arr[lastlocX - i + j ][lastlocY + i - j]==1) {
							count =0 ;
							break;
						}
						
						if(count==5 && ymx==1) {
							whoWin();
							sign ++;
							keep = false;
							break loof2;
						}
					}else {
						count = 0;
						break;
						
					}
					
				}
			}
			
					
				
				
			
		}
			
		
		
		if(sign > 0) {
			PostRules.keep = false;
		}
		
		
		
		
		
	}

	
}
