package test;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int H = 0;
	
	int Hnum =0;
	
	int W = 0;
	int Wnum = 0 ;
	
	int N = 0;
	
	Scanner testCase = new Scanner(System.in);
	int TestCase = testCase.nextInt();
	
	Scanner HWN = new Scanner(System.in);
	H = HWN.nextInt();
	W = HWN.nextInt();
	N = HWN.nextInt();
	
	
	int arr[][] = new int[H][W];
	Scanner sc = new Scanner(System.in);
	for(int i =0 ; i <H ; i++) {
		for(int j =0 ; j < W ; j++) {
			arr[i][j] = sc.nextInt();
			
		}
	}
	
	
			
	
	}
}
