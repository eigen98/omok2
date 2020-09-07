package basictest;

import java.util.Scanner;

public class solution4 {
//10진수를 2진수로
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int inputNum = 19;
		int bin[] = new int[100];
		
		int i = 0 ;
		int mok = inputNum;
		
		while(mok>0) {
		
			bin[i] = mok%2;
			mok /= 2;
			i++;
		}
		
		i--;
		for(;i>=0; i--) {
			System.out.println(bin[i]);
		}
		
		
	}

}
