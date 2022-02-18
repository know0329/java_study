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
		
		System.out.println("학생의 ID : " + studentID);
		System.out.println("학생의 이름 : " + studentName);
		System.out.println("<수강 과목 및 점수>");
		for(int i = 0 ; i < subjectList.size(); i++) {
			System.out.println("과목" + i + " 명: " + subjectList.get(i).getName()
					+ " / " + "점수 : " + subjectList.get(i).getScorePoint());
			
			
		}
	}
	
	
}
