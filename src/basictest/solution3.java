package basictest;

public class solution3 {
//최빈값 구하기
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = new int[14];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 3;
		arr[5] = 1;
		arr[6] = 4;
		arr[7] = 2;
		arr[8] = 2;
		arr[9] = 4;
		arr[10] = 3;
		arr[11] = 5;
		arr[12] = 2;
		arr[13] = 2;
		arr[14] = 6;
		
		int mode[] = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				if(arr[i]==j) {
					mode[j]++;
				}
			}
			
		}
		
		int most;

	}

}
