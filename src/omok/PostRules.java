package omok;

public class PostRules {
	// �ֱٿ� �� ��ǥ ȣ��
	int lastlocX = Board.LOC[0];
	int lastlocY = Board.LOC[1];
	
	
	
	
	int ymx = Board.arr[lastlocX][lastlocY];
	
	public static boolean  keep = true;
	

	public void whoWin() {
		if(Counter.getCount()%2==0) {
			System.out.println(" �浹�� �¸��߽��ϴ�");
		}else {
			System.out.println(" �鵹�� �¸��߽��ϴ�");
		}
		
	}
	
	public void showWinner() {
		
	
		int sign = 0;

		
		// �˻� (���� ���� , �밢�� �ΰ�)
		
//		
		
		for(int j = 0 ; j<11 ; j++) {
			int count=0;
			
			int garo = Board.arr[lastlocX][lastlocY];
			// �浹 = 1 , �鵹 = -1 
			if(garo == 1) {//�浹�϶�
				for(int i = 0 ; i<5 ; i++) {
					
					garo *=Board.arr[i + j][lastlocY];
					count++;
					if(Board.arr[i + j][lastlocY] == -1) { // �鵹�̳����� ��� �ʱ�ȭ
						count =0;
						break;
					}
				
				}
			}
			
			if(garo == -1) {// �鵹�� ��
				for(int i = 0 ; i<5 ; i++) {
					
					garo *=Board.arr[i + j][lastlocY];
					count++;
					if(Board.arr[i + j][lastlocY] == 1) {// �浹�� ������ ��� �ʱ�ȭ
						count = 0;
						break;
					}
				
				}
			}
			
			if(garo==1 && count==5) {// ��� ���� ���� 1�� ������ 5���� ��� �¸����� ����
				
				//���� �̰����
				whoWin();
				sign ++;
				keep = false;
				break;
			}
		}
		
		
		//����
		for(int j = 0 ; j<11 ; j++) {
			int count = 0;
			int sero = Board.arr[lastlocX][lastlocY];
			
			if(sero == 1) {//�浹�϶�
				for(int i = 0 ; i<5 ; i++) {
					
					sero *=Board.arr[lastlocX ][i +j];
					count++;
					if(Board.arr[lastlocX ][i +j] == -1) { // �鵹�̳����� ��� �ʱ�ȭ
						count =0;
						break;
					}
				
				}
			}
			
			
			
			if(sero == -1) {//�浹�϶�
				for(int i = 0 ; i<5 ; i++) {
					
					sero *=Board.arr[lastlocX ][i +j];
					count++;
					if(Board.arr[lastlocX ][i +j] == +1) { // �鵹�̳����� ��� �ʱ�ȭ
						count =0;
						break;
					}
				
				}
			}

			if(sero==1 && count==5) {// ��� ���� ���� 1�� ������ 5���� ��� �¸����� ����
				
				//���� �̰����
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
					
					if(lastlocX + i - j >=0 && lastlocY - i + j>=0 && lastlocX + i - j <15 &&  lastlocY - i + j < 15) {//�𼭸� ó��
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
					
					if(lastlocX + i - j >=0 && lastlocY - i + j>=0 && lastlocX + i - j <15 &&  lastlocY - i + j < 15) {//�𼭸� ó��
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
					
					if(lastlocX - i + j >=0 && lastlocY + i - j>=0 && lastlocX - i + j <15 && lastlocY + i - j < 15) {//�𼭸� ó��
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
					
					if(lastlocX - i + j >=0 && lastlocY + i - j>=0 && lastlocX - i + j <15 && lastlocY + i - j < 15) {//�𼭸� ó��
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
