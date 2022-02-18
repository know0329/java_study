package array;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		
		this.studentID = studentID;
		this.studentName = studentName;	
		subjectList = new ArrayList<Subject>();
	}
	
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		System.out.println("�л��� ID : " + studentID);
		System.out.println("�л��� �̸� : " + studentName);
		System.out.println("<���� ���� �� ����>");
		for(int i = 0 ; i < subjectList.size(); i++) {
			System.out.println("����" + i + " ��: " + subjectList.get(i).getName()
					+ " / " + "���� : " + subjectList.get(i).getScorePoint());
			
			
		}
	}
	
	
}
