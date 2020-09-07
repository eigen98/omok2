package basictest;

import java.util.ArrayList;
import java.util.Scanner;

public class solution1 {
	public static void main(String[] args) {
		
		
		Student st1 = new Student("손오공", 1682);
		Student st2 = new Student("저팔계", 1682);
		Student st3 = new Student("사오정", 1682);
		
		ArrayList <Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계속 검색으 하고싶으시면 y , 종료 n");
		
		
		
		while(true) {
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다");
				String name = scan.next();
				
				for(Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은"+stu.getNo());
					}
				}
				
				
			}else if(input.equals("n")) {
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
		
	}

	
	

}

class Student{
	
	private String name;
	private int no;
	
	public Student(String name, int no) {
		super();
		this.name=name;
		this.no=no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
	
	
}
