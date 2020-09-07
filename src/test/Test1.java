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
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		
		
		
		int gradepoint[] = new int[3];
		
		for(int i =0 ; i<point.length ; i++)
		{
			switch ((int)point[i]/10) {
			
			case 10 :
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 A입니다.");
				gradepoint[i] = 4;
				break;
			case 9 :
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 A입니다.");
				gradepoint[i] = 4; //리턴은 왜하는가?
				break;
			case 8 : 
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 B입니다.");
				gradepoint[i] = 3;
				break;
			case 7 : 
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 C입니다.");
				gradepoint[i] = 2;
				break;
			case 6 : 
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 C입니다.");
				gradepoint[i] = 2;
				break;
			case 5 : 
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 F입니다.");
				gradepoint[i] = 0;
				break;
			default:
				System.out.println("당신의 "+subject.get(i)+" 성적을 입력하세요 " + point[i]);
				System.out.println("당신의"+subject.get(i) +" 등급은 F입니다.");
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
