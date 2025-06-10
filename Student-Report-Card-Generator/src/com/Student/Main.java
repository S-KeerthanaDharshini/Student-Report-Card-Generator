package com.Student;

public class Main {

	public static void main(String[] args) {
	Person person = new Person();
	person.setName("keerthana");
	person.setAge(20);
	System.out.println("STUDENT DETAILS");
    person.displayDetails();
    System.out.println();
    
    Student student = new Student(101,"Information Technology");
    System.out.println("DEPARTMENT DETAILS");
    student.displayDetails();
    System.out.println();
    
    Subject subject = new Subject();
    subject.setSubject1("English");
    subject.setSubject2("Tamil");
    subject.setSubject3("Maths");
    subject.setMark1(96);
    subject.setMark2(98);
    subject.setMark3(90);
    
    System.out.println("ACADEMIC SCORES ");
    subject.displaySubjectMarks();
    System.out.println();
    
    ReportCard report = new ReportCard(student,subject);
    report.displayReport();
    
	}

}
