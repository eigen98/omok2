package omok;

import java.util.Scanner;

public class Board {
	
	//Ŭ���� ��
			//Board -> has a ����� ����־��� ��Ʈ�Ѽ���
			//Game -> ���⼭�� ����� ī���͸� ���� �� �� (���� ������ �ڵ鸵)
			//PreRules -> 3x3 �ϳ��� ������ 33�ƴ�
			//postRules -> ���� 5�� (���忡 ���� ��)
			//counter -> int cnt =0 getcount(), plusCount()
			//stone -> xloc , yloc -- getter setter getx gety
	
	public static int arr[][] = new int[15][15];
	public static int LOC[] = new int[2];

	
	public void wuziPlay() {// while�� ���ӿ��� �ҷ���
		
		
		Stone one = new Stone();
		Counter.plusCount(); //ī��Ʈ ����
		
		Scanner sc = new Scanner(System.in);
		one.setXloc(sc.nextInt());
		one.setYloc(sc.nextInt());
		
		
		
		if(arr[one.getXloc()-1][one.getYloc()-1]!= 0&&one.getXloc()-1<0&&one.getXloc()-1>14&&one.getYloc()-1<0 && one.getYloc()-1 >14) {
			System.out.println("�� �� ���� ���Դϴ�.");
			Counter.minusCount();
			return;
		}else {
			// ���� ���� �� 
			//���� 0�� �� �浹, 1�� �� �鵹
			if(Counter.getTurn()== 0) {
				arr[one.getXloc()-1][one.getYloc()-1] = 1;
			}else {
				arr[one.getXloc()-1][one.getYloc()-1] = -1;
			}
		}
		
		
		for(int i = 0 ; i < 15 ; i++ ) {
			for(int j = 0 ; j < 15 ; j++) {
				if(Board.arr[i][j]==1) {
					System.out.print("��"+ " ");
				}else if(Board.arr[i][j]==-1) {
					System.out.print("��"+ " ");
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
		//��ǥ ����
		
		LOC[0] = one.getXloc()-1;
		LOC[1] = one.getYloc()-1;
		
		
	}

}


