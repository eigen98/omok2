package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int []point = new int[3];
		
		Scanner sc = new Scanner(System.in);
		point[0] = sc.nextInt();
		point[1] = sc.nextInt();
		point[2] = sc.nextInt();
		
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("����");
		subject.add("����");
		subject.add("����");
		
		
		
		int gradepoint[] = new int[3];
		
		for(int i =0 ; i<point.length ; i++)
		{
			switch ((int)point[i]/10) {
			
			case 10 :
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� A�Դϴ�.");
				gradepoint[i] = 4;
				break;
			case 9 :
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� A�Դϴ�.");
				gradepoint[i] = 4; //������ ���ϴ°�?
				break;
			case 8 : 
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� B�Դϴ�.");
				gradepoint[i] = 3;
				break;
			case 7 : 
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� C�Դϴ�.");
				gradepoint[i] = 2;
				break;
			case 6 : 
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� C�Դϴ�.");
				gradepoint[i] = 2;
				break;
			case 5 : 
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� F�Դϴ�.");
				gradepoint[i] = 0;
				break;
			default:
				System.out.println("����� "+subject.get(i)+" ������ �Է��ϼ��� " + point[i]);
				System.out.println("�����"+subject.get(i) +" ����� F�Դϴ�.");
				gradepoint[i] = 0;
				break;
			}
			
		}
		
	
		int total =point[0]+point[1]+point[2];
		System.out.println(total/3.0);
		int totalGrade=gradepoint[0]+gradepoint[1]+gradepoint[2];
		System.out.println(totalGrade/3.0);
		
		

	}

}
