package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//N = 3*x + 5*y;
		
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int solNum = 0;
		int arr[] = new int[N];
		int d=0;
		
		outerLoop:
		for (int x= 0 ; x < N; x++) {
//			y= -3*x/5 + N/5;
			for(int y = 0 ; y< N ; y++) {
				if(N%5==0 &3*x + 5*y == N & N<5000 & N >2) {
					//System.out.println("x=0 " + ",y = "+  y);
					solNum ++;
					break outerLoop;
				}
				else if(3*x + 5*y ==N & N<5000 & N >2 ) {
					//System.out.println(x +"," + y );
					//System.out.println( x + y );
					arr[x]= x+y;
					solNum ++;
					d=x;
				}
			}
		}
		
		int min = arr[d];
		for(int i= d ; i>0 ; i--) {
			if(min>arr[i] & arr[i] != 0) {
				min = arr[i] ;
			}
		}
		System.out.println();
		
		
		if(solNum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(min);
		}
		
		

	}
}