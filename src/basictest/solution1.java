package basictest;

import java.util.ArrayList;
import java.util.Scanner;

public class solution1 {
	public static void main(String[] args) {
		
		
		Student st1 = new Student("�տ���", 1682);
		Student st2 = new Student("���Ȱ�", 1682);
		Student st3 = new Student("�����", 1682);
		
		ArrayList <Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��� �˻��� �ϰ�����ø� y , ���� n");
		
		
		
		while(true) {
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�");
				String name = scan.next();
				
				for(Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й���"+stu.getNo());
					}
				}
				
				
			}else if(input.equals("n")) {
				break;
			}
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
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
